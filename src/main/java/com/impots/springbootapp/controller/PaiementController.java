package com.impots.springbootapp.controller;


import com.impots.springbootapp.model.Declaration;
import com.impots.springbootapp.model.Paiement;
import com.impots.springbootapp.repository.Interfaces.IDeclaration;
import com.impots.springbootapp.repository.Interfaces.IPaiement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//cette annotation permet au controller devenir un Spring mvs rest controller
@RequestMapping("/api/paiements")
public class PaiementController {

    @Autowired
    private IPaiement iPaiement;

    //LA LISTE DES PAIEMENTS avec API
    @GetMapping
    public List<Paiement> getAllPaiement(){
        return iPaiement.findAll();

    }

    //CREATION D'UN PAIEMENT AVEC API REST
    @PostMapping
    public Paiement createPaiement (@RequestBody Paiement paiement){
        return iPaiement.save(paiement);
    }


}
