package readingAndSaving;
/**
 * Created by niall-holloway on 15/02/17.
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable{

    private void setWidth(int w){
        int width = w;
    }

    private void setHeight(int h){
        int height = h;
    }

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(20);

        try{
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

