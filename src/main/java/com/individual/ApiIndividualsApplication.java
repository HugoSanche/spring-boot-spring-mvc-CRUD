package com.individual;

import com.individual.DAO.IndividualDAO;
import com.individual.entity.Individual;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiIndividualsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiIndividualsApplication.class, args);}

	@Bean
		public CommandLineRunner commandLineRunner (IndividualDAO individualDAO){
			return runner -> {
				//System.out.println("Hello Word");

				findInstructor(individualDAO);
			};
		}

	private void findInstructor(IndividualDAO individualDAO) {
		int theId=1;
		System.out.println("Find individual id: "+theId);
		Individual tempIndividual= individualDAO.findIndividualById(theId);
		System.out.println("tempIndividual "+tempIndividual);
		System.out.println("the associated individual only "+tempIndividual.getCurrency());


	}
}




