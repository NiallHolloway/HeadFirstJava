package readingAndSaving;
/**
 * Created by niall-holloway on 15/02/17.
 */
import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"bow", "sword", "dust"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[]{"bared hands", "big axe"});
        GameCharacter three = new GameCharacter(120, "Magician", new String[]{"spells", "invisibility"});

        //lots of code about characters levelling changing states
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        //set values back to null
        one = null;
        two = null;
        three = null;

        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter)is.readObject();
            GameCharacter twoRestore = (GameCharacter)is.readObject();
            GameCharacter threeRestore = (GameCharacter)is.readObject();

            System.out.println("One's Type: " + oneRestore.getType());
            System.out.println("Two's Type: " + twoRestore.getType());
            System.out.println("Three's Type: " + threeRestore.getType());
            System.out.println("One's Weapons: " + oneRestore.getWeapons());
            System.out.println("One's Power: " + oneRestore.getPower());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
