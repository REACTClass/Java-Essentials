package loops;

import java.util.Scanner;

public class BreakStatement {
    //Create a program that searches a string to determine if it contains the letter 'a'.
    public static void main(String[] args) {

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search for letter A
        for(int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                System.out.println("We found the letter 'a' in " + text);
                break;
            }
        }

    }
}
