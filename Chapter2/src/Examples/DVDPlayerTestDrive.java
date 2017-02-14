package Examples;

/**
 * Created by niall-holloway on 14/02/17.
 */
class DVDPlayerTestDrive {
    public static void main(String[] args) {

        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if(d.canRecord){
            d.recordDVD();
        }
    }
}