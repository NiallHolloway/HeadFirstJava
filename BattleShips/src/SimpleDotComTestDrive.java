/**
 * Created by niall-holloway on 13/02/17.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";


        dot.checkYourself(userGuess);
    }
}