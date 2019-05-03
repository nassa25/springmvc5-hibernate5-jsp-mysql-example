package net.springmvc.gestionbibliotech.dao;

import java.util.List;

import net.springmvc.gestionbibliotech.entity.Lecteur;

public interface LecteurDAO {
	public List <Lecteur> getLecteurs();
	public void saveLecteur(Lecteur theLecteur);
	public Lecteur getLecteur(int theId);
	public void deleteLecteur(int theId);
}
