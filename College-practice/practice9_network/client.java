
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws ConnectException, IOException {
        Socket cs = new Socket("localhost", 7847);
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);
        outs.println(" Hello Server");
        String s = ins.nextLine();
        System.out.println("From server:" + s);
        ins.close();
        outs.close();
        cs.close();
    }

}
