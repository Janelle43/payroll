package edu.iitu.kz.entity;

public class ComissionEmployees extends Employee{
    private double percent;

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "ComissionEmployees{" +
                "percent=" + percent +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
