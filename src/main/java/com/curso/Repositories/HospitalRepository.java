package com.curso.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.domains.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, UUID> {

}
