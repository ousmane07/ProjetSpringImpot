package com.impots.springbootapp.controller;


import com.impots.springbootapp.model.Declaration;
import com.impots.springbootapp.repository.Interfaces.IDeclaration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//cette annotation permet au controller devenir un Spring mvs rest controller
@RequestMapping("/api/declarations")
public class DeclarationController {

    @Autowired
    private IDeclaration iDeclaration;

    //LA LISTE DES DECLARAtTION avec API
    @GetMapping
    public List<Declaration> getAllDeclaration(){
        return iDeclaration.findAll();

    }

    //CREATION D'UN DECLARANT AVEC API REST
    @PostMapping
    public Declaration createDeclaration (@RequestBody Declaration declaration){
        return iDeclaration.save(declaration);
    }
}
