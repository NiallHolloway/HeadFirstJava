/**
 * Created by niall-holloway on 15/02/17.
 */
public class GoodDogTestDrive {
    public static void main(String[] args) {

        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(28);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();
    }
}
