package com.assessment.employee.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "working_days")
public class WorkingDays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "working_days_id")
    private Long workingDaysId;

    @Column(name = "total_working_days")
    private int totalWorkingDays;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)

    private Employee employee;

    public WorkingDays(){}

    public WorkingDays(int totalWorkingDays, Employee employee) {
        this.totalWorkingDays = totalWorkingDays;
        this.employee = employee;
    }

    public Long getWorkingDaysId() {
        return workingDaysId;
    }

    public void setWorkingDaysId(Long workingDaysId) {
        this.workingDaysId = workingDaysId;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
