package dauburger.commande.repository;

import dauburger.commande.entity.Plat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Alexa on 02/02/2017.
 */
public interface PlatRepository {

    public void add(Plat p);
    public void update(Plat p);
    public List<Plat> findAll();
    public Plat findOneById(int id);
    public void remove(Plat p);

}