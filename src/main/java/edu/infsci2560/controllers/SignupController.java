/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Signup;
import edu.infsci2560.repositories.SignupRepository;
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
public class SignupController {
    @Autowired
    private SignupRepository repository;
    
    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("signup", "signup", repository.findAll());
    }
    
    @RequestMapping(value = "signup/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Signup signup, BindingResult result) {
        repository.save(signup);
        return new ModelAndView("signup", "signup", repository.findAll());
    }
    
}
