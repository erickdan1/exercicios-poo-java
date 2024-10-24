package oopcursoudemy.exercicio4.application;

import java.util.Locale;
import java.util.Scanner;
import oopcursoudemy.exercicio4.util.CurrencyConverter;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double price, value, result;

        System.out.print("What is the dolar price? ");
        price = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        value = sc.nextDouble();

        result = CurrencyConverter.dolarToReais(price, value);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        sc.close();
    }
}
