package fr.dauburger.controller;

import org.springframework.ui.ModelMap;

import fr.dauburger.utils.Routes;

public abstract class AbstractController {

	    protected void preRender(ModelMap model) {
	        model.addAttribute("routes", Routes.getRoutes()); 
	    }

	}
