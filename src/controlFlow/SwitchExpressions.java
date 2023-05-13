package controlFlow;

import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args) {

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent job!";  //No break statement is needed. case "A", "B" -> "Excellent job!; <-Same message for multiple cases
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade";

//            float firstNumber = 2;
//            float secondNumber = 8;
//            float result = switch(operation) {
//            case "+" -> {
//            System.out.println("Adding...");
//            yield firstNumber + secondNumber;
//            }
//            case "-" -> {
//            System.out.println("Subtracting...");
//            yield firstNumber - secondNumber;
//            }
//            default -> 0;

        };
    }
}
