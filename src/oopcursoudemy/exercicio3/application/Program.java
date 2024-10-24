package oopcursoudemy.exercicio3.application;

import java.util.Locale;
import java.util.Scanner;
import oopcursoudemy.exercicio3.entities.Student;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        s.name = sc.nextLine();
        s.n1 = sc.nextDouble();
        s.n2 = sc.nextDouble();
        s.n3 = sc.nextDouble();

        s.isPassed(s.finalGrade());

        sc.close();
    }

}
