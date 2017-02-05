package fr.dauburger.dao;

import fr.dauburger.model.Plat;
import fr.dauburger.service.PlatService;
import fr.dauburger.dao.PlatDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
@Repository
public class PlatDaoImpl implements PlatDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    public void add(Plat p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
    }

    public void update(Plat p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(p);
    }

    @SuppressWarnings("unchecked")
    public List<Plat> findAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Plat> platsList = session.createQuery("from Plat").list();
        for(Plat p : platsList){
        }
        return platsList;
    }

    public Plat findOneById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Plat p = (Plat) session.load(Plat.class, new Integer(id));
        return p;
    }

    public void remove(Plat p) {
        Session session = this.sessionFactory.getCurrentSession();
        if(null != p){
            session.delete(p);
        }
    }

}