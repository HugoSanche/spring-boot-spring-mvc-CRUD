package com.individual.controller;

import com.individual.entity.Currenci;
import com.individual.entity.Individual;
import com.individual.service.IndividualService;
import com.individual.service.CurrenciService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/individuals")
public class IndividualController {
    IndividualService individualService;

    CurrenciService currenciService;

    public IndividualController(IndividualService individualService, CurrenciService currenciService) {
        this.individualService = individualService;
        this.currenciService = currenciService;
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

        List<Currenci> currencies=currenciService.findAll();

        theModel.addAttribute("currencies",currencies);

        theModel.addAttribute("individual",theEmployee);

        return "individuals/Add-individual";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("individualId")int theId, Model theModel){

        //get the employee from the service
        Individual theIndividual=individualService.findById(theId);

       List<Currenci> currencies=currenciService.findAll();
       theModel.addAttribute("currencies",currencies);

        // set employee in the model to prepulate the form
        theModel.addAttribute("individual", theIndividual);


        //send over to our form
        return "individuals/Update-individual";
    }

    @PostMapping("/save")
    public String saveIndividual(@ModelAttribute("individual") Individual theIndividual){

        System.out.println("getCurrentMonthlyIncome "+theIndividual.getCurrentMonthlyIncome());
        //save the individual
        individualService.save(theIndividual);

        // use a redirect to prevent duplicate submissions
        return "redirect:/individuals/list";
    }
    @PostMapping("/update")
    public String updateIndividual(@Valid @ModelAttribute("individual") Individual theIndividual,
                                   BindingResult theBindingResult){

    //    @{/individuals/showFormForUpdate(theIndividual.personId})
        //Validate if exists errors in thymeleaf

        //showFormForUpdate?individualId=3871
        //showFormForUpdate?page=3871
        //showFormForUpdate?individualId=3871
        if (theBindingResult.hasErrors()){
            return "individuals/showFormForUpdate?individualId=" + theIndividual.personId;
        }else{
            //save the individual
            individualService.update(theIndividual);
            // use a redirect to prevent duplicate submissions
            return "redirect:/individuals/list";
        }

    }


    @GetMapping("/delete")
    public String delete(@RequestParam("individualId2") int theId){

        //delete the individual
        individualService.deletedById_X(theId);

        // redirect to the /individual/list
        return "redirect:/individuals/list";
    }
}



























