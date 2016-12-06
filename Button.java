import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Button extends JFrame {
	
	JButton button;
  	
  	public Button() {
			super();
			
			Container cPane = getContentPane();
		
			cPane.setLayout(new FlowLayout());
			
			button = new JButton("Press here");
			
			cPane.add(button);
				
			button.addActionListener(new ButtonListener());	
					
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	public static void main(String args[]){
			Button b = new Button();
			b.setVisible(true);
		}
		
	
	private class ButtonListener implements ActionListener {
	   
	  public void actionPerformed(ActionEvent e)
	  	{
	  		//JOptionPane.showMessageDialog(null,"You have pressed the button");
	  	}
    }
    
  } 
