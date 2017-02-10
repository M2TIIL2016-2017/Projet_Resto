package fr.dauburger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Zboubtilar on 02/02/2017.
 */
@Entity
@Table(name="commande_option")
public class Option {

    @Id
    private Integer id;
    @Column
    private String nom;
    @Column
    private float prix;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
    
    
}
