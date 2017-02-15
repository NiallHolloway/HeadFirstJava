package JFrames;
/**
 * Created by niall-holloway on 15/02/17.
 */
import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g){

        g.setColor(Color.ORANGE);
        g.fillRect(20, 50, 100, 100);
    }
}