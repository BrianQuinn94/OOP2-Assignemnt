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
    setSize (700,350);
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
    
    	else{
    	response.setText("Menu Item "+ menuName +" is selected");
    	}
    	
    	
    }
    private void createUserMenu(){
    	JMenuItem item;
    	UserMenu = new JMenu("Users");
    
    	
    	
    	
    	
    	item = new JMenuItem("New User");	
    	item.addActionListener(this);
    	UserMenu.add(item);
    	item = new JMenuItem("Delete User");	
    	item.addActionListener(this);
    	UserMenu.add(item);
    	item = new JMenuItem("Quit");	
    	item.addActionListener(this);
    	UserMenu.add(item);
    	
    	
    	}
    private class ButtonListener implements ActionListener {
	  public void actionPerformed(ActionEvent e)
	  	{
	  		JOptionPane.showMessageDialog(null,"You have pressed the button");
	  	}
    
}
}