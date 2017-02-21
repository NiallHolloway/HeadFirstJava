class BankAccount{
    private int balance = 100;

    int getBalance(){
        return balance;
    }

    void withdraw(){
        balance = balance - 10;
    }
}

public class RyanAndMonicaJob implements Runnable {

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for(int x = 0; x < 10; x++){
            makeWithdrawal();
            if(account.getBalance() < 0){
                System.out.println("Overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(){
        if(account.getBalance() >= 10){
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
            try{
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Woke up");
            account.withdraw();
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
        }else{
            System.out.println("Sorry not enough for " + Thread.currentThread().getName());
        }
    }
}
