package fr.dauburger.dao;

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
@Repository("PlatDao")
public class PlatDaoImpl extends AbstractDao<Integer, Plat> implements PlatDao {

	static final Logger logger = LoggerFactory.getLogger(PlatDaoImpl.class);
	
    public void save(Plat p) {
    	persist(p);
    }

    @SuppressWarnings("unchecked")
    public List<Plat> findAll() {
    	Criteria criteria = createEntityCriteria().addOrder(Order.asc("nom"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Plat> plats = (List<Plat>) criteria.list();
		
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
        return plats;
    }

    public Plat findOneById(int id) {
    	Plat plat = getByKey(id);
		if(plat!=null){
			Hibernate.initialize(plat.getId());
		}
		return plat;
    }

    public void remove(Plat p) {
		delete(p);
    }

}