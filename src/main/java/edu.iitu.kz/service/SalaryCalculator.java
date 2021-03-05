package edu.iitu.kz.service;

import edu.iitu.kz.entity.ComissionEmployees;
import edu.iitu.kz.entity.Employee;
import edu.iitu.kz.entity.HourlyEmployee;
import edu.iitu.kz.entity.SalaryEmployees;
import org.springframework.stereotype.Component;

@Component
public class SalaryCalculator {
    public Employee salaryCalculate(HourlyEmployee employee){
       int updSalary;
       if(employee.getHourWork() > 40){
           updSalary = (int) (40 * employee.getSalaryWork() + (employee.getHourWork() - 40 ) * 1.5 *employee.getSalaryWork());
       }
       else {
           updSalary = employee.getHourWork() * employee.getSalaryWork();
       }
       return employee;
    }
    public Employee salaryCalculate(ComissionEmployees employee, int amount){
        Double bonus = amount * employee.getPercent() / 100;
        employee.setSalary((int) (employee.getSalary() + bonus));

        return employee;

    }

    public Employee salaryCalculate(SalaryEmployees employee, int amount){
        Double bonus = amount * employee.getPercent() / 100;
        employee.setAmount(employee.getAmount() + bonus);

        return employee;
    }
}
