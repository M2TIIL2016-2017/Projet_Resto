package fr.dauburger.controller;

import fr.dauburger.model.Plat;
import fr.dauburger.model.User;
import fr.dauburger.service.PlatService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/plats")
public class PlatController {

	@Autowired
    private PlatService platService;
	
    @RequestMapping(value = { "/" , "/plats", }, method = RequestMethod.GET)
    public String listPersons(Model model) {
        model.addAttribute("plat", new Plat());
        model.addAttribute("listPlats", this.platService.findAll());
        return "plat/plat";
    }

    //For add and update person both
    @RequestMapping(value= "/plat/add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("plat") Plat p){
            this.platService.save(p);
        return "redirect:/plats";

    }

    @RequestMapping("/remove/{id}")
    public String removeP(@PathVariable("id") int id){
        Plat p = this.platService.findOneById(id);
        this.platService.remove(p);
        return "redirect:/plats";
    }

    @RequestMapping("/edit/{id}")
    public String editPlat(@PathVariable("id") int id, Model model){
        model.addAttribute("plat", this.platService.findOneById(id));
        model.addAttribute("listPlats", this.platService.findAll());
        return "plat";
    }

}