/**
 * @(#)PizzaApp.java
 *
 *
 * @author Brian Quinn
 * @version 1.00 2016/12/1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Object;

public class PizzaApp extends JFrame {
	
	JPanel MainPanel;
	/** Label for the text field */
	JLabel TFLabel;
	/** An editable text field */
	JTextField Textfield1;
	/** Radio Button 1 */
	JRadioButton RadioButton1;
	/** Radio Button 2 */
	JRadioButton RadioButton2;
	/** Radio Button 3 */
	JRadioButton RadioButton3;
	/** Radio button group */
	ButtonGroup RBGroup;
	/** Panel to hold the radio buttons */
	JPanel RBPanel;
	/** Label for the radio button group */
	JLabel RBLabel;
	/** Check box */
	JCheckBox CheckBox;
	/** Text button */
	JButton TextButton;
	/** Image button */
	//JButton ImageButton;
	/** Status label */
	JLabel StatusLabel;
	/** Status text field */
	JTextField StatusTF;
	/** Label above the list box */
	JLabel ListboxLabel;
	/** List widget */
	JList List;
	/** Scroll pane for the list */
	JScrollPane ListSP;
	/** Exit button */
	JButton ExitButton;
	
	int size = 0;
	int pizza = 0;
	int toppings = 0;
	int total = 0;
		
	
    public PizzaApp() {
    	
    	Container cPane;
    	//set Window info
    	setTitle("Pizza");
    	setSize(640, 480);
		
		
    	MainPanel = new JPanel();
    	MainPanel.setLayout(null);
    	MainPanel.setSize(this.getContentPane().getSize().width,
    		this.getContentPane().getSize().height);
    	MainPanel.setBackground(Color.GRAY);
    	this.getContentPane().add(MainPanel);
    	
    	//creates Panel to hold radio buttons
    	RBPanel = new JPanel();
    	RBPanel.setLayout(null);
    	RBPanel.setSize(130, 70);
    	RBPanel.setLocation(50, 40);
    	RBPanel.setBackground(Color.LIGHT_GRAY);
    	MainPanel.add(RBPanel);
    	
    	RBLabel = new JLabel("Pizza Size");
    	RBLabel.setSize(110, 10);
    	RBLabel.setLocation(55, 25);
    	MainPanel.add(RBPanel);
    	
    	RadioButton1 = new JRadioButton("Small");
    	RadioButton1.setSize(120, 20);
    	RadioButton1.setLocation(5, 0);
    	RadioButton1.setSelected(false);
    	RadioButton1.addActionListener(
    		new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				if (size == 10)
    				{
						size = 5;
    				}
    				else
    				{
    					size = 5;	
    				}
    				
    			}	
    		});
    	RBPanel.add(RadioButton1);
    	
    	RadioButton2 = new JRadioButton("Medium");
    	RadioButton2.setSize(120, 20);
    	RadioButton2.setLocation(5, 20);
    	RadioButton2.setSelected(false);
    	RadioButton2.addActionListener(
    		new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				if (size == 10)
    				{
						size = 5;
    				}
    				else
    				{
    					size = 5;	
    				}
    				
    			}	
    		});
    	RBPanel.add(RadioButton2);
    	
    	RadioButton3 = new JRadioButton("Large");
    	RadioButton3.setSize(120, 20);
    	RadioButton3.setLocation(5, 40);
    	RadioButton3.setSelected(false);
    	RadioButton3.addActionListener(
    		new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				if (size == 15)
    				{
						size = 5;
    				}
    				else
    				{
    					size = 5;	
    				}
    				
    			}	
    		});
    	RBPanel.add(RadioButton3);
    	
    	//Create radio button group
    	RBGroup = new ButtonGroup();
    	RBGroup.add(RadioButton1);
    	RBGroup.add(RadioButton2);
    	RBGroup.add(RadioButton3);
    	
    	//Creates label for Staus Check box.
    	StatusLabel = new JLabel("Extra Toppings");
		StatusLabel.setSize(110, 18);
		StatusLabel.setLocation(405, 75);
		MainPanel.add (StatusLabel); 
			
		CheckBox = new JCheckBox();
		CheckBox.setSize(120, 12);
		CheckBox.setBackground(Color.LIGHT_GRAY);
		CheckBox.setText("Bacon");
		CheckBox.setLocation(400, 100);
		CheckBox.setSelected(false);
		CheckBox.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						toppings += 1;     
					}
				});
		   
    }
    
   		 public static void main(String[] args) 
		{
		
		PizzaApp demoApp = new PizzaApp();
		
        }
}