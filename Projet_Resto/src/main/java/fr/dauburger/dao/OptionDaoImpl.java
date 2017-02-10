package fr.dauburger.dao;

import fr.dauburger.model.Option;
import fr.dauburger.model.User;
import fr.dauburger.service.OptionService;
import fr.dauburger.dao.OptionDao;

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
@Repository("OptionDao")
public class OptionDaoImpl extends AbstractDao<Integer, Option> implements OptionDao {

	static final Logger logger = LoggerFactory.getLogger(OptionDaoImpl.class);
	
    public void save(Option o) {
    	persist(o);
    }

    @SuppressWarnings("unchecked")
    public List<Option> findAll() {
    	Criteria criteria = createEntityCriteria().addOrder(Order.asc("nom"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Option> options = (List<Option>) criteria.list();
		
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
        return options;
    }

    public Option findOneById(int id) {
    	Option option = getByKey(id);
		if(option!=null){
			Hibernate.initialize(option.getId());
		}
		return option;
    }

    public void remove(Option o) {
		delete(o);
    }

}