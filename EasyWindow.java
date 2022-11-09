package de.gc.gui.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
  A easy window
 */
public class EasyWindow extends JFrame{
	
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
		JLabel label = new JLabel("Daten: ");
		JTextField text = new JTextField();
		JPanel p = new JPanel(new GridLayout(0,1));
		JButton btn = new JButton("Click me");
		
		p.add(label);
		p.add(text);
		
		con.add(p);
		
		
	
	
	setSize(400, 100);
	setVisible(true);
	}
	
	
	
	private void exit() {
		System.exit(0);
	}
}
