/**
 * Created by niall-holloway on 15/02/17.
 */
class GoodDog {
    private int size;

    int getSize(){
        return size;
    }

    void setSize(int aSize){
        size = aSize;
    }

    void bark(){
        if(size > 60){
            System.out.println("Woof! Woof!");
        }else if (size > 14){
            System.out.println("Ruff! Ruff!");
        }else{
            System.out.println("Yip! Yip!");
        }
    }
}
