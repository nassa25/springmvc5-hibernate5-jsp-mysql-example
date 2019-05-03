package net.springmvc.gestionbibliotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lecteur")
public class Lecteur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_lecteur")
	private int idLecteur;
	
	@Column(name = "numero_lecteur")
	private String numeroLecteur;
	
	@Column(name = "nom_lecteur")
	private String nomLecteur;

	public Lecteur() {
		
	}

	public int getIdLecteur() {
		return idLecteur;
	}

	public void setIdLecteur(int idLecteur) {
		this.idLecteur = idLecteur;
	}

	public String getNumeroLecteur() {
		return numeroLecteur;
	}

	public void setNumeroLecteur(String numeroLecteur) {
		this.numeroLecteur = numeroLecteur;
	}

	public String getNomLecteur() {
		return nomLecteur;
	}

	public void setNomLecteur(String nomLecteur) {
		this.nomLecteur = nomLecteur;
	}

	@Override
	public String toString() {
		
		return "Lecteur [idLecteur="+ idLecteur +",numeroLecteur="+ numeroLecteur +",nomLecteur="+ nomLecteur +"]";
	}
	
	
	
	
}
