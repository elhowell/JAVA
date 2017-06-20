package clientserverdemo;

public class Message implements java.io.Serializable
{
    public String theMessage;
    public Message(String _msg){
	theMessage = _msg;
    }

}  