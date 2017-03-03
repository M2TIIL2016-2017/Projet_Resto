package fr.dauburger.controller;

import fr.dauburger.model.Plat;
import fr.dauburger.model.User;
import fr.dauburger.service.PlatService;
import fr.dauburger.utils.Routes;

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
@RequestMapping(Routes.plat)
public class PlatController extends AbstractController {

	@Autowired
    private PlatService platService;
	
    @RequestMapping("/")
    public String listPlats(ModelMap model) {
    	preRender(model); 
    	List<Plat> listPlats = platService.findAll();
        model.addAttribute("plat", new Plat());
        model.addAttribute("listPlats", listPlats);
        System.out.println(this.platService.findAll());
        return Routes.getRoute("platlist");
    }

  //For add and update person both
    @RequestMapping(value= Routes.add, method = RequestMethod.GET)
    public String addPlat(ModelMap model){
    	 model.addAttribute("plat", new Plat());
        return Routes.getRoute("platadd");

    }
    
    @RequestMapping(value= Routes.add, method = RequestMethod.POST)
    public String addPlat(@ModelAttribute("plat") Plat p){
    
            this.platService.save(p);
        return "redirect:" + Routes.getRoute("platlist");

    }

    
    @RequestMapping(value= Routes.del + "/{id}", method = RequestMethod.GET)
    public String removeP(@PathVariable("id") int id){
        Plat p = this.platService.findOneById(id);
        
        this.platService.remove(p);
        return "redirect:" + Routes.getRoute("platlist");
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editPlat(@PathVariable("id") int id, ModelMap model){
    	preRender(model); 
        model.addAttribute("plat", this.platService.findOneById(id));
        return Routes.getRoute("platedit");
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editPlatPost(@ModelAttribute("plat") Plat p){
        this.platService.save(p);
        return "redirect:" + Routes.getRoute("platlist");
    }

}