package com.individual.controller;

import com.individual.entity.Individual;
import com.individual.service.IndividualService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/individuals")
public class IndividualController {
    IndividualService individualService;

    public IndividualController(IndividualService individualService) {
        this.individualService = individualService;
    }

    //add mapping for list  individuals

    @GetMapping("/list")
    public String listIndividuals(Model theModel){

        //get the individuals from db
        List<Individual> theIndividual=individualService.findAll();

        //add to the spring model
        theModel.addAttribute("individuals",theIndividual);

        return "individuals/list-individuals";
    }
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){

        // create model attribute to bind form data
        Individual theEmployee =new Individual();
        theModel.addAttribute("individual",theEmployee);
        return "individuals/individual-form";
    }

    @PostMapping("/save")
    public String saveIndividual(@ModelAttribute("individual") Individual theIndividual){

        //save the individual
        individualService.save(theIndividual);

        // use a redirect to prevent duplicate submissions
        return "redirect:/individuals/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("individualId")int theId, Model theModel){

        //get the employee from the service
        Individual theIndividual=individualService.findById(theId);

        // set employee in the model to prepulate the form
        theModel.addAttribute("individual", theIndividual);

        //send over to our form
        return "individuals/individual-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("individualId2") int theId){

        //delete the individual
        individualService.deletedById(theId);

        // redirect to the /individual/list
        return "redirect:/individuals/list";
    }
}



























