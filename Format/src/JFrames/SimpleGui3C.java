package JFrames;
/**
 * Created by niall-holloway on 15/02/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {

    private JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    private void go(){
        frame = new JFrame("Colours");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Change Colours");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        frame.repaint();
    }

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;

            int red = (int)(Math.random() * 256);
            int green = (int)(Math.random() * 256);
            int blue = (int)(Math.random() * 256);
            Color startColour = new Color(red, green, blue);

            red = (int)(Math.random() * 256);
            green = (int)(Math.random() * 256);
            blue = (int)(Math.random() * 256);
            Color endColour = new Color(red, green, blue);

            GradientPaint gradient = new GradientPaint(70, 70, startColour, 150, 150, endColour);
            g2d.setPaint(gradient);
            g2d.fillOval(70, 70, 100, 100);
        }
    }
}
