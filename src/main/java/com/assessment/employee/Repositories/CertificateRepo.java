package com.assessment.employee.Repositories;


import com.assessment.employee.Entities.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface CertificateRepo extends JpaRepository<Certification, Long> {


}
