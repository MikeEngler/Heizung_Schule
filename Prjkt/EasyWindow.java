package de.gc.gui.swing.simple;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.util.Arrays;

/*
  A easy window
 */
public class EasyWindow extends JFrame{
	
private static final long serialVersionUID = 1L;



/** main*/
	public static void main(final String[] args) {
		new EasyWindow();
	}
	
	
	//Konstruktor
	public EasyWindow() 
	{
		super("easy window");
		
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(final WindowEvent e) {
			exit();
		}});
	

	
		Container con = getContentPane();
		
	//	GridLayout layout = new GridLayout(0, 2);
		JPanel rahmen = new JPanel(new GridLayout(0,1));
		
		JLabel label1 = new JLabel("KNr.: ");
		JLabel label2 = new JLabel("Hausnr.: ");
		JLabel label3 = new JLabel("Wohnungsnr.: ");
		JLabel label4 = new JLabel("Zählerart: ");
		JLabel label5 = new JLabel("Zählernummer: ");
		JLabel label6 = new JLabel("Ablesedatum: ");
		JLabel label7 = new JLabel("Messwerte: ");
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		JTextField text4 = new JTextField();
		JTextField text5 = new JTextField();
		JTextField text6 = new JTextField();
		JTextField text7 = new JTextField();
	
	      

		
	    String[] title = {"Kundennummer", "Hausnummer", "Wohnungsnummer", "Zählerart", "Ablesedatum", "Messwerte"};
	    String[][] data = {
	    		
	    		{"sjadk", "sjfdsk", "kjsd"},
	    		{"asdhjash", "shfdjh", "djfhsjd"},
	    		{"sdfjks", "sdjfchvsj", "jdsfkdfj"}
	    };	
		
		JPanel p1 = new JPanel(new GridLayout(0,2));
		JScrollPane p2 = new JScrollPane();
		
		JButton btn = new JButton("Datensatz löschen");
		
		
		JTable table = new JTable(data, title);
		
		
		
		p1.add(label1);
		p1.add(text1);
		p1.add(label2);
		p1.add(text2);
		p1.add(label3);
		p1.add(text3);
		p1.add(label4);
		p1.add(text4);
		p1.add(label5);
		p1.add(text5);
		p1.add(label6);
		p1.add(text6);
		p1.add(label7);
		p1.add(text7);
		
		p2.add(table);
		
		con.add(btn, BorderLayout.SOUTH);
		
		
		con.add(rahmen, BorderLayout.CENTER);
		
		rahmen.add(p1);
        rahmen.add(p2);	
        
       
        
	setSize(1280, 720);
	setVisible(true);
	}
	
	
	
	private void exit() {
		System.exit(0);
	}
}