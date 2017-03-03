package fr.dauburger.model;

import javax.persistence.*;

/**
 * Created by Zboubtilar on 02/02/2017.
 */
@Entity
@Table(name="commande_plat")
public class Plat {

    @Column
    private String nom;

    @Column
    private String detailFiche;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;


    public String getDetailFiche() {
        return detailFiche;
    }

    public void setDetailFiche(String detailFiche) {
        this.detailFiche = detailFiche;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
