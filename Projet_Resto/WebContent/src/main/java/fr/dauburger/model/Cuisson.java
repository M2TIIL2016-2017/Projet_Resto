package fr.dauburger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Zboubtilar on 02/02/2017.
 */
@Entity
@Table(name="commande_cuisson")
public class Cuisson {

    @Id
    private Integer id;
    @Column
    private String nom;
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
