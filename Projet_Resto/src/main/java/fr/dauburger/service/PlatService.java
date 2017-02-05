package fr.dauburger.service;

import fr.dauburger.model.Plat;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
public interface PlatService {
	
    public void save(Plat p);
    public List<Plat> findAll();
    public Plat findOneById(int id);
    public void remove(Plat p);
}
