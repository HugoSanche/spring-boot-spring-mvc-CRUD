package com.individual.DAO;

import com.individual.entity.Individual;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(path = "members")
public interface IndividualRepository extends JpaRepository<Individual,String> {
    // automatically you have all method:

    // add a method to sort by last name
   //

    //findAll()

    //findById()
    //save
    //deleteById()
}
