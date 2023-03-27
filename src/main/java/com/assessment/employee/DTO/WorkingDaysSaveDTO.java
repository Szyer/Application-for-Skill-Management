package com.assessment.employee.DTO;

import com.assessment.employee.Entities.Employee;

public class WorkingDaysSaveDTO {
    private Long workingDaysId;

    private int totalWorkingDays;


    private Employee employee;

    public WorkingDaysSaveDTO(){}

    public WorkingDaysSaveDTO(int totalWorkingDays, Employee employee) {
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

    @Override
    public String toString() {
        return "WorkingDaysSaveDTO{" +
                "totalWorkingDays=" + totalWorkingDays +
                ", employee=" + employee +
                '}';
    }
}
