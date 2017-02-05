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
}
