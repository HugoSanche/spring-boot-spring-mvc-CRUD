package com.individual;

import com.individual.DAO.IndividualDAO;
import com.individual.entity.Currenci;
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

				//findInstructor(individualDAO);
				//deleteInstructor(individualDAO);

				//findCurrency(individualDAO);

				deleteCurrency(individualDAO);
			};
		}

	private void deleteCurrency(IndividualDAO individualDAO) {
		int theId=1;

		System.out.println("Delete the Id "+theId);

		individualDAO.deletedCurrencyById(theId);

		System.out.println("!Done");

	}

	private void findCurrency(IndividualDAO individualDAO) {
		int theId=1;
       Currenci theCurrenci= individualDAO.findCurrencyById(theId);

		System.out.println("The Currency "+theCurrenci);

		System.out.println("The individual "+theCurrenci.getIndividual());

		System.out.println("!Done");
	}

	private void deleteIndividual(IndividualDAO individualDAO) {
		int theId=1;
		System.out.println("Deleting individual id: "+theId);

		individualDAO.deletedIndividualById(theId);

		System.out.println("!Done");

	}

	private void findIndividual(IndividualDAO individualDAO) {
		int theId=1;
		System.out.println("Find individual id: "+theId);
		Individual tempIndividual= individualDAO.findIndividualById(theId);
		System.out.println("tempIndividual "+tempIndividual);
		System.out.println("the associated individual only "+tempIndividual.getCurrency());

	}
}




