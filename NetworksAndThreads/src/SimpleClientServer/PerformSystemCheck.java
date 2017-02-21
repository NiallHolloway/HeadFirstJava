package SimpleClientServer;

import java.util.concurrent.locks.ReentrantLock;
public class PerformSystemCheck  implements Runnable {

    private String checkWhat;
    private ReentrantLock lock = new ReentrantLock();

    PerformSystemCheck(String checkWhat){
        this.checkWhat = checkWhat;
    }

    public void run(){
        lock.lock();
        System.out.println("Checking " + this.checkWhat);
        lock.unlock();
    }
}
