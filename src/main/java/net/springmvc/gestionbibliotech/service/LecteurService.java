package net.springmvc.gestionbibliotech.service;

import java.util.List;

import net.springmvc.gestionbibliotech.entity.Lecteur;

public interface LecteurService {
	public List <Lecteur> getLecteur();
	public void saveLecteur(Lecteur theLecteur);
	public Lecteur getLecteur(int theId);
	public void deleteLecteur(int theId);
	
}
