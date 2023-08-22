package com.impots.springbootapp.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Table(name = "paiement")
@Entity
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_paiement;

    @Column(name="datepaiement")
    private Date datepaiement;

    @Column(name="montantpaiement")
    private Double montantpaiement;

    //@ManyToMany(fetch = FetchType.EAGER)
    //@JoinTable(name = "paiement_declaration", joinColumns = {@JoinColumn(name = "id_paiement")},
    //inverseJoinColumns = {@JoinColumn(name = "id_declaration")})
    //private List<Declaration> declarations = new ArrayList<Declaration>();
}
