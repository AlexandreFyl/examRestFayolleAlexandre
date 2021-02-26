package com.humanbooster.examRestFayolleAlexandre.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marque")
    @NotBlank(message = "La marque ne peut pas etre vide")
    private String marque;

    @Column(name = "modele")
    @NotBlank(message = "Le modele ne peut pas etre vide")
    private String modele;

    @Column(name = "carburant")
    @NotBlank(message = "Le type de carburant ne peut pas etre vide")
    private String carburant;

    @Column(name = "annee")
    @NotNull(message = "L'annee ne peut pas etre vide")
    private Integer annee;

    @Column(name = "kilometrage")
    private Integer kilometrage;

    @Column(name = "prix")
    @NotNull(message = "Le prix ne peut pas etre vide")
    private Integer prix;

    @Column(name = "description")
    @NotBlank(message = "La description ne peut pas etre vide")
    private String description;

    /* ###########################
     Constructeur
    ###########################*/
    public Car(Long id, @NotBlank(message = "La marque ne peut pas etre vide") String marque, @NotBlank(message = "Le modele ne peut pas etre vide") String modele, @NotBlank(message = "Le type de carburant ne peut pas etre vide") String carburant, @NotBlank(message = "L'annee ne peut pas etre vide") Integer annee, Integer kilometrage, @NotBlank(message = "Le prix ne peut pas etre vide") Integer prix, @NotBlank(message = "La description ne peut pas etre vide") String description) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.carburant = carburant;
        this.annee = annee;
        this.kilometrage = kilometrage;
        this.prix = prix;
        this.description = description;
    }

    /* ###########################
         Constructeur vide
     ###########################*/
    public Car() {
    }
    /* ###########################
         Getters / setters
     ###########################*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Integer getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(Integer kilometrage) {
        this.kilometrage = kilometrage;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
