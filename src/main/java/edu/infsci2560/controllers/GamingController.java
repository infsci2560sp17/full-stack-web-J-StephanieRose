/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Gaming;
import edu.infsci2560.repositories.GamingRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kolobj
 */
@Controller
public class GamingController {
    @Autowired
    private GamingRepository repository;
    
    @RequestMapping(value = "gaming", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("gaming", "gaming", repository.findAll());
    }
    
    @RequestMapping(value = "gaming/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Gaming gaming, BindingResult result) {
        repository.save(gaming);
        return new ModelAndView("gaming", "gaming", repository.findAll());
    }
    
}
