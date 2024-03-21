package com.curso.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.domains.Doctor;

@Repository
public interface DoctorRepository  extends JpaRepository<Doctor, UUID>{

}
