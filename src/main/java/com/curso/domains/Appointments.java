package com.curso.domains;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointments {
    
    @Id //define o atributo identificador da classe
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate appointmentsDate;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime startTime = LocalTime.now();
    private LocalTime endTime;

    @ManyToOne
    @JoinColumn(name = "iddoctor")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "idpatient")
    private Patient patient;
   
    public Appointments() {
    }

    public Appointments(UUID id, LocalDate appointmentsDate, LocalTime startTime, LocalTime endTime, Doctor doctor,
            Patient patient) {
        this.id = id;
        this.appointmentsDate = appointmentsDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.doctor = doctor;
        this.patient = patient;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getAppointmentsDate() {
        return appointmentsDate;
    }

    public void setAppointmentsDate(LocalDate appointmentsDate) {
        this.appointmentsDate = appointmentsDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Appointments other = (Appointments) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}
