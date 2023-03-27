package com.assessment.employee.Repositories;

import com.assessment.employee.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository

public interface EmployeeRepo extends JpaRepository<Employee, Long> {



}
