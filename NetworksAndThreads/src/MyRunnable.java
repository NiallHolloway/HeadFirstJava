public class MyRunnable implements Runnable {

    @Override
    public void run() {
        go();
    }

    private void go(){
        doMore();
    }

    private void doMore(){
        System.out.println("top o' the stack");
    }
}

class ThreadTestDrive{

    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("Back in the main");

    }
}
