package com.individual.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="individuals")
public class Individual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PersonId")
    int personId;

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
    @Column(name="BirthDate")
    Date birthDate;

    @Column(name="Nacionality")
    String nacionality;
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
    BigDecimal CurrentMonthlyIncome;

    @Column(name="DoesBizActivities")
    int doesBizActivities;

    @Column(name="HiringType")
    String hiringType;
    @Column(name="ExternalEmployeeNumber")
    String externalEmployeeNumber;
    @Column(name="Gender")
    String gender;

    public Individual( String firstName, String middleName, String firstLastName, String secondLastName, String maritalStatus, Date birthDate, String nacionality,
                      int numberOfDependents, String divorceLegalAgreement, String dwellingType, int isDwellingFreeOfEncumbrance, String occupation, Date startDateInCurrentJob,
                      String currentPositionName, BigDecimal currentMonthlyIncome, int doesBizActivities, String hiringType, String externalEmployeeNumber, String gender) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.maritalStatus = maritalStatus;
        this.birthDate = birthDate;
        this.nacionality = nacionality;
        this.numberOfDependents = numberOfDependents;
        this.divorceLegalAgreement = divorceLegalAgreement;
        this.dwellingType = dwellingType;
        this.isDwellingFreeOfEncumbrance = isDwellingFreeOfEncumbrance;
        this.occupation = occupation;
        this.startDateInCurrentJob = startDateInCurrentJob;
        this.currentPositionName = currentPositionName;
        CurrentMonthlyIncome = currentMonthlyIncome;
        this.doesBizActivities = doesBizActivities;
        this.hiringType = hiringType;
        this.externalEmployeeNumber = externalEmployeeNumber;
        this.gender = gender;
    }

    public Individual() {
    }

    public int getPerson() {
        return personId;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public String getNacionality() {
        return nacionality;
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
        return CurrentMonthlyIncome;
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

    public void setPerson(int person) {
        this.personId = person;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
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

    public void setStartDateInCurrentJob(Date startDateInCurrentJob) {
        this.startDateInCurrentJob = startDateInCurrentJob;
    }

    public void setCurrentPositionName(String currentPositionName) {
        this.currentPositionName = currentPositionName;
    }

    public void setCurrentMonthlyIncome(BigDecimal currentMonthlyIncome) {
        CurrentMonthlyIncome = currentMonthlyIncome;
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

    @Override
    public String toString() {
        return "Individual{" +
                "person=" + personId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", firstLastName='" + firstLastName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", birthDate=" + birthDate +
                ", nacionality='" + nacionality + '\'' +
                ", numberOfDependents=" + numberOfDependents +
                ", divorceLegalAgreement='" + divorceLegalAgreement + '\'' +
                ", dwellingType='" + dwellingType + '\'' +
                ", isDwellingFreeOfEncumbrance=" + isDwellingFreeOfEncumbrance +
                ", occupation='" + occupation + '\'' +
                ", startDateInCurrentJob=" + startDateInCurrentJob +
                ", currentPositionName='" + currentPositionName + '\'' +
                ", CurrentMonthlyIncome=" + CurrentMonthlyIncome +
                ", doesBizActivities=" + doesBizActivities +
                ", hiringType='" + hiringType + '\'' +
                ", externalEmployeeNumber='" + externalEmployeeNumber + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
