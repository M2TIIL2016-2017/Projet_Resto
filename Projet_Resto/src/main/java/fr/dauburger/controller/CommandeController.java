package fr.dauburger.controller;

import fr.dauburger.model.Commande;
import fr.dauburger.service.CommandeService;
import fr.dauburger.utils.Routes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(Routes.commande)
public class CommandeController extends AbstractController {

	@Autowired
    private CommandeService commandeService;
	
    @RequestMapping("")
    public String listCommandes(ModelMap model) {
    	preRender(model); 
    	List<Commande> listCommandes = commandeService.findAll();
        model.addAttribute("commande", new Commande());
        model.addAttribute("listCommandes", listCommandes);
        System.out.println(this.commandeService.findAll());
        return Routes.getRoute("commandelist");
    }

  //For add and update person both
    @RequestMapping(value= Routes.add, method = RequestMethod.GET)
    public String addCommande(ModelMap model){
    	 model.addAttribute("commande", new Commande());
        return Routes.getRoute("commandeadd");

    }
    
    @RequestMapping(value= Routes.add, method = RequestMethod.POST)
    public String addCommande(@ModelAttribute("commande") Commande c){
    
            this.commandeService.save(c);
        return "redirect:" + Routes.commande + "/";

    }

    
    @RequestMapping(value= Routes.del + "/{id}", method = RequestMethod.GET)
    public String removeC(@PathVariable("id") int id){
        Commande c = this.commandeService.findOneById(id);
        
        this.commandeService.remove(c);
        return "redirect:" + Routes.commande;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editCommande(@PathVariable("id") int id, ModelMap model){
    	preRender(model); 
        model.addAttribute("commande", this.commandeService.findOneById(id));
        return Routes.getRoute("commandeedit");
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editCommandePost(@ModelAttribute("commande") Commande c){
        this.commandeService.save(c);
        return "redirect:" + Routes.getRoute("commandelist");
    }
}