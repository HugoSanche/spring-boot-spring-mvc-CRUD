package com.individual.controller;

import com.individual.entity.Individual;
import com.individual.service.IndividualService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/individuals")
public class EmployeeController {
    IndividualService individualService;

    public EmployeeController(IndividualService individualService) {
        this.individualService = individualService;
    }

    //add mapping for list  individuals

    @GetMapping("/list")
    public String listIndividuals(Model theModel){

        //get the individuals from db
        List<Individual> theIndividual=individualService.findAll();

        //add to the spring model
        theModel.addAttribute("individual",theIndividual);

        return "list-individuals";
    }
}



























