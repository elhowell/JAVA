
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class LotteryGUI extends JFrame {
    //buttons to generate lottery tickets
    private JButton RealTicketButton;
    private JButton FakeTicketButton;
    private JTextField TicketField;// to display ticket number
    private JPanel panel;
   //objects of FakeLottery and Lottery Classes
    private FakeLottery fakeTicket;
    private Lottery realTicket;
   //for window
    public static final int WINDOW_LENGTH  = 150;
    public static final int WINDOW_WIDTH  = 500;
    public LotteryGUI()
    {
    	super("Display lottery ticket");
    	RealTicketButton = new JButton("Real Ticket");
    	//set the action  command
    	RealTicketButton.setActionCommand("real");
    	
    	FakeTicketButton = new JButton("Fake Ticket");
    	//set the action command
    	FakeTicketButton.setActionCommand("fake");
    	
    	TicketField = new JTextField(10);
    	fakeTicket = new FakeLottery();
    	realTicket = new Lottery();
    	panel = new JPanel();
    	// add the listener to the buttons
    	FakeTicketButton.addActionListener(new lotteryListener() );
    	RealTicketButton.addActionListener(new lotteryListener());
		panel.add(TicketField);
	       panel.add(RealTicketButton);
		panel.add(FakeTicketButton);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(WINDOW_WIDTH, WINDOW_LENGTH);  	
    }
    class lotteryListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			//check the button being called 
			if(e.getActionCommand()=="real")
			{
				fakeTicket.generateTicket();
				//TicketField.setText(realTicket.getTicket().toString());
				//TicketField.getText();
			}
			if(e.getActionCommand()=="fake")
			{
				realTicket.generateTicket();

				//TicketField.setText(fakeTicket.getTicket().toString());
				//TicketField.getText();
         	}		}    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LotteryGUI gui = new LotteryGUI();	}   }
