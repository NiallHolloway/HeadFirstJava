package JFrames;
/**
 * Created by niall-holloway on 15/02/17.
 */
import javax.swing.*;
import java.awt.event.*;

public class SimpleGUIB implements ActionListener {

    //button
    private JButton button;

    public static void main(String[] args) {
        SimpleGUIB gui = new SimpleGUIB();
        gui.go();
    }

    private void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click me");
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        button.setText("Ive been clicked");
    }
}
