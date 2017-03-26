/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Artscrafts;
import edu.infsci2560.repositories.ArtscraftsRepository;
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
public class ArtscraftsController {
    @Autowired
    private ArtscraftsRepository repository;
    
    @RequestMapping(value = "artscrafts", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("artscrafts", "artscrafts", repository.findAll());
    }
    
    @RequestMapping(value = "artscrafts/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Artscrafts artscrafts, BindingResult result) {
        repository.save(artscrafts);
        return new ModelAndView("artscrafts", "artscrafts", repository.findAll());
    }
    
}
