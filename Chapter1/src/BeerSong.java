/**
 * Created by niall-holloway on 14/02/17.
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while(beerNum > 0){

            if(beerNum ==1){
                word = "bottle"; //singular ie one bottle
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down.");
            System.out.println("Pass it Around");
            System.out.println("");
            beerNum = beerNum - 1;

            if (beerNum == 0){
                System.out.println("No More Bottles of Beer on the wall");
            }//end else
        }//end while loop
    }//end main method
}//end class
