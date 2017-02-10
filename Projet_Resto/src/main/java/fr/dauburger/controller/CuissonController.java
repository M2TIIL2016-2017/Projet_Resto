package fr.dauburger.controller;

import fr.dauburger.model.Cuisson;
import fr.dauburger.model.User;
import fr.dauburger.service.CuissonService;

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
@RequestMapping("/cuissons")
public class CuissonController {

	@Autowired
    private CuissonService cuissonService;
	
    @RequestMapping(value = { "/" , "/cuissons", }, method = RequestMethod.GET)
    public String listPerson(Model model) {
        model.addAttribute("cuisson", new Cuisson());
        model.addAttribute("listCuissons", this.cuissonService.findAll());
        return "cuisson";
    }

    //For add and update person both
    @RequestMapping(value= "/cuisson/add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("cuisson") Cuisson p){
            this.cuissonService.save(p);
        return "redirect:/cuissons";

    }

    @RequestMapping("/remove/{id}")
    public String removeP(@PathVariable("id") int id){
        Cuisson p = this.cuissonService.findOneById(id);
        this.cuissonService.remove(p);
        return "redirect:/cuissons";
    }

    @RequestMapping("/edit/{id}")
    public String editCuisson(@PathVariable("id") int id, Model model){
        model.addAttribute("cuisson", this.cuissonService.findOneById(id));
        model.addAttribute("listCuissons", this.cuissonService.findAll());
        return "cuisson";
    }

}