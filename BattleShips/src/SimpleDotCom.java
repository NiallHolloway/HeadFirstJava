/**
 * Created by niall-holloway on 13/02/17.
 */
    class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    void setLocationCells(int[] locs){
        locationCells = locs;
    }

    String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int cell : locationCells){
            if(guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}