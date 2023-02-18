import javax.swing.*;
import java.awt.*;
public class Die {
    /** Instance Variables **/
    private int sides;
    private int num;

    /** Constructors **/
    public Die() {
        sides = 6;
        num = 0;
    }

    public Die(int numSides) {
        sides = numSides;
    }

    /** Methods **/
    public int getSides() {
        return sides;

    }

    /**
     * Returns a random int between 1 and
     * the number of sides on the Die
     */
    public int roll() {
        num = (int)(Math.random()*sides) + 1;
        return num;
    }

    /**
     * Rolls the dice the numRolls times
     * and returns the max value of the rolls
     */
    public int getMaxRoll(int numRolls) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numRolls; i++) {
            int num = roll();
            max = Math.max(max, num);
        }

        return max;
    }

    public String toString() {
        return "This is a " + sides + " sided die.";
    }

    public void draw(Graphics g, Image[] dieImages, DiceGameViewer window , int x, int y, int height, int width)
    {
        Image myDieImage = dieImages[num - 1];
        g.drawImage(myDieImage, x, y, window);
    }

}
