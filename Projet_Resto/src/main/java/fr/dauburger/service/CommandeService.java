package fr.dauburger.service;

import fr.dauburger.model.Commande;

import java.util.List;

/**
 * Created by Zboubtilar on 03/02/2017.
 */
public interface CommandeService {
    public void save(Commande c);
    public List<Commande> findAll();
    public Commande findOneById(int id);
    public void remove(Commande c);
}