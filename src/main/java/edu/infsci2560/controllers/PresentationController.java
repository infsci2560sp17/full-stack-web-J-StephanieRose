/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Presentation;
import edu.infsci2560.repositories.PresentationRepository;
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
public class PresentationController {
    @Autowired
    private PresentationRepository repository;
    
    @RequestMapping(value = "presentation", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("presentation", "presentation", repository.findAll());
 //   }
    
 //   @RequestMapping(value = "reading/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
//    public ModelAndView create(@ModelAttribute @Valid Reading reading, BindingResult result) {
 //       repository.save(reading);
  //      return new ModelAndView("reading", "reading", repository.findAll());
 //   }
    
}
