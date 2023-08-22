package com.impots.springbootapp.controller;


import com.impots.springbootapp.model.Declarant;
import com.impots.springbootapp.repository.Interfaces.IDeclarant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController//cette annotation permet au controller devenir un Spring mvs rest controller
@RequestMapping("/api/declarants")
public class DeclarantController extends SpringBootServletInitializer {

    @Autowired
    private IDeclarant iDeclarant;

    //LA LISTE DES DECLARANTS avec API
    @GetMapping
    public List<Declarant> getAllDeclarant(){
        return iDeclarant.findAll();

    }

    //CREATION D'UN DECLARANT AVEC API REST
    @PostMapping
    public Declarant createDeclarant (@RequestBody Declarant declarant){
        return iDeclarant.save(declarant);
    }


}
