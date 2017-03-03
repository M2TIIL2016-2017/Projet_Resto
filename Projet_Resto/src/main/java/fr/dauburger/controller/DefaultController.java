package fr.dauburger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.dauburger.model.Cuisson;

@Controller
@RequestMapping("/")
public class DefaultController {

	 @RequestMapping(value = { "/" , "/accueil", }, method = RequestMethod.GET)
	    public String pageAccueil(ModelMap model) {
		 model.addAttribute("loggedinuser", UserController.getPrincipal());
	        return "/accueil/accueil";
	    }
}
