package de.gc.gui.swing.simple;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.JFrame;


import java.util.Arrays;


// Main class
public class Main extends JFrame{


	
// main method
	public static void main( String[] args) {
		
		// erzeugt Fenster, setzt Dimensionen, sichtbarkeit sowie Titel und größenveränderung fest
		JFrame window = new JFrame();
		window.setSize(1280,720);
		window.setTitle("Heizung");
		window.setResizable(true);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		JPanel aussenrahmen = new JPanel (new GridLayout(0,1));
		
		
		// JPanel als Rahmen für das innere Panels mit Tabelle und Textfeldern etc bzw Buttons
		JPanel rahmen = new JPanel(new GridLayout(0,2));
	

		
		//fügt Panel dem Fenster zu
		window.add(aussenrahmen);
		aussenrahmen.add(rahmen);
		

		
		
		// Label für die Textfelder
				JLabel label1 = new JLabel("KNr.: ");
				JLabel label2 = new JLabel("Hausnr.: ");
				JLabel label3 = new JLabel("Wohnungsnr.: ");
				JLabel label4 = new JLabel("Zählerart: ");
				JLabel label5 = new JLabel("Zählernummer: ");
				JLabel label6 = new JLabel("Ablesedatum: ");
				JLabel label7 = new JLabel("Messwerte: ");
				
			// Textfelder zur Eingabe der Daten
				JTextField text1 = new JTextField();
				JTextField text2 = new JTextField();
				JTextField text3 = new JTextField();
				JTextField text4 = new JTextField();
				JTextField text5 = new JTextField();
				JTextField text6 = new JTextField();
				JTextField text7 = new JTextField();

			//Labels zu Panel 1 hinzufügen
				rahmen.add(label1);
				rahmen.add(text1);
				rahmen.add(label2);
				rahmen.add(text2);
				rahmen.add(label3);
				rahmen.add(text3);
				rahmen.add(label4);
				rahmen.add(text4);
				rahmen.add(label5);
				rahmen.add(text5);
				rahmen.add(label6);
				rahmen.add(text6);
				rahmen.add(label7);
				rahmen.add(text7);
				

				window.setVisible(true);
			// ende Main Methode
		}
	
// Ende Main Class
}



public class JTable extends JComponent implements TableModelListener, Scrollable, TableColumnModelListener, ListSelectionListener, CellEditorListener, Accessible, RowSorterListener {
	
	
	
	
	// Tabelle ---------------------------------------------
	
	// Arrays für Tabellendaten
	String [] coloum = {"Kundennummer", "Hausnummer", "Wohnungsnummer", "Zählerart", "Zählernummer", "Ablesedatum", "Messwerte"};
	
	String [][] data = {
			
		{"ydjsdhf", "sdfk,cjsk"},
		{"schjydx", "skjfck"},
		{"dsjfhejksdhf", "sdajfch"},	
	};
	
	// Tabelle selbst

	
	public TableModel dataModel = new AbstractTableModel(){
		
		public int getColoumnCount() {return 10;}
		public int getRowCount() {return 10;}
		public Object getValueAt(int row, int col) { return Integer(row*col);}
	};
	
	
	JTable	table = new JTable(dataModel);
	JScrollPane tableholder = new JScrollPane(table);
	

	// einfügen der Tabelle 
	tableholder.add(table);
	main(String args[]).aussenrahmen.add(tableholder, BorderLayout.SOUTH);
	
	// Tabelle ende ------------------------------------------
};	
	