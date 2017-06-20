package clientserverdemo;
import java.net.Socket;             // Used to connect to the server
import java.io.ObjectInputStream;   // Used to read objects sent from the server
import java.io.ObjectOutputStream;  // Used to write objects to the server
import java.io.BufferedReader;      // Needed to read from the console
import java.io.InputStreamReader;   // Needed to read from the console
public class EchoClient {
    public static void main(String[] args) {
        try {
            String serverName;
            System.out.println("Enter Server:");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
            serverName = in.readLine();
            final Socket sock = new Socket(serverName, EchoServer.SERVER_PORT);  
            final ObjectOutputStream output = new ObjectOutputStream(sock.getOutputStream()); 
            final ObjectInputStream input = new ObjectInputStream(sock.getInputStream());
            Message msg = null, resp = null;
            do { msg = new Message(readSomeText());
                output.writeObject(msg); //get ack 
                resp = (Message) input.readObject();
                System.out.println("\nServer says: " + resp.theMessage + "\n");
            } while (!msg.theMessage.toUpperCase().equals("EXIT"));
            sock.close();        }    }
    private static String readSomeText() {
        try { System.out.println("Enter text");
            System.out.print(" > ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            return in.readLine();      }    } } 