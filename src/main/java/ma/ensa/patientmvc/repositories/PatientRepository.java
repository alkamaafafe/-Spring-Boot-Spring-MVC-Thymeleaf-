package ma.ensa.patientmvc.repositories;


import ma.ensa.patientmvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Page<Patient>(String kw = null, Pageable pageable)
)


    List<Patient> findByNomContains(String keyword, PageRequest of);
}
