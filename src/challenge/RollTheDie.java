package challenge;
import java.util.Random;

public class RollTheDie {
//    The objective of the game is to travel the entire game board of 20 spaces within five die roll. The program will automatically roll the die and advance the player that number of spaces on the game board.
//   Requirements: Generate random numbers between 1 and 6 to represent die roll
//    Tell player which game space they're on and how many more spaces they have to go to win
//    Repeat for times(five rolls total)
//    If the player advances exactly 20 spaces within 5 die rolls, they win
//    Output the result of the game
    public static void main(String[] args) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for(int i = 5; i < maxRolls; i--) {
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if(currentSpace == lastSpace) {
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            } else if (i == maxRolls && currentSpace < lastSpace) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately you didn't make it to all " + lastSpace + " spaces. You lose!");
            } else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace + " and have " + spacesToGo + " more to go");
            }
            System.out.println(); //To add new line after roll
        }
    }
}
