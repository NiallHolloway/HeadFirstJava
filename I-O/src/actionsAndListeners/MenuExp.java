package actionsAndListeners;
/**
 * Created by niall-holloway on 15/02/17.
 */
import javax.swing.*;

public class MenuExp extends JFrame {

    private MenuExp(){
        setTitle("Menu Example");
        setSize(150,150);

        //create a menubar for JFrame
        JMenuBar menuBar = new JMenuBar();
        //add menubar to frame
        setJMenuBar(menuBar);

        //define and add two drop down menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        //create and add simple menu items
        JMenuItem newAction = new JMenuItem("New");
        JMenuItem openAction = new JMenuItem("Open");
        JMenuItem exitAction = new JMenuItem("Exit");
        JMenuItem cutAction = new JMenuItem("Cut");
        JMenuItem copyAction = new JMenuItem("Copy");
        JMenuItem pasteAction = new JMenuItem("Paste");

        //create a checkButton
        JCheckBoxMenuItem checkAction = new JCheckBoxMenuItem("Check Item");
        //create simple radio buttons
        JRadioButtonMenuItem radioAction1 = new JRadioButtonMenuItem("Radio Button 1");
        JRadioButtonMenuItem radioAction2 = new JRadioButtonMenuItem("Radio Button 2");
        //create a button group
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioAction1);
        bg.add(radioAction2);

        //add all of these
        fileMenu.add(newAction);
        fileMenu.add(openAction);
        fileMenu.add(checkAction);
        fileMenu.addSeparator();
        fileMenu.add(exitAction);
        editMenu.add(cutAction);
        editMenu.add(copyAction);
        editMenu.add(pasteAction);
        editMenu.addSeparator();
        editMenu.add(radioAction1);
        editMenu.add(radioAction2);

        newAction.addActionListener(e -> System.out.println("You have clicked the new action"));

        exitAction.addActionListener(e -> System.out.println("Exit"));
    }

    public static void main(String[] args) {
        MenuExp me = new MenuExp();
        me.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        me.setVisible(true);
    }
}
