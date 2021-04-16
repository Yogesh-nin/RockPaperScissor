import java.util.Random;
import java.util.Scanner;


public class janken{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int me, computer, win = 0, lose = 0;
        String name, myChoice, compChoice, result;
        int upperbound = 2;

        
        

        System.out.println("|----------------------------------------|");
        System.out.println("|   HELLO FOLKS...THIS IS ME             |");
        System.out.println("|     INSTRUCTION FOR THIS GAME          |");
        System.out.println("| 1. ENTER 0 FOR ROCK                    |");
        System.out.println("| 2. ENTER 1 FOR PAPER                   |");
        System.out.println("| 3. ENTER 2 FOR SCISSORS                |");
        System.out.println("| 4. THIS GAME WILL HAVE 5 ROUNDS        |");
        System.out.println("| 5. THIS IS YOU vs COMPUTER, HAVE FUN   |");
        System.out.println("|________________________________________|");

        System.out.println("ENTER YOUR NAME");
        name = sc.nextLine();
        System.out.println("HELLO " + name + " !!! BEST OF LUCK FOR YOUR GAME");

        System.out.println("--------GAME START--------");
        
        
        int i = 1;
        while(i<=5){

            
           // System.out.println("Your choice: " + me);

            computer = rand.nextInt(upperbound);

            System.out.println("\n|----------------|");
            System.out.println("|      ROUND " + i + "   |");
            System.out.println("|________________|\n");

            System.out.println("Enter your choice");
            me = sc.nextInt();

            if(me == 0)     //naming my choice
            {
                myChoice = "ROCK";
            }
            else if(me == 1)   
            {
                myChoice = "PAPER";
            }
            else 
            {
                myChoice = "SCISSORS";
            }

            if(computer == 0)       //name computer's choice
            {
                compChoice = "ROCK";
            }
            else if(computer == 1)
            {
                compChoice = "PAPER";
            }
            else 
            {
                compChoice = "SCISSORS";
            }

            System.out.println("your choice: " + myChoice);
            System.out.println("computer's choice " + compChoice);

           if(me == 0 && computer == 1)
            {
                System.out.println("You lose");
                lose++;
            }
            else if(me == 0 && computer == 2)
            {
                System.out.println("You win");
                win++;
            }
            else if(me == 1 && computer == 0)
            {
                System.out.println("You win");
                win++;
            }
            else if(me == 1 && computer == 2)
            {
                System.out.println("You lose");
                lose++;
            }
            else if(me == 2 && computer ==0)
            {
                System.out.println("You lose");
                lose++;
            }
            else if(me == 2 && computer == 1)
            {
                System.out.println("You win");
                win++;
            }
            else
            {
                System.out.println("Match is draw");
            }
            i++;
        }

        if(win > lose)
        {
            result = "HURRAHH!!!!  YOU WIN.....CONGRATULATION :)";
        }
        else if(win < lose)
        {
            result = "OOPS!! BETTER LUCK NEXT TIME :)";
        }
        else
        {
            result = "OHH... THATS DRAW...:(";
        }

        System.out.println("\n");
        System.out.println("|--------------------|");
        System.out.println("|     SCORECARD      |");
        System.out.println("| TOTAL MATCHES: 5   |");
        System.out.println("| WINS: "+win+"            |");
        System.out.println("| LOSE: "+lose+"            |");
        System.out.println("|____________________|");

        System.out.println("\n" + result);
        System.out.println("\n THANKS FOR PLAYING.....it's yogesh");

    }
}