package com.impots.springbootapp.repository.Interfaces;

import com.impots.springbootapp.model.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaiement extends JpaRepository<Paiement, Long> {

    //all crud database methods

}
