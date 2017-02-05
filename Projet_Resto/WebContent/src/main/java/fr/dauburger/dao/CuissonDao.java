package fr.dauburger.dao;

import fr.dauburger.model.Cuisson;
import fr.dauburger.model.Plat;
import java.util.List;

/**
 * Created by Alexa on 02/02/2017.
 */
public interface CuissonDao {

    public void save(Cuisson p);
    public List<Cuisson> findAll();
    public Cuisson findOneById(int id);
    public void remove(Cuisson p);

}