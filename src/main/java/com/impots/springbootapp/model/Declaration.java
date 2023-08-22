package com.impots.springbootapp.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "declarantion")
@Entity
public class Declaration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_declaration;



    @Column(name="datedeclraration")
    private Date datedeclraration;

    @Column(name="montantdeclaration")
    private Double montantdeclaration;

    //@ManyToMany(fetch = FetchType.EAGER)
    //@JoinTable(name = "declarant_declaration", joinColumns = {@JoinColumn(name = "id_declarant")},
            //inverseJoinColumns = {@JoinColumn(name = "id_declaration")})
    //private List<Declarant> declarants = new ArrayList<Declarant>();


    public long getId_declaration() {
        return id_declaration;
    }

    public void setId_declaration(long id_declaration) {
        this.id_declaration = id_declaration;
    }

    public Date getDatedeclraration() {
        return datedeclraration;
    }

    public void setDatedeclraration(Date datedeclraration) {
        this.datedeclraration = datedeclraration;
    }

    public Double getMontantdeclaration() {
        return montantdeclaration;
    }

    public void setMontantdeclaration(Double montantdeclaration) {
        this.montantdeclaration = montantdeclaration;
    }

    //public List<Declarant> getDeclarants() {
        //return declarants;
    //}

    //public void setDeclarants(List<Declarant> declarants) {
        //this.declarants = declarants;
    //}
}
