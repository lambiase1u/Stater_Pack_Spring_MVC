package com.crunchify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crunchify.models.Groupe;

@Controller
public class Affichage {  

	private Groupe groupe;	
	
	public Groupe  getGroupe(){
		return this.groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
	
	@RequestMapping(value = "/afficher", method = RequestMethod.GET)
	public ModelAndView handleRequest(){
		
		return new ModelAndView("vuemembres", "groupe", this.groupe);
		
	}
	
	
	
}
