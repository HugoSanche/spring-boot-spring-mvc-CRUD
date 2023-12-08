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
		String theId="9C69F5DC-D6DC-48DE-AC12-8A4B5D673C8A";

		System.out.println("Delete the Id "+theId);

		individualDAO.deletedCurrencyById(theId);

		System.out.println("!Done");

	}

	private void findCurrency(IndividualDAO individualDAO) {
		String theId="9C69F5DC-D6DC-48DE-AC12-8A4B5D673C8A";
       Currenci theCurrenci= individualDAO.findCurrencyById(theId);

		System.out.println("The Currency "+theCurrenci);

		System.out.println("The individual "+theCurrenci.getIndividual());

		System.out.println("!Done");
	}

	private void deleteIndividual(IndividualDAO individualDAO) {
		String theId="20101128-E001-0001-0000-000000002006";
		System.out.println("Deleting individual id: "+theId);

		individualDAO.deletedIndividualById(theId);

		System.out.println("!Done");

	}

	private void findIndividual(IndividualDAO individualDAO) {
		String theId="20101128-E001-0001-0000-000000002006";
		System.out.println("Find individual id: "+theId);
		Individual tempIndividual= individualDAO.findIndividualById(theId);
		System.out.println("tempIndividual "+tempIndividual);
		System.out.println("the associated individual only "+tempIndividual.getCurrency());

	}
}




