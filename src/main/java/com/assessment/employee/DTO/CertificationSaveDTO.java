package com.assessment.employee.DTO;

import com.assessment.employee.Entities.Employee;

public class CertificationSaveDTO {
    private Long certificationId;

    private String certificationName;

    private Employee employee;

    public CertificationSaveDTO(){}
    public CertificationSaveDTO(String certificationName, Employee employee) {
        this.certificationName = certificationName;
        this.employee = employee;
    }

    public Long getCertificationId() {
        return certificationId;
    }

    public void setCertificationId(Long certificationId) {
        this.certificationId = certificationId;
    }

    public String getCertificationName() {
        return certificationName;
    }

    public void setCertificationName(String certificationName) {
        this.certificationName = certificationName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
