package oopcursoudemy.exercicio6.application;

import java.util.Locale;
import java.util.Scanner;
import oopcursoudemy.exercicio6.entities.Person;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, age;
        String name;
        double height, sumHeight, avgHeight, qntAges, percentage;

        System.out.print("Quantas pessoas serão digitadas? ");
        num = sc.nextInt();
        sc.nextLine();

        Person[] vect = new Person[num];

        for (int i=0; i<num; i++) {
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();
            System.out.print("Altura: ");
            height = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Person(name, age, height);
        }

        sumHeight = 0;
        for (int i=0; i<num; i++) {
            sumHeight += vect[i].getHeight();
        }

        avgHeight = sumHeight / num;
        System.out.printf("\nAltura média: %.2f%n", avgHeight);

        qntAges = 0;
        for (int i=0; i<num; i++) {
            if (vect[i].getAge() < 16) {
                qntAges += 1;
            }
        }

        percentage = (qntAges / num) * 100;
        System.out.println("Pessoas com menos de 16 anos: " + percentage + "%");

        for (int i=0; i<num; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
