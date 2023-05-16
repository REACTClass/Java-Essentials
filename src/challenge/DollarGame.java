package challenge;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {

        System.out.println("Welcome to 'Change for a Dollar' \n The objective of this game is to enter an amount of pennies, nickles, dimes and quarts that totals $1.00");
        double pennies;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies would you like?");
        pennies = scanner.nextDouble();

        double nickles;
        System.out.println("How many nickles would you like?");
        nickles = scanner.nextDouble();

        double dimes;
        System.out.println("How many dimes would you like?");
        dimes = scanner.nextDouble();

        double quarters;
        System.out.println("How many quarters would you like?");
        quarters = scanner.nextDouble();

        double totalPennies = pennies * 0.01;
        double totalNickles = nickles * .05;
        double totalDimes = dimes * 0.10;
        double totalQuarters = quarters * 0.25;

        double total = totalPennies + totalNickles + totalDimes + totalQuarters;

        if(total == 1) {
            System.out.println("Congrats! You win!!! Your total equals $1 exactly");
        } else if(total < 1) {
            double changeShort = 1 - total;
//            System.out.println(total);
            System.out.println("You lose! You are: " + changeShort + " short.");
        } else {
            double changeOver = total - 1;
//            System.out.println(total);
            System.out.println("You lose! You are: " + changeOver + " over.");
        }
    }
}
