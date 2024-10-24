package oopcursoudemy.exercicio2.entities;

public class Employee {
    public String name;
    public Double grossSalary, tax;

    public Double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage/100);
    }
}