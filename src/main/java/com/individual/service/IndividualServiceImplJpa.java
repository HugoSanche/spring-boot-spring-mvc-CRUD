package com.individual.service;

import com.individual.DAO.IndividualRepository;
import com.individual.entity.Individual;

import java.util.List;
import java.util.Optional;

public class IndividualServiceImplJpa implements IndividualService {

    private IndividualRepository individualRepository;

    public IndividualServiceImplJpa(IndividualRepository individualRepository) {
        this.individualRepository = individualRepository;
    }

    @Override
    public List<Individual> findAll() {
        return individualRepository.findAll();
    }

    @Override
    public Individual findById(String theId) {
        Optional<Individual> result = individualRepository.findById(theId);

        Individual theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theEmployee;
    }

    @Override
    public void save(Individual theEmployee) {
        individualRepository.save(theEmployee);
    }

    @Override
    public void deletedById(String theId) {
        individualRepository.deleteById(theId);
    }

}