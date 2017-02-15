package Animations;
/**
 * Created by niall-holloway on 15/02/17.
 */
import javax.swing.*;
import java.awt.*;

public class Animate {
    private int x = 1;
    private int y = 1;

    public static void main(String[] args) {
        Animate gui = new Animate();
        gui.go();
    }

    private void go(){
        JFrame frame = new JFrame("Rectangle");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);

        for(int i = 0; i < 90; i++, y++, x++){
            x++;
            drawP.repaint();
            try{
                Thread.sleep(50);
            }catch(Exception ex){
                System.out.println("Error");
            }
        }
    }

    class MyDrawP extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.BLUE);
            g.fillRect(x,y,500-x*2,250-y*2);
        }
    }
}

