package com.assessment.employee.Service;

import com.assessment.employee.DTO.CertificationSaveDTO;
import com.assessment.employee.DTO.SkillSaveDTO;
import com.assessment.employee.Entities.Certification;
import com.assessment.employee.Entities.Employee;
import com.assessment.employee.Entities.Skill;
import com.assessment.employee.Repositories.CertificateRepo;
import com.assessment.employee.Repositories.EmployeeRepo;
import com.assessment.employee.Repositories.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CertificateServiceIMPL implements CertificateService {

    @Autowired
    private CertificateRepo certificateRepo;

    @Autowired
    private EmployeeRepo employeeRepo;




    @Override
    public String saveCertification(CertificationSaveDTO certificateSaveDTO) {
        Optional<Employee> employee = employeeRepo.findById(certificateSaveDTO.getEmployee().getEmployee_id());
        Certification certification = new Certification(
                certificateSaveDTO.getCertificationName(),
                employee.get()
        );
        certificateRepo.save(certification);
        return certification.getCertificationName();
    }
}
