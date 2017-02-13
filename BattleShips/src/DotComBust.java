/**
 * Created by niall-holloway on 13/02/17.
 */
import java.util.*;
public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    private void setUpGame(){
        //set up dotcoms
        DotCom one = new DotCom();
        one.setName("Carrier");
        DotCom two = new DotCom();
        two.setName("Destroyer");
        DotCom three = new DotCom();
        three.setName("Frigate");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        //print some brief instructions
        System.out.println("Your goal is to sink three enemy Battleships");
        System.out.println("Carrier, Deestoyer, Frigate");
        System.out.println("Try to sink them all with as few guesses as possible");

        for(DotCom dotComToSet: dotComsList){
            //ask heper for a location
            ArrayList<String> newLocation = helper.placeDotCom();
            //set the ships to the helper locations using setter
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a Guess: ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        //Assume a miss
        String result = "Miss";
        for(int x = 0; x < dotComsList.size(); x++){
            result = dotComsList.get(x).checkYourself(userGuess);
            if(result.equals("Hit")){
                break; //get out no point checking others
            }
            if(result.equals("Kill")){
                dotComsList.remove(x);
                break;
            }
        }
        System.out.println("Result");
    }

    private void finishGame(){
        System.out.println("All the Ships have been sunk");
        if (numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses");
            System.out.println("Well Done");
        }else{
            System.out.println("It took you long enough. " + numOfGuesses + " guesses");
            System.out.println("Our navy suffered catastrophic losses because of you");
        }
    }


}
