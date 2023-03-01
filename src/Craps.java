import java.util.Random;
import java.util.Scanner;
public class Craps {
    public static void main(String[] args) {
        //Declaring Out Of Loop Variables
        int YN = 1;
        do {
            //Declaring Variables For Play Loop
            Random rnd = new Random();
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int die3 = 0;
            int die4 = 0;
            int crapsRoll = 0;
            int crapsRoll2 = 0;
            int lastRoll = 0;
            int contGame = 1;
            Scanner in = new Scanner(System.in);
            do {
                //Initial Roll
                crapsRoll = die1 + die2;
                System.out.println("First roll: " + die1);
                System.out.println("Second roll: " + die2);
                //Process For Loss
                if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                    System.out.println("Your total is " + crapsRoll + " so you crapped out!");
                    contGame = 0;
                }
                //Process For Win
                else if (crapsRoll == 7 || crapsRoll == 11) {
                    System.out.println("Your total is " + crapsRoll + " so you win!");
                    contGame = 0;
                }
                //Process For Point
                else {
                    System.out.println("");
                    System.out.println("Trying for point.");
                    System.out.println("");
                    lastRoll = crapsRoll;
                    do {
                        //Declaring Variables For Point Loop
                        die3 = rnd.nextInt(6) + 1;
                        die4 = rnd.nextInt(6) + 1;
                        crapsRoll2 = die3 + die4;
                        //Point Loop Output
                        System.out.println("First roll: " + die3);
                        System.out.println("Second roll: " + die4);
                        System.out.println("Point: " + lastRoll + "   Total: " + crapsRoll2);
                        System.out.println("");
                        //Process For Point Loss
                        if (crapsRoll2 == 7)
                        {
                            lastRoll=crapsRoll2;
                        }
                    }
                    //Process For Win
                    while (lastRoll != crapsRoll2);
                    if (crapsRoll2==7)
                    {
                        System.out.println("Your total is " + crapsRoll2 + " so you lost!");
                    }
                    else
                    {
                        System.out.println("You made point: " + crapsRoll2 + " so you win!");
                    }
                    contGame = 0;
                }
            } while (contGame == 1);
            //Output For "Play Again"
            System.out.println("");
            System.out.println("Would you like to play again? Please enter Y for yes and N for no.");
            //Input For "Play Again"
            if (in.nextLine().equalsIgnoreCase("Y"))
                YN=1;
            else
                YN=0;
        }
        while (YN==1);
        //End Program
        System.out.println("Thank you for playing!");
            System.exit(0);}
    }