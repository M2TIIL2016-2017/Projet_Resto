package fr.dauburger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="commande_commande")
public class Commande {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idCommande;
	
	@NotEmpty
	@Column(name="idClient", unique=true, nullable=false)
	private String idClient;
    
	@NotEmpty
	@Column(name="date_reglement", nullable=false)
    private String date_reglement;
    
    public String getDate_reglement() {
		return date_reglement;
	}

	public void setDate_reglement(String date_reglement) {
		this.date_reglement = date_reglement;
	}
    
	public Integer getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}
}