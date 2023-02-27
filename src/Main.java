import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String continueYN = "";
        String playerA = "";
        String playerB = "";
        Boolean done = false;
        Boolean doneA= false;
        Boolean doneB = false;

        do
        {
             do
             {
                 System.out.print("PlayerA enter the move [RPS]: ");
                 playerA = in.nextLine();
                 playerA = playerA.toUpperCase();
                 if (playerA.matches("[RPS]"))
                 {
                     doneA = true;
                 }
             } while(!doneA);

            do
            {
                System.out.print("PlayerB enter the move [RPS]: ");
                playerB = in.nextLine();
                playerB = playerB.toUpperCase();
                if (playerB.matches("[RPS]"))
                {
                    doneB = true;
                }
            } while(!doneB);

            if(playerA.equals("R"))
            {
              if(playerB.equals("R"))
              {
                  System.out.println("Rock vs. Rock! It is a tie");
              } else if (playerB.equals("P"))
              {
                  System.out.println("Paper covers Rock! Player B wins!");
              }else
              {
                  System.out.println("Rock breaks Scissors! Player A wins!");
              }
            } else if (playerA.equals("P"))
            {

                if(playerB.equals("R"))
                {
                    System.out.println("Paper covers Rock! Player A wins!");
                } else if (playerB.equals("P"))
                {
                    System.out.println("Paper vs. Paper! It is a tie!");
                }else
                {
                    System.out.println("Scissors cuts paper! Player B wins!");
                }
            }else // scissors
            {
                if (playerB.equals("R")) {
                    System.out.println("Rock breaks Scissors! Player B wins!");
                } else if (playerB.equals("P")) {
                    System.out.println("Scissors cuts Paper! Player A wins!");
                } else {
                    System.out.println("Scissors vs Scissors! It is a tie!");
                }
            }
            System.out.print("Do you play again?[YN]: ");
            continueYN = in.nextLine();
            if(continueYN.equalsIgnoreCase("N"))
            {
                done = true;
            }


        } while(!done);





    }
}