import javax.swing.*;
import java.awt.*;


public class DiceGameViewer extends JFrame {
    private Image imageBack;
    private static final int MAX_WINDOWHEIGHT = 1000;
    private static final int MAX_WINDOWWIDTH = 1000;

    private Image die1;
    private Image die2;
    private Image die3;
    private Image die4;
    private Image die5;
    private Image die6;

    private Image[] dieImages;
    private Round r;

    public DiceGameViewer(Round r) {
        //constructor
        imageBack = new ImageIcon("Resources/Card Game.png").getImage();
        dieImages = new Image[6];
        this.r = r;

        this.setTitle("DICEGAME!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(MAX_WINDOWWIDTH, MAX_WINDOWHEIGHT);
        this.setVisible(true);
        for(int i = 0; i < dieImages.length; i++)
        {
            dieImages[i] = new ImageIcon("Resources/" + (i+1) +".png").getImage();

        }
    }
    public Image getImageO() {

        return imageBack;
    }

    public void paint(Graphics g) {

        g.drawImage(imageBack, 0,0,1000,700, null);
        Die currDie = r.getDie();
        currDie.draw(g, dieImages, this, 600, 400, 10, 10);

    }


}


