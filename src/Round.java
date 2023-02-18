import java.awt.*;
import java.util.Scanner;
public class Round {
    private Player p;
    private Die d1;
    public Round()
    {
        // initialize whatever we need to initialize
    }

    public Player getPlayer() {
        return p;
    }
    public Die getDie() {
        return d1;
    }

    public void roundGame(Player p, DiceGameViewer window)
    {
        this.p = p;
        int playerTotal = 0;
        // Round r = new Round();
        // r.playRound(p1);
        // Round r2 = new Round();
        // r2.playRound(p2);

        Scanner input = new Scanner(System.in);
        // System.out.println("Would you like to hit or stand?");
        String hit = "hit";
        //String stand = "stand";
        // hit = input.nextLine();
        System.out.println("Would you like to hit or stand?");

        while(playerTotal < 19)
        {
            hit = input.nextLine();
            if (hit.equals("stand"))
            {
                break;
            }
            d1 = new Die();
            System.out.println(d1);
            System.out.println("Rolling the die...");

            System.out.println();
            int dice1 = d1.roll();
            window.repaint();
            int sumRoll = dice1;
            System.out.println("Your number is: " + dice1);
            playerTotal += sumRoll;
            System.out.println("Your total is: " + (playerTotal)); //?
        }
        p.setTotal(playerTotal);
        window.repaint();

        if(playerTotal > 21)
        {
            System.out.println("You lose :( ");

        }
        if(playerTotal == 21 || playerTotal == 20 || playerTotal == 19)
        {
            System.out.println("YOU ARE A WINNER!!!!");

        }
        if(hit.equals("stand"))
        {
            System.out.println("You chose to stand");

        }
        System.out.println();
    }
}
