package oopcursoudemy.exercicio5.entities;

public class Account {
    private String name;
    private final int num;
    private double value;

    public Account(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Account(int num, String name, double initialDeposit) {
        this.num = num;
        this.name = name;
        deposit(initialDeposit);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return value;
    }

    public void deposit(double value) {
        this.value += value;
    }

    public void withdrawal(double value) {
        this.value -= value + 5.00;
    }

    @Override
    public String toString() {
        return "Account data: " + num +
                ", Holder: " + name +
                ", Balance: $ " + String.format("%.2f", value);
    }

}
