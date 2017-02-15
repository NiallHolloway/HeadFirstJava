package Animations;
/**
 * Created by niall-holloway on 15/02/17.
 */
import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

    private int x = 70;
    private int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    private void go(){
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for(int i = 0; i < 130; i++){
            x++;
            y++;

            drawPanel.repaint();
            try{
                Thread.sleep(50);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.GREEN);
            g.fillOval(x, y, 40, 40);
        }
    }
}
