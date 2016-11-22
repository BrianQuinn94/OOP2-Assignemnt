/*Java Pizza App*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


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
    setSize (700,700);
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
    	UserMenu = new JMenu("User");
    	
    	item = new JMenuItem("New User");	
    	item.addActionListener(this);
    	UserMenu.add(item);
    	
    	}
    
}