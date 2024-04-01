package com.curso.domains;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="generaldoctor")
public class GeneralDoctor extends Doctor {
   
    public GeneralDoctor(UUID id, String firtName, String lastName, String cpf, String email, String password) {
        super(id, firtName, lastName, cpf, email, password);
    }
}
