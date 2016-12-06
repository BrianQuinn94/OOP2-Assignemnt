/*Java Pizza App*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Object;
import java.awt.event.MouseAdapter;
import javax.swing.ToolTipManager;

public class StartMenu extends JFrame implements ActionListener{
		JMenu UserMenu;
		JLabel response;
		JButton button; 
		
			
    public static void main(String[] args){
    	StartMenu start = new StartMenu();
    	start.setVisible(true);
    
    }
    
    public StartMenu(){
    Container cPane;
    
    setTitle ("Pizza App");
    setSize (700,300);
    setResizable(false);
    setLocation(685,220);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    cPane = getContentPane();
    cPane.setLayout(new FlowLayout());
    createUserMenu();
    
    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);
    menuBar.setBackground(Color.red);
    menuBar.add(UserMenu);
    
    response = new JLabel("");
    response.setSize(250,50);
    cPane.add(response);
   	
   	button = new JButton("New Order");
	//button.setVisible(true);
    button.setToolTipText("Click this to start a new order.");
	cPane.add(button);	
	button.addActionListener(new ButtonListener());	
    }
   
    
    public void actionPerformed(ActionEvent event){
    	String menuName;
    	menuName = event.getActionCommand();
    	
    	if (menuName.equals("Quit")){
    		System.exit(0);
    		}
    	if(menuName.equals("New Users")){
    		//AddUser();
    			
    		}
			
    	if(menuName.equals("Select User"))
    	{
    	
    	}
    	
    }
    				
    
    private void createUserMenu(){
    	JMenuItem item;
    	UserMenu = new JMenu("Users");
    
    	item = new JMenuItem("New User");	
    	item.addActionListener(this);
    	UserMenu.add(item);
    	item = new JMenuItem("Select User");	
    	item.addActionListener(this);
    	UserMenu.add(item);
    	UserMenu.addSeparator();
    	item = new JMenuItem("Quit");	
    	item.addActionListener(this);
    	UserMenu.add(item);
    	
    	
    	}
    	
   //* public void addUser(){
    /*	addUser AU new = addUser(
    /*		JOptionPane.showInputDialog("Name : "),
    /*		JOptionPane.showInputDialog("Age : "),
    /*		JOptionPane.showInputDialog("Address : "),
    		);
    	}
    */	
    	
    	
    private class ButtonListener implements ActionListener {
	  public void actionPerformed(ActionEvent e)
	  	{
	  		PizzaApp pizza = new PizzaApp();
	  		pizza.setVisible(true);
	  		//JOptionPane.showMessageDialog(null,"Please select the type of pizza you would like to order");
	  		//setSize (500,500);
	  	}
    
	}
}