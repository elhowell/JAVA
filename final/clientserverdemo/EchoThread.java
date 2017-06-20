package clientserverdemo;
import java.lang.Thread;      
import java.net.Socket;
import java.io.ObjectInputStream;   
import java.io.ObjectOutputStream;  
public class EchoThread extends Thread
{
    private final Socket socket;                   
    public EchoThread(Socket _socket)
    {	    	socket = _socket;    }
    public void run()
    {
	try{final ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
	    final ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
	    Message msg = null;
	    int count = 0;
	    do{		msg = (Message)input.readObject();
		System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "] " + msg.theMessage); //ack
		count++;
		output.writeObject(new Message("Recieved message #" + count));
	    }while(!msg.theMessage.equals("exit"));
	    socket.close();	}
	catch(Exception e){
	    System.err.println("Error: " + e.getMessage());
	    e.printStackTrace(System.err);	}    }  } 