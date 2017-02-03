package dauburger.commande.controller;

import dauburger.commande.entity.Plat;
import dauburger.commande.repository.PlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PlatController {

    private PlatService platService;

    @Autowired(required=true)
    @Qualifier(value="personService")
    public void setPersonService(PlatService ps){
        this.platService = ps;
    }

    @RequestMapping(value = "/plats", method = RequestMethod.GET)
    public String listPersons(Model model) {
        model.addAttribute("plat", new Plat());
        model.addAttribute("listPlats", this.platService.findAll());
        return "plat";
    }

    //For add and update person both
    @RequestMapping(value= "/plat/add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("person") Plat p){

        if(p.getId() == 0){
            //new person, add it
            this.platService.add(p);
        }else{
            //existing plat, call update
            this.platService.update(p);
        }

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