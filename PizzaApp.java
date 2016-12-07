/**
 * @(#)PizzaApp.java
 *
 *
 * @author Brian Quinn
 * @version 1.00 2016/12/1
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class PizzaApp extends JFrame
{
	/** Panel to hold all of the widgets */
	private JPanel m_MainPanel;
	/** Label for the text field */
	private JLabel m_TFLabel;
	/** An editable text field */
	private JTextField m_Textfield1;
	/** Radio button 1 */
	private JRadioButton m_RadioButton1;
	/** Radio button 2 */
	private JRadioButton m_RadioButton2;
	/** Radio button group */
	private ButtonGroup m_RBGroup;
	/** Panel to hold the radio buttons */
	private JPanel m_RBPan;
	/** Label for the radio button group */
	private JLabel m_RBLabel;
	/** Check box */
	private JCheckBox m_CheckBox;
	/** Text button */
	private JButton m_TextButton;
	/** Status label */
	private JLabel m_StatusLabel;
	/** Status text field */
	private JTextField m_StatusTF;
	/** Label above the list box */
	private JLabel m_ListboxLabel;
	/** List widget */
	private JList m_List;
	/** Scroll pane for the list */
	private JScrollPane m_ListSP;
	/** Exit button */
	private JButton m_ExitButton;
	
	int size = 0;
	int pizza = 0;
	int toppings = 0;
	int total = 0;
	

	PizzaApp()
	{
		/** Set window characteristics*/
		this.setSize(640, 480);
		this.setTitle("Pizza");
		
		/** Create the main widget panel*/
		m_MainPanel = new JPanel();
		m_MainPanel.setLayout(null);
		m_MainPanel.setSize(this.getContentPane().getSize().width,
				this.getContentPane().getSize().height);
		m_MainPanel.setBackground(Color.RED);
		this.getContentPane().add(m_MainPanel);
		
		/** Create the panel to hold the radio buttons*/
		m_RBPan = new JPanel();
		m_RBPan.setLayout(null);
		m_RBPan.setSize(130, 50);
		m_RBPan.setLocation(50, 40);
		m_RBPan.setBackground(Color.LIGHT_GRAY);
		m_RBPan.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		m_MainPanel.add(m_RBPan);
		
		/** Place a label just above the panel */
		m_RBLabel = new JLabel("Size");
		m_RBLabel.setSize(110, 10);
		m_RBLabel.setLocation(55, 25);
		m_MainPanel.add(m_RBLabel);

		/** Create radio button 1 */
		m_RadioButton1 = new JRadioButton("Normal");
		m_RadioButton1.setSize(120, 20);
		m_RadioButton1.setLocation(5, 0);
		m_RadioButton1.setSelected(false);
		m_RadioButton1.setBackground(Color.lightGray);
		m_RadioButton1.addActionListener(
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
		m_RBPan.add(m_RadioButton1);
		
		/** Create the show both types radio button */
		m_RadioButton2 = new JRadioButton("Large");
		m_RadioButton2.setSize(120, 20);
		m_RadioButton2.setLocation(5, 20);
		m_RadioButton2.setSelected(false);
		m_RadioButton2.setBackground(Color.lightGray);
		m_RadioButton2.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if (size == 5)
						{
							size = 10;
						}
						
						else 
						{
							size = 10;
						}
					}
				});
		m_RBPan.add(m_RadioButton2);
		
		/** Create the button group and add the buttons */
		m_RBGroup = new ButtonGroup();
		m_RBGroup.add(m_RadioButton1); 
		m_RBGroup.add(m_RadioButton2);
		

		/** Create the label for the status Check Box */
				m_StatusLabel = new JLabel("Extra Toppings");
				m_StatusLabel.setSize(110, 18);
				m_StatusLabel.setLocation(405, 75);
				m_MainPanel.add(m_StatusLabel);
				
		/** Create the check box */
		m_CheckBox = new JCheckBox();
		m_CheckBox.setSize(120, 12);
		m_CheckBox.setBackground(Color.LIGHT_GRAY);
		m_CheckBox.setText("Bacon");
		m_CheckBox.setLocation(400, 100);
		m_CheckBox.setSelected(false);
		m_CheckBox.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						toppings += 1;     
					}
				});
		m_MainPanel.add(m_CheckBox);
		/** Create the check box */
				m_CheckBox = new JCheckBox();
				m_CheckBox.setSize(120, 12);
				m_CheckBox.setBackground(Color.LIGHT_GRAY);
				m_CheckBox.setText("Chicken");
				m_CheckBox.setLocation(400, 115);
				m_CheckBox.setSelected(false);
				m_CheckBox.addActionListener(
						new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								toppings += 2;      
							}
						});
				m_MainPanel.add(m_CheckBox);
				/** Create the check box */
				m_CheckBox = new JCheckBox();
				m_CheckBox.setSize(120, 12);
				m_CheckBox.setBackground(Color.LIGHT_GRAY);
				m_CheckBox.setText("Mushroom");
				m_CheckBox.setLocation(400, 130);
				m_CheckBox.setSelected(false);
				m_CheckBox.addActionListener(
						new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								toppings += 3;
							}
						});
				m_MainPanel.add(m_CheckBox);
				/** Create the check box */
				m_CheckBox = new JCheckBox();
				m_CheckBox.setSize(120, 12);
				m_CheckBox.setBackground(Color.LIGHT_GRAY);
				m_CheckBox.setText("Pineapple");
				m_CheckBox.setLocation(400, 145);
				m_CheckBox.setSelected(false);
				m_CheckBox.addActionListener(
						new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								toppings += 4;
							}
						});
				m_MainPanel.add(m_CheckBox);
		/** Create the text button */
		m_TextButton = new JButton("Order");
		m_TextButton.setSize(200, 40);
		m_TextButton.setLocation(400, 350);
		m_TextButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_TextButton.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						total = size + (toppings * 2) + pizza;
						/**	Print message in status text field */
						m_StatusTF.setText("your total is: " + total);
					}
				});
		m_MainPanel.add(m_TextButton);	
		
		
		/** Create the label for the status text field */
		m_StatusLabel = new JLabel("Status");
		m_StatusLabel.setSize(110, 18);
		m_StatusLabel.setLocation(50, 400);
		m_MainPanel.add(m_StatusLabel);
		
		/** Create the Status text field */
		m_StatusTF = new JTextField();
		m_StatusTF.setSize(350, 20);
		m_StatusTF.setLocation(100, 400);
		m_StatusTF.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		m_StatusTF.setEditable(false);
		m_StatusTF.setBackground(Color.WHITE);
		m_MainPanel.add(m_StatusTF);
		
		/** Create the label above the list box */
		m_ListboxLabel = new JLabel("Pizza");
		m_ListboxLabel.setSize(75, 18);
		m_ListboxLabel.setLocation(50, 100);
		m_MainPanel.add(m_ListboxLabel);
		
		/** Create the List widget */
		m_List = new JList();
		m_List.setSize(150, 100);
		m_List.addListSelectionListener(
				new ListSelectionListener()
				{
					public void valueChanged(ListSelectionEvent e)
					{
						/**	Print message in status text field */
						m_StatusTF.setText((String)(m_List.getModel().
								getElementAt(m_List.getSelectedIndex())));
					}
				});
		/** Create a Vector of strings to add to the list */
		Vector listData = new Vector();
		listData.add(new String("Margherita"));
		listData.add(new String("Pepperoni"));
		listData.add(new String("Proschuitto"));
		listData.add(new String("Hawaian"));
		m_List.setListData(listData);
		
		/** Put the list inside of a JScrollPane so we can scroll it */
		m_ListSP = new JScrollPane(m_List);
		m_ListSP.setSize(150, 150);
		m_ListSP.setLocation(50, 125);
		m_MainPanel.add(m_ListSP);
		
		/** Create the exit button */
		m_ExitButton = new JButton("Exit");
		m_ExitButton.setSize(75, 20);
		m_ExitButton.setLocation(500, 400);
		m_ExitButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_ExitButton.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						/** Exit the application with status=0 (normal exit) */
						System.exit(0);
					}
				});
		m_MainPanel.add(m_ExitButton);
		this.setVisible(true);  /** Show the window */
	}
	
	public static void main(String[] args) 
	{
		
		PizzaApp demoApp = new PizzaApp();
        }
}