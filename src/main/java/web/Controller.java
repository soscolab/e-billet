package web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;

import data.Evenement;
import metier.LoginMetier;

@SpringBootApplication
public class Controller {

	@Autowired
    private LoginMetier metier;
    @RequestMapping("/index") {
    
    // Afficher la liste des evenements 
        public String index(Model model)
        {
        
            model.addAttribute("evenements",metier.findAll());
            return "evenements";
        }
     	
    	
    	
    	
     }