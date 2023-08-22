package com.impots.springbootapp.repository.Interfaces;

import com.impots.springbootapp.model.Declarant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IDeclarant extends JpaRepository <Declarant, Long> {

    //all crud database methods
}
