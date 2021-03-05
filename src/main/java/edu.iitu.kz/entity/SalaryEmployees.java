package edu.iitu.kz.entity;

public class SalaryEmployees extends Employee{
    private double percent;
    private double amount;

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "SalaryEmployees{" +
                "percent=" + percent +
                ", amount=" + amount +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
