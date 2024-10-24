package oopcursoudemy.exercicio3.entities;

public class Student {
    public String name;
    public Double n1, n2, n3;

    public Double finalGrade() {
        return n1 + n2 + n3;
    }

    public void isPassed(double finalGrade) {
        if (finalGrade > 60) {
            System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING: %.2f%n", 60-finalGrade);
        }
    }
}
