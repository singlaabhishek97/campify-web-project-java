package com.web.project.java.campify.campifywebprojectjava.camp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CampsController {

    @Autowired
    private CampDaoService service;

    @GetMapping("/home")
    public ModelAndView landing(Model model) {

        return new ModelAndView("index");
    }

    @GetMapping("/campgrounds")
    public ModelAndView retrieveAllCamps() {
        ModelAndView model = new ModelAndView("/campgrounds");
        List<Campground> std = service.findAll();
        model.addObject("camps", std);
        return model;
    }

    @GetMapping("/campgrounds/{id}")
    public ModelAndView showCamp(@PathVariable int id) {
        ModelAndView model = new ModelAndView("/show");
        model.addObject("camp", service.findAll().get(id));
        return model;
    }

    @GetMapping("/campgrounds/new")
    public ModelAndView newCamp() {
        return new ModelAndView("new");
    }

    @PostMapping("/campgrounds")
    public ModelAndView createCamp(String name, String src) {
        Campground savedCamp = service.save(new Campground(name, src));
        return retrieveAllCamps();
    }

}
