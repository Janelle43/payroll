package edu.iitu.kz.event;
import edu.iitu.kz.entity.Employee;
import org.springframework.context.ApplicationEvent;

public class SalaryChangeEvent extends ApplicationEvent {
    private Employee employee;
    private Double oldSalary;
    public SalaryChangeEvent(Object source) {
        super(source);
        this.employee = employee;
        this.oldSalary = oldSalary;
    }
}
