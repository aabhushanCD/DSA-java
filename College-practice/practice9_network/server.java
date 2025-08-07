
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class server {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(7847);

        Socket cs = ss.accept();
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);

        String s = ins.nextLine();
        System.out.println("From Server" + s);
        outs.println("Hello Client");
        outs.close();
        ins.close();
        cs.close();
        ss.close();

    }
}
