package com.curso.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.domains.Appointments;

@Repository
public interface AppointMentsRepository extends JpaRepository<Appointments, UUID>{

}
