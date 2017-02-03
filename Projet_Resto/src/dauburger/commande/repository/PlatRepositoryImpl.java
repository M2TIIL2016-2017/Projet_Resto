package dauburger.commande.repository;

import dauburger.commande.entity.Plat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
@Repository
public class PlatRepositoryImpl implements PlatRepository {

    private static final Logger logger = LoggerFactory.getLogger(PlatRepositoryImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public void add(Plat p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Plat saved successfully, Plat Details="+p);
    }

    @Override
    public void update(Plat p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(p);
        logger.info("Person updated successfully, Person Details="+p);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Plat> findAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Plat> platsList = session.createQuery("from Plat").list();
        for(Plat p : platsList){
            logger.info("PlatsList::"+p);
        }
        return platsList;
    }

    @Override
    public Plat findOneById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Plat p = (Plat) session.load(Plat.class, new Integer(id));
        logger.info("Plat loaded successfully, Plat details="+p);
        return p;
    }

    @Override
    public void remove(Plat p) {
        Session session = this.sessionFactory.getCurrentSession();
        if(null != p){
            session.delete(p);
        }
        logger.info("Plat deleted successfully, plat details="+p);
    }

}