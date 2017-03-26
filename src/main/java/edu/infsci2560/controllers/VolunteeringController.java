/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Volunteering;
import edu.infsci2560.repositories.VolunteeringRepository;
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
public class VolunteeringController {
    @Autowired
    private VolunteeringRepository repository;
    
    @RequestMapping(value = "volunteering", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("volunteering", "volunteering", repository.findAll());
    }
    
    @RequestMapping(value = "volunteering/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Volunteering volunteering, BindingResult result) {
        repository.save(volunteering);
        return new ModelAndView("volunteering", "volunteering", repository.findAll());
    }
    
}
