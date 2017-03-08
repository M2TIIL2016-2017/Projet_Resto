package fr.dauburger.dao;

import fr.dauburger.model.Commande;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
@Repository("CommandeDao")
public class CommandeDaoImpl extends AbstractDao<Integer, Commande> implements CommandeDao {
	static final Logger logger = LoggerFactory.getLogger(CommandeDaoImpl.class);
	
    public void save(Commande c) {
    	persist(c);
    }

    @SuppressWarnings("unchecked")
    public List<Commande> findAll() {
    	Criteria criteria = createEntityCriteria().addOrder(Order.asc("idCommande"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Commande> commandes = (List<Commande>) criteria.list();
        return commandes;
    }

    public Commande findOneById(int id) {
    	Commande commande = getByKey(id);
		if(commande!=null){
			Hibernate.initialize(commande.getIdCommande());
		}
		return commande;
    }

    public void remove(Commande c) {
		delete(c);
    }
}