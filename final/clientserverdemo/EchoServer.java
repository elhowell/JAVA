package clientserverdemo;
import java.net.ServerSocket;  
import java.net.Socket; 
public class EchoServer
{    public static final int SERVER_PORT = 8765;
    public static void main(String[] args)
    {
	try{	
	    final ServerSocket serverSock = new ServerSocket(SERVER_PORT);
	    Socket sock = null;
	    EchoThread thread = null;
	    while(true){
		sock = serverSock.accept();    
		thread = new EchoThread(sock);  
		thread.start();       }                               }
	catch(Exception e){
	    System.err.println("Error: " + e.getMessage());
	    e.printStackTrace(System.err);	}    } }