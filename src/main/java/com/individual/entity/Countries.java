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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CurrencyId")
    private Currenci currency2;

    @OneToOne(mappedBy = "country", cascade= {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH})
    // @JoinColumn(name="CurrencyId") //name of class field individual not table
    private  Individual individual;



    public Countries() {
    }

    public Countries(int countryId, String name, String nationality, Individual individual) {
        this.countryId = countryId;
        this.name = name;
        Nationality = nationality;
        this.individual = individual;
    }

    public Currenci getCurrency() {
        return currency2;
    }

    public void setCurrency(Currenci currency) {
        this.currency2 = currency;
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
                ", currency=" + currency2 +
               // ", individual=" + individual +
                '}';
    }
}






