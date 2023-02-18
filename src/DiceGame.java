import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
public class DiceGame {

    private DiceGameViewer window;
    private Image imageBack;
    private Round r;


    public static void main(String[] args)
    {
        DiceGame g = new DiceGame();
        g.playGame();
    }

    public DiceGame()
    {
        r = new Round();
        // initialize players, any other instance variables.
        //initialize window
        this.window = new DiceGameViewer(r);
    }

    public void printInstructions()
    {
        System.out.println("Welcome you human. Can you defeat me? I think not!\n" +
                "This Die Game is similar to Black Jack. Will you chose\n" +
                "to hit or stand?");
        System.out.println("Your goal is to get within 2 of 21.\n" +
                "If you go over you lose ):");
        System.out.println("Good Luck human");
        System.out.println();
    }

    public void playGame()
    {
        printInstructions();
        // ask for player 1's name
        String p1name = "Player 1";
        Player p1 = new Player(p1name);

        // ask for player 2's name
        String p2name = "Player 2";
        Player p2 = new Player(p2name);


        // Repeat ALL of this 3 times:
        for(int i = 0; i < 3; i ++)
        {
            r.roundGame(p1, window);

            r.roundGame(p2, window);

            // Find winner
            if (p1.getTotal() <= 21)
            {
                if (p2.getTotal() > 21)
                {
                    p1.increaseWins();
                }

                else
                {
                    if (p1.getTotal() > p2.getTotal())
                    {
                        p1.increaseWins();
                    }

                    else if (p2.getTotal() > p1.getTotal())
                    {
                        p2.increaseWins();
                    }
                }
            }
            else
            {
                if (p2.getTotal() <= 21)
                {
                    p2.increaseWins();
                }
            }
        }


        // Compare total wins and print the winner
        if (p1.getWins() > p2.getWins())
            System.out.println(p1.getName() + " Won!");
        else if (p2.getWins() > p1.getWins())
            System.out.println(p2.getName() + " Won!");
        else
            System.out.println("It's a tie!");

    }

}
