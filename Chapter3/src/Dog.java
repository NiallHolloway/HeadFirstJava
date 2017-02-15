/**
 * Created by niall-holloway on 15/02/17.
 */
class Dog {
    private String name;

    public static void main(String[] args) {

        //make a dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "bart";

        //make a dog array
        Dog[] myDogs = new Dog[3];
        //put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //now access the dogs using the array references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //what is myDogs[2] name
        System.out.println("The last dogs name is ");
        System.out.println(myDogs[2].name);

        //now loop through the array and tell all the dogs to bark
        int x = 0;
        while ( x < myDogs.length){
            myDogs[x].bark();
            x++;
        }
    }

    private void bark(){
        System.out.println(name + " says Ruff!");
    }
}