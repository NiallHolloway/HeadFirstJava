package readingAndSaving;
/**
 * Created by niall-holloway on 15/02/17.
 */
import java.io.Serializable;

public class GameCharacter implements Serializable {
    private int power;
    private String type;
    private String[] weapons;

    public GameCharacter(int p, String t, String[] w){
        power = p;
        type = t;
        weapons = w;
    }

    int getPower(){
        return power;
    }

    String getType(){
        return type;
    }

    String getWeapons(){
        String weaponList = "";
        for (int i = 0; i < weapons.length; i++){
            weaponList += weapons[i] + "";
        }
        return weaponList;
    }
}

