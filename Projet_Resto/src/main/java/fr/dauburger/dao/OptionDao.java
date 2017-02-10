package fr.dauburger.dao;

import fr.dauburger.model.Option;
import fr.dauburger.model.Plat;
import java.util.List;

/**
 * Created by Alexa on 02/02/2017.
 */
public interface OptionDao {

    public void save(Option o);
    public List<Option> findAll();
    public Option findOneById(int id);
    public void remove(Option o);

}