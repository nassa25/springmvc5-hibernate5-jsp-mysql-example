package net.springmvc.gestionbibliotech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.springmvc.gestionbibliotech.dao.LecteurDAO;
import net.springmvc.gestionbibliotech.entity.Lecteur;

@Service
public class LecteurServiceImpl implements LecteurService {
	
	@Autowired
	private LecteurDAO lecteurDAO;
	
	@Transactional
	public List<Lecteur> getLecteur() {
		
		return lecteurDAO.getLecteurs();
	}
	
	@Transactional
	public void saveLecteur(Lecteur theLecteur) {
		lecteurDAO.saveLecteur(theLecteur);
		
	}
	
	@Transactional
	public Lecteur getLecteur(int theId) {
		return lecteurDAO.getLecteur(theId);
	}

	@Transactional
	public void deleteLecteur(int theId) {
		lecteurDAO.deleteLecteur(theId);
		
	}

}
