package fr.dauburger.service;

import fr.dauburger.model.Cuisson;
import fr.dauburger.model.Plat;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
public interface CuissonService {
	
    public void save(Cuisson p);
    public List<Cuisson> findAll();
    public Cuisson findOneById(int id);
    public void remove(Cuisson p);
}
