package controlFlow;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        System.out.println("Enter you test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

//        Determine the letter grade
        char grade;
        if(score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
    }
}
