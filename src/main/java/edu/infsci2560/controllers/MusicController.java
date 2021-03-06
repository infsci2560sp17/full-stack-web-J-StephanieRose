/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Music;
import edu.infsci2560.repositories.MusicRepository;
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
public class MusicController {
    @Autowired
    private MusicRepository repository;
    
    @RequestMapping(value = "music", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("music", "music", repository.findAll());
    }
    
    @RequestMapping(value = "music/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Music music, BindingResult result) {
        repository.save(music);
        return new ModelAndView("music", "music", repository.findAll());
    }
    
}
