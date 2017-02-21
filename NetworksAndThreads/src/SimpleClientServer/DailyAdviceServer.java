package SimpleClientServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {


    private String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat", "One Word: Inappropriate",
            "Just for today be honest, tell your *really think*", "you might want to rethink that haircuit"};

    private void go() {

        try {
            ServerSocket serverSock = new ServerSocket(4242);

            while (true){
                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String getAdvice(){
        int random = (int)(Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
