package oopcursoudemy.exercicio1.application;

import java.util.Locale;
import java.util.Scanner;
import oopcursoudemy.exercicio1.entities.Rectangle;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();
        System.out.println("Enter rectangle width and heigth:");

        r.width = sc.nextDouble();
        r.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", r.area());
        System.out.printf("PERIMETER = %.2f%n", r.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", r.diagonal());

        sc.close();
    }
}

