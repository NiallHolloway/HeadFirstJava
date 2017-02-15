package JFrames;
/**
 * Created by niall-holloway on 15/02/17.
 */
import java.util.Date;

public class TestFormats {

    public static void main(String[] args) {

        String s = String.format("%, d", 1000000000);
        String g = String.format("I have %,.2f, bugs to fix", 47568.09876);
        String n = String.format("%tc", new Date());

        System.out.println(n);
        System.out.println(g);
        System.out.println(s);
    }
}
