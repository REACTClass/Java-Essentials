package challenge;

import java.util.Scanner;

public class FillInTheBlanks {

    public static void main(String[] args) {

        //Challenge

        String season;
        System.out.println("What season are we currently in");
        Scanner scanner = new Scanner(System.in);
        season = scanner.nextLine();
/*
        Or
        String season = scanner.next();
*/
        int num;
        System.out.println("Please enter a whole number between 1 and 29");
        num = scanner.nextInt();

        scanner.nextLine();

        String adjective;
        System.out.println("Please enter an adjective");
        adjective = scanner.nextLine();

        scanner.close();

        System.out.println("Welcome to the " + num + "th day of a " + adjective + " " + season + ".");
    }
}
