package fr.dauburger.service;

import fr.dauburger.model.Option;
import fr.dauburger.model.Plat;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
public interface OptionService {
	
    public void save(Option o);
    public List<Option> findAll();
    public Option findOneById(int id);
    public void remove(Option o);
}
