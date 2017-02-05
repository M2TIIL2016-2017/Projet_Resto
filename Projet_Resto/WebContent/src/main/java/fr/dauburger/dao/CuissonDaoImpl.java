package fr.dauburger.dao;

import fr.dauburger.model.Cuisson;
import fr.dauburger.model.Plat;
import fr.dauburger.model.User;
import fr.dauburger.service.PlatService;
import fr.dauburger.dao.PlatDao;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
@Repository("CuissonDao")
public class CuissonDaoImpl extends AbstractDao<Integer, Cuisson> implements CuissonDao {

	static final Logger logger = LoggerFactory.getLogger(CuissonDaoImpl.class);
	
    public void save(Cuisson c) {
    	persist(c);
    }

    @SuppressWarnings("unchecked")
    public List<Cuisson> findAll() {
    	Criteria criteria = createEntityCriteria().addOrder(Order.asc("nom"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Cuisson> cuissons = (List<Cuisson>) criteria.list();
		
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
        return cuissons;
    }

    public Cuisson findOneById(int id) {
    	Cuisson uneCuisson = getByKey(id);
		if(uneCuisson!=null){
			Hibernate.initialize(uneCuisson.getId());
		}
		return uneCuisson;
    }

    public void remove(Cuisson c) {
		delete(c);
    }


}