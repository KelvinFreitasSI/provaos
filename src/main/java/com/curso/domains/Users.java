package com.curso.domains;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.curso.domains.enums.DoctorType;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users extends Doctor {

    @OneToMany(mappedBy = "user") // user é o nome do atributo em ServiceOrderHosp
    private List<ServiceOrderHosp> serviceOrdersHosp = new ArrayList<>();

    public Users(UUID id, String firtName, String lastName, String cpf, String email, String password) {
        super(id, firtName, lastName, cpf, email, password);
        addDoctorType(DoctorType.USERS);
       
    }

    public Users(){
        super();
        addDoctorType(DoctorType.USERS);
    }


    public List<ServiceOrderHosp> getServiceOrdersHosp() {
        return serviceOrdersHosp;
    }

    public void setServiceOrdersHosp(List<ServiceOrderHosp> serviceOrdersHosp) {
        this.serviceOrdersHosp = serviceOrdersHosp;
    }
    
}
