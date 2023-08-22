package com.impots.springbootapp.repository.Interfaces;

import com.impots.springbootapp.model.Declarant;
import com.impots.springbootapp.model.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDeclaration extends JpaRepository<Declaration, Long> {

    //all crud database methods
}
