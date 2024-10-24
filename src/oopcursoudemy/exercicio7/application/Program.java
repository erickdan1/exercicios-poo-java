package oopcursoudemy.exercicio7.application;

import java.util.Locale;
import java.util.Scanner;
import oopcursoudemy.exercicio7.entities.StudentHostel;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;

        StudentHostel[] quartos = new StudentHostel[10];

        System.out.print("How many rooms will be rented? ");
        num = sc.nextInt();
        sc.nextLine();
        System.out.println(); // Quebra de linha

        for (int i=0; i<num; i++) {
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int numRoom = sc.nextInt();
            sc.nextLine();
            System.out.println(); // Quebra de linha

            quartos[numRoom] = new StudentHostel(name, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i=0; i< quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.printf("%d: %s, %s\n", i, quartos[i].getName(), quartos[i].getEmail());
            }
        }

        sc.close();
    }
}
