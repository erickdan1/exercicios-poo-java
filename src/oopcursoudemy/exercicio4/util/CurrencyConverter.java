package oopcursoudemy.exercicio4.util;

public class CurrencyConverter {

    public static double dolarToReais(double price, double value) {
        double baseValue = price * value;
        double iof = baseValue * 0.06;
        return baseValue + iof;
    }

}
