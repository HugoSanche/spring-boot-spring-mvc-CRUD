package com.individual.entity;

import jakarta.persistence.*;


@Entity
    @Table(name="currencies")
    public class Currenci {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="currencyid")
        private  int currencyId;


        @Column(name="name")
        private  String name;

        @Column(name="abbreviation")
        private String abbreviation;
        @Column(name="comments")
        private String comments;
        @Column(name="nameinplural")
        private String nameInPlural;
        @Column(name="symbol")
        private String symbol;

        
      //  @OneToOne(mappedBy = "currency", cascade= {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH})
     //   private  Individual individual;

//        @OneToOne(mappedBy = "currency2", cascade= {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH})
//        private  Countries countries;

        public Currenci(String name, String abbreviation, String comments, String nameInPlural, String symbol) {
            this.name = name;
            this.abbreviation = abbreviation;
            this.comments = comments;
            this.nameInPlural = nameInPlural;
            this.symbol = symbol;
        }



        public Currenci() {
        }

//    public Countries getCountries() {
//        return countries;
//    }
//
//    public void setCountries(Countries countries) {
//        this.countries = countries;
//    }

    public int getCurrencyId() {
            return currencyId;
        }

        public String getName() {
            return name;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        public String getComments() {
            return comments;
        }

        public String getNameInPlural() {
            return nameInPlural;
        }

        public String getSymbol() {
            return symbol;
        }


        public void setCurrencyId(int currencyId) {
            this.currencyId = currencyId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public void setNameInPlural(String nameInPlural) {
            this.nameInPlural = nameInPlural;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

//    public Individual getIndividual() {
//        return individual;
//    }
//
//    public void setIndividual(Individual individual) {
//        this.individual = individual;
//    }

    @Override
        public String toString() {
            return "Currenci{" +
                    // "currencyId=" + currencyId +
                    ", name='" + name + '\'' +
                    ", abbreviation='" + abbreviation + '\'' +
                    ", comments='" + comments + '\'' +
                    ", nameInPlural='" + nameInPlural + '\'' +
                    ", symbol='" + symbol + '\'' +
                    '}';
        }
    }


