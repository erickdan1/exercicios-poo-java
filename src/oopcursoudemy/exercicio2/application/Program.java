package oopcursoudemy.exercicio2.application;

import java.util.Locale;
import java.util.Scanner;
import oopcursoudemy.exercicio2.entities.Employee;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", emp.name, emp.netSalary());

        System.out.print("Whitch percentage to increase salary? ");

        double percentage = sc.nextDouble();

        emp.increaseSalary(percentage);

        System.out.printf("Update data: %s, $ %.2f%n", emp.name, emp.netSalary());

        sc.close();
    }
}
