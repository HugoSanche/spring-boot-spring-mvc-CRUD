package com.individual.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="countryId")
    private  int countryId;




    @Column(name="Name")
    private String name;

    @Column(name="Nationality")
    private String Nationality;

    @Column(name="CurrencyId")
    private int currency;

    @OneToOne(mappedBy = "country", cascade= {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH})
    // @JoinColumn(name="CurrencyId") //name of class field individual not table
    private  Individual individual;

    public Countries() {
    }

    public Countries(int countryId, String name, String nationality, int currency, Individual individual) {
        this.countryId = countryId;
        this.name = name;
        Nationality = nationality;
        this.currency = currency;
        this.individual = individual;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public int getcountryId() {
        return countryId;
    }

    public void setCurrencyId(int countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

//    public Individual getIndividual() {
//        return individual;
//    }

//    public void setIndividual(Individual individual) {
//        this.individual = individual;
//    }

    @Override
    public String toString() {
        return "Countries{" +
                "countryId=" + countryId +
                ", name='" + name + '\'' +
                ", Nationality='" + Nationality + '\'' +
                ", currency=" + currency +
               // ", individual=" + individual +
                '}';
    }
}






