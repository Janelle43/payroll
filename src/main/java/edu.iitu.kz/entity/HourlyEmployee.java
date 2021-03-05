package edu.iitu.kz.entity;

public class HourlyEmployee extends Employee {
    private int hourWork;
    private int salaryWork;

    public int getHourWork() {
        return hourWork;
    }

    public void setHourWork(int hourWork) {
        this.hourWork = hourWork;
    }

    public int getSalaryWork() {
        return salaryWork;
    }

    public void setSalaryWork(int salaryWork) {
        this.salaryWork = salaryWork;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourWork=" + hourWork +
                ", salaryWork=" + salaryWork +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
