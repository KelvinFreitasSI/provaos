package com.curso.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.Repositories.DoctorRepository;
import com.curso.Repositories.PatientRepository;
import com.curso.domains.GeneralDoctor;
import com.curso.domains.Patient;



@Service
public class DBService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    

    public void initDB() {
       
        GeneralDoctor doctor1 = new GeneralDoctor(null, "Sebastião", "Aparecido", "12345678901", "sebas.tiao@gmail.com", "4321");
        GeneralDoctor doctor2 = new GeneralDoctor(null, "Vicente", "Morais", "12345678902", "vice.mora@gmail.com", "1234");

       
        doctorRepository.save(doctor1);
        doctorRepository.save(doctor2);

       
        Patient patient1 = new Patient(null, "Maria", "Aparecida", "12345678903", "mari.apa@gmail.com", "12");
        Patient patient2 = new Patient(null, "Joana", "Silva", "12345678904", "jo.silva@gmail.com", "20");

       
        patientRepository.save(patient1);
        patientRepository.save(patient2);

       
    }
}



