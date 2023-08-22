package com.impots.springbootapp.model;

import jakarta.persistence.*;




@Table(name = "declarants")
@Entity
public class Declarant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_declarant;

    @Column(name="raisonSociale")
    private String raisonSociale;

    @Column(name="adresse")
    private String adresse;

    @Column(name="email")
    private String email;

    @Column(name="telephone")
    private String telephone;

    public long getId_declarant() {
        return id_declarant;
    }

    public void setId_declarant(long id_declarant) {
        this.id_declarant = id_declarant;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
