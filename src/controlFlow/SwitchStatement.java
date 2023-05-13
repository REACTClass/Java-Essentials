package controlFlow;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
//        Switch statement checks for equality

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;  // <-- If not included, will continue on to execute case B (fall-through)
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }
    }
}
