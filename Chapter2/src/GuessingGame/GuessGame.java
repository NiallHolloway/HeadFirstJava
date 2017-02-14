package GuessingGame;

/**
 * Created by niall-holloway on 14/02/17.
 */
class GuessGame {

    //Create three player objects and assign them three player instance variables
    void startGame(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        //Declare three variables to hold the guesses player makes
        int guessp1;
        int guessp2;
        int guessp3;

        //declare three variables to hold a true or false based on players answer
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        //make a target number players have to guess
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Im thinking of a number between 0 and 9...");

        while(true){
            System.out.println("Number to guess is " + targetNumber);

            //call each players guess method
            p1.guess();
            p2.guess();
            p3.guess();

            //get each players guess
            guessp1 = p1.number;
            System.out.println("player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("GuessingGame.Player three guessed " + guessp3);

            if(guessp1 == targetNumber){
                p1isRight = true;
            }

            if(guessp2 == targetNumber){
                p2isRight = true;
            }

            if(guessp3 == targetNumber){
                p3isRight = true;
            }

            if(p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner");
                System.out.println("player one got it right? " + p1isRight);
                System.out.println("GuessingGame.Player two got it right? " + p2isRight);
                System.out.println("player three got it right? " + p3isRight);
                System.out.println("Game is Over.");
                break;
            } else {
                System.out.println("players will have to try again");
            }//end of if/else
        }//end loop
    }//end method
}//end class

