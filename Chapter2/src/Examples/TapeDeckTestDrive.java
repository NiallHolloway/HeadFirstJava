package Examples;

/**
 * Created by niall-holloway on 14/02/17.
 */
class TapeDeckTestDrive {
    public static void main(String[] args) {

        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if(t.canRecord == true){
            t.recordTape();
        }
    }
}
