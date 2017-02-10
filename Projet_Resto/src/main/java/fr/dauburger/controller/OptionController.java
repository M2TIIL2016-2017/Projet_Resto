package fr.dauburger.controller;

import fr.dauburger.model.Option;
import fr.dauburger.model.Plat;
import fr.dauburger.model.User;
import fr.dauburger.service.OptionService;

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
@RequestMapping("/options")
public class OptionController {

	@Autowired
    private OptionService optionService;
	
    @RequestMapping(value = { "/" , "/options", }, method = RequestMethod.GET)
    public String listPersons(Model model) {
        model.addAttribute("option", new Option());
        model.addAttribute("listOptions", this.optionService.findAll());
        return "option";
    }

    //For add and update person both
    @RequestMapping(value= "/option/add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("option") Option o){
            this.optionService.save(o);
        return "redirect:/options";

    }

    @RequestMapping("/remove/{id}")
    public String removeP(@PathVariable("id") int id){
        Option o = this.optionService.findOneById(id);
        this.optionService.remove(o);
        return "redirect:/options";
    }

    @RequestMapping("/edit/{id}")
    public String editPlat(@PathVariable("id") int id, Model model){
        model.addAttribute("option", this.optionService.findOneById(id));
        model.addAttribute("listOptions", this.optionService.findAll());
        return "option";
    }

}