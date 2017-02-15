package JFrames;
/**
 * Created by niall-holloway on 15/02/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {

    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    private void go(){
        frame = new JFrame("JFrames.TwoButtons");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());
        JButton colorButton = new JButton("Change Colour");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I'm a Label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            label.setText("OUCH!");
        }
    }

    class ColorListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            frame.repaint();
        }
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
