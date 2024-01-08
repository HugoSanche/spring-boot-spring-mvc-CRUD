package com.individual.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;


@Entity
@Table(name="individuals")
public class Individual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PersonId")
   public int personId;

    @Column(name="FirstName")
    String firstName;

    @Column(name = "MiddleName")
    String middleName;
    @Column(name="FirstLastName")
    String firstLastName;
    @Column(name="SecondLastName")
    String secondLastName;
    @Column(name="MaritalStatus")
    String maritalStatus;

//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @Column(name="BirthDate")
//    OffsetDateTime birthDate;

    @Column(name="Nacionality")
    int nationality;
    @Column(name="NumberOfDependents")
    int numberOfDependents;

    @Column(name="DivorceLegalAgreement")
    String divorceLegalAgreement;

    @Column(name="DwellingType")
    String dwellingType;

    @Column(name="IsDwellingFreeOfEncumbrance")
    int isDwellingFreeOfEncumbrance;

    @Column(name="Occupation")
    String occupation;

    @Column(name="StartDateInCurrentJob")
    Date startDateInCurrentJob;

    @Column(name="CurrentPositionName")
    String currentPositionName;

    @Column(name="CurrentMonthlyIncome")
    BigDecimal currentMonthlyIncome;

    @Column(name="DoesBizActivities")
    int doesBizActivities;

    @Column(name="HiringType")
    String hiringType;
    @Column(name="ExternalEmployeeNumber")
    String externalEmployeeNumber;
    @Column(name="Gender")
    String gender;

    @OneToOne(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name="CurrencyId")
    private Currenci currency;



    @OneToOne(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
   // @PrimaryKeyJoinColumn(name="BirthCountryId")
    @JoinColumn(name="BirthCountryId")
    //  @Column(name="BirthCountryId")
    private Countries countries;



    public Individual(int personId, String firstName, String middleName, String firstLastName, String secondLastName, String maritalStatus, int nationality, int numberOfDependents, String divorceLegalAgreement, String dwellingType, int isDwellingFreeOfEncumbrance, String occupation, Date startDateInCurrentJob, String currentPositionName, BigDecimal currentMonthlyIncome, int doesBizActivities, String hiringType, String externalEmployeeNumber, String gender, Currenci currency, Countries country) {
        this.personId = personId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.maritalStatus = maritalStatus;
     //  BirthCountryId = birthCountryId;
        this.nationality = nationality;
        this.numberOfDependents = numberOfDependents;
        this.divorceLegalAgreement = divorceLegalAgreement;
        this.dwellingType = dwellingType;
        this.isDwellingFreeOfEncumbrance = isDwellingFreeOfEncumbrance;
        this.occupation = occupation;
        this.startDateInCurrentJob = startDateInCurrentJob;
        this.currentPositionName = currentPositionName;
        this.currentMonthlyIncome = currentMonthlyIncome;
        this.doesBizActivities = doesBizActivities;
        this.hiringType = hiringType;
        this.externalEmployeeNumber = externalEmployeeNumber;
        this.gender = gender;
        this.currency = currency;

    }

    public Individual() {
    }





    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }



//    public OffsetDateTime getBirthDate() {
//        System.out.println(birthDate);
//        return birthDate;
//    }


    public int getNacionality() {
        return nationality;
    }

    public int getNumberOfDependents() {
        return numberOfDependents;
    }

    public String getDivorceLegalAgreement() {
        return divorceLegalAgreement;
    }

    public String getDwellingType() {
        return dwellingType;
    }

    public int getIsDwellingFreeOfEncumbrance() {
        return isDwellingFreeOfEncumbrance;
    }

    public String getOccupation() {
        return occupation;
    }

    public Date getStartDateInCurrentJob() {
        return startDateInCurrentJob;
    }

    public String getCurrentPositionName() {
        return currentPositionName;
    }

    public BigDecimal getCurrentMonthlyIncome() {
        return currentMonthlyIncome;
    }

    public int getDoesBizActivities() {
        return doesBizActivities;
    }

    public String getHiringType() {
        return hiringType;
    }

    public String getExternalEmployeeNumber() {
        return externalEmployeeNumber;
    }

    public String getGender() {
        return gender;
    }
    public int getNationality() {
        return nationality;
    }

    public Currenci getCurrency() {
        return currency;
    }
//    public Countries getCountry() {
//        return country;
//    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        System.out.println("First Name : "+this.firstName);
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

//    public void setBirthDate(OffsetDateTime birthDate)  {
//        System.out.println(birthDate);
//        this.birthDate = birthDate;
//    }

    public void setNacionality(int nacionality) {
        this.nationality = nacionality;
    }

    public void setNumberOfDependents(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }

    public void setDivorceLegalAgreement(String divorceLegalAgreement) {
        this.divorceLegalAgreement = divorceLegalAgreement;
    }

    public void setDwellingType(String dwellingType) {
        this.dwellingType = dwellingType;
    }

    public void setIsDwellingFreeOfEncumbrance(int isDwellingFreeOfEncumbrance) {
        this.isDwellingFreeOfEncumbrance = isDwellingFreeOfEncumbrance;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

//    public void setStartDateInCurrentJob(Date startDateInCurrentJob) throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("dd/MM/yyyy");
//
//        this.startDateInCurrentJob = simpleDateFormat.parse(String.valueOf(startDateInCurrentJob));
//    }

    public void setStartDateInCurrentJob(Date startDateInCurrentJob) {
        this.startDateInCurrentJob = startDateInCurrentJob;
    }

    public void setCurrentPositionName(String currentPositionName) {
        this.currentPositionName = currentPositionName;
    }

    public void setCurrentMonthlyIncome(BigDecimal currentMonthlyIncome) {
        currentMonthlyIncome = currentMonthlyIncome;
    }

    public void setDoesBizActivities(int doesBizActivities) {
        this.doesBizActivities = doesBizActivities;
    }

    public void setHiringType(String hiringType) {
        this.hiringType = hiringType;
    }

    public void setExternalEmployeeNumber(String externalEmployeeNumber) {
        this.externalEmployeeNumber = externalEmployeeNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(int nationality) {
        this.nationality = nationality;
    }

    public void setCurrency(Currenci currency) {
        this.currency = currency;
    }

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    //    public void setCountry(Countries country) {
//        this.country = country;
//    }
    @Override
    public String toString() {
        return "Individual{" +
                "person=" + personId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", firstLastName='" + firstLastName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                //", birthDate=" + birthDate +
                ", nacionality='" + nationality + '\'' +
                ", numberOfDependents=" + numberOfDependents +
                ", divorceLegalAgreement='" + divorceLegalAgreement + '\'' +
                ", dwellingType='" + dwellingType + '\'' +
                ", isDwellingFreeOfEncumbrance=" + isDwellingFreeOfEncumbrance +
                ", occupation='" + occupation + '\'' +
                ", startDateInCurrentJob=" + startDateInCurrentJob +
                ", currentPositionName='" + currentPositionName + '\'' +
                ", CurrentMonthlyIncome=" + currentMonthlyIncome +
                ", doesBizActivities=" + doesBizActivities +
                ", hiringType='" + hiringType + '\'' +
                ", externalEmployeeNumber='" + externalEmployeeNumber + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
