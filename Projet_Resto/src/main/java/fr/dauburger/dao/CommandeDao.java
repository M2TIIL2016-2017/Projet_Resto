package fr.dauburger.dao;

import fr.dauburger.model.Commande;
import java.util.List;

/**
 * Created by Alexa on 02/02/2017.
 */
public interface CommandeDao {
    public void save(Commande c);
    public List<Commande> findAll();
    public Commande findOneById(int id);
    public void remove(Commande c);
}