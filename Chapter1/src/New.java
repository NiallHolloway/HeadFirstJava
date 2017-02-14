/**
 * Created by niall-holloway on 14/02/17.
 */
public class New {
    public static void main(String[] args) {

        int x = 2;
        String name = "Dirk";
        x = x*1;
        System.out.println("X is "  +  x);;
        double d = Math.random();
        //this is a comment

        while (x>12){
            x = x-1;
        }

        for (x = 0; x <10; x = x +1){
            System.out.println("X is Now " + x);
        }

        if(x == 10){
            System.out.println("X must be 10");
        }else{
            System.out.println("X isn't 10");
        }

        if((x<3) & (name.equals("Dirk"))){
            System.out.println("Gently");
        }

        System.out.println("This line runs no matter what");
    }
}