package SimpleClientServer;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Lesson {
    public static void main(String[] args) {

        addThreadsToPool();
    }

    private static void addThreadsToPool(){
        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
        eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, TimeUnit.SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 10, 10, TimeUnit.SECONDS);

        System.out.println("Number of Threads: " + Thread.activeCount());

        Thread[] listOfThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(listOfThreads);

        for(Thread i : listOfThreads){
            System.out.println(i.getName());
        }

        for(Thread i : listOfThreads){
            System.out.println(i.getPriority());
        }
    }
}
