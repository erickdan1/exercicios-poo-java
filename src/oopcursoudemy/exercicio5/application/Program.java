package oopcursoudemy.exercicio5.application;

import java.util.Locale;
import java.util.Scanner;
import oopcursoudemy.exercicio5.entities.Account;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        String name;
        double value;

        System.out.print("Enter account number: ");
        num = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        String s = sc.next();

        Account account = new Account(num, name);

        if (s.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();
            account.deposit(value);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());

        System.out.println();
        System.out.println("Updated accont data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        account.withdrawal(sc.nextDouble());

        System.out.println();
        System.out.println("Updated accont data:");
        System.out.println(account);

        sc.close();
    }
}
