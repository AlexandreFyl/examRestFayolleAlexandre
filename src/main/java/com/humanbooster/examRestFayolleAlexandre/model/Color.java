package com.humanbooster.examRestFayolleAlexandre.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codeRgb")
    @NotBlank(message = "Le code couleur ne peut pas etre vide")
    private String codeRgb;

    @Column(name = "libelle")
    @NotBlank(message = "Le libelle de la couleur ne peut pas etre vide")
    private String libelle;

    /* ###########################
     Constructeur
    ###########################*/

    public Color(Long id, @NotBlank(message = "Le code couleur ne peut pas etre vide") String codeRgb, @NotBlank(message = "Le libelle de la couleur ne peut pas etre vide") String libelle) {
        this.id = id;
        this.codeRgb = codeRgb;
        this.libelle = libelle;
    }

    /* ###########################
         Constructeur vide
     ###########################*/

    public Color() {
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

    public String getCodeRgb() {
        return codeRgb;
    }

    public void setCodeRgb(String codeRgb) {
        this.codeRgb = codeRgb;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
