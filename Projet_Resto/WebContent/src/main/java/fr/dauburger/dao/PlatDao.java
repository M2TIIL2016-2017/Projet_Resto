package fr.dauburger.dao;

import fr.dauburger.model.Plat;
import java.util.List;

/**
 * Created by Alexa on 02/02/2017.
 */
public interface PlatDao {

    public void save(Plat p);
    public List<Plat> findAll();
    public Plat findOneById(int id);
    public void remove(Plat p);

}