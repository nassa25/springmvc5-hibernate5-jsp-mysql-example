package net.springmvc.gestionbibliotech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.springmvc.gestionbibliotech.service.LecteurService;
import net.springmvc.gestionbibliotech.entity.*;

@Controller
@RequestMapping("/lecteur")
public class LecteurController {
	@Autowired
	private LecteurService lecteurService;
	
	@GetMapping("/liste")
	public String listeLecteur(Model theModel) {
		List < Lecteur > theLecteur = lecteurService.getLecteur();
		theModel.addAttribute("lecteur", theLecteur);
		return "lecteur-liste";
		
	}
	
	@GetMapping("/showForm")
	public String showFormAdd(Model theModel) {
		Lecteur theLecteur = new Lecteur();
		theModel.addAttribute("lecteur", theLecteur);
		return "lecteur-form";
	}
	
	@GetMapping("/saveLecteur")
	public String saveLecteur(@ModelAttribute("lecteur") Lecteur theLecteur) {
		lecteurService.saveLecteur(theLecteur);
		return "redirect:/lecteur/liste";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("lecteurId") int theId, Model theModel) {
		Lecteur theLecteur = lecteurService.getLecteur(theId);
		theModel.addAttribute("lecteur", theLecteur);
		return "lecteur-form";
	}
	@GetMapping("/delete")
	public String deleteLecteur(@RequestParam("lecteurId") int theId) {
		lecteurService.deleteLecteur(theId);
		return "redirect;/lecteur/liste";
	}
	

}
