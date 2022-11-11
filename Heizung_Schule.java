package main.java.org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


// Main class
public class HeizungSchule extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private String [] coloum;
    private Object [][] data;
    private JTextField text1, text2, text3, text4, text5, text6, text7;
    public HeizungSchule(){
        // erzeugt Fenster, setzt Dimensionen, sichtbarkeit sowie Titel und größenveränderung fest





        setSize(1280,720);
        setTitle("Heizung");
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel aussenrahmen = new JPanel (new GridLayout(0,1));
        //aussenrahmen.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        // JPanel als Rahmen für das innere Panels mit Tabelle und Textfeldern etc bzw Buttons
        JPanel rahmen = new JPanel(new GridLayout(0,2));

        JButton save = new JButton("Datensatz speichern");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toTable();
            }
        });

        //fügt Panel dem Fenster zu
        add(aussenrahmen);

        aussenrahmen.add(rahmen);



        String [] coloum = {"Kundennummer", "Hausnummer", "Wohnungsnummer", "Zählerart", "Zählernummer", "Ablesedatum", "Messwerte"};

        Object [][] data = {
        };

        tableModel = new DefaultTableModel(data, coloum);
        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(500,50));
        table.setFillsViewportHeight(true);
        table.setAutoCreateRowSorter(true);

        aussenrahmen.add(table.getTableHeader(), BorderLayout.PAGE_START);
        aussenrahmen.add(table, BorderLayout.CENTER);
        //aussenrahmen.add(tableholder, BorderLayout.SOUTH);




        // Label für die Textfelder
        JLabel label1 = new JLabel("KNr.: ");
        JLabel label2 = new JLabel("Hausnr.: ");
        JLabel label3 = new JLabel("Wohnungsnr.: ");
        JLabel label4 = new JLabel("Zählerart: ");
        JLabel label5 = new JLabel("Zählernummer: ");
        JLabel label6 = new JLabel("Ablesedatum: ");
        JLabel label7 = new JLabel("Messwerte: ");
        JLabel label8 = new JLabel();


        // Textfelder zur Eingabe der Daten
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        text6 = new JTextField();
        text7 = new JTextField();

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
        rahmen.add(label8);
        rahmen.add(save);


        setVisible(true);
    }

    private void toTable() {
        tableModel.addRow(new Object[]{ text1.getText(), text2.getText(), text3.getText(), text4.getText(), text5.getText(), text6.getText(), text7.getText() });
    }

    // main method
    public static void main( String[] args) {
        HeizungSchule heizungschule = new HeizungSchule();
        // ende Main Class
    }
}