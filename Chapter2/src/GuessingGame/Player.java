package GuessingGame;

/**
 * Created by niall-holloway on 14/02/17.
 */
class Player {
    int number = 0; //where the guess goes
    void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}