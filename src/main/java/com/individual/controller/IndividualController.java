package com.individual.controller;

import com.individual.entity.Currenci;
import com.individual.entity.Individual;
import com.individual.service.IndividualService;
import com.individual.service.CurrenciService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

     System.out.println(currencies);

        // set employee in the model to prepulate the form
        theModel.addAttribute("individual", theIndividual);

        //String listMaritalStatus= theIndividual.getMaritalStatus();
        //List<String> listMaritalStatus= Arrays.asList("Widowed", "Unknown", "Single", "Married", "LivingTogether", "Divorced");

        //List<Integer> listCurrency= Arrays.asList()


       // String currencyId=String.valueOf(theIndividual.getCurrencyId());

      //  System.out.println("The Individual "+theIndividual.getCurrenci2());
        System.out.println("Marital Status "+theIndividual.getMaritalStatus());

//        System.out.println("TEST "+theIndividual.getCurrencyId());
//        System.out.println("Currency "+currencyId);
//        theModel.addAttribute("currency",currencyId);
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
    public String updateIndividual(@ModelAttribute("individual") Individual theIndividual){

        //save the individual
        individualService.update(theIndividual);

        // use a redirect to prevent duplicate submissions
        return "redirect:/individuals/list";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("individualId2") int theId){

        //delete the individual
        individualService.deletedById_X(theId);

        // redirect to the /individual/list
        return "redirect:/individuals/list";
    }
}



























