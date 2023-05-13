package controlFlow;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("how many sales did the employees make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

//        if(sales > quota) {
//            salary = salary + bonus;
        if(sales >= quota) {
            System.out.println("Congrats! You've met your quota.");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not meet your quota. You were " + salesShort + " sales short.");
        }
//        System.out.println("The employee's pay is $" + salary);
    }
}
