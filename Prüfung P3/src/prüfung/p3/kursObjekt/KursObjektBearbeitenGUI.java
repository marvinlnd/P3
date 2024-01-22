/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.kursObjekt;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.lang.String;
import prüfung.p3.PrüfungP3;
import prüfung.p3.arrays.ObjektArrayClass;
import prüfung.p3.icons.ErstelltesIcon;
import static prüfung.p3.kursObjekt.KursObjektEntfernenGUI.modul;
import prüfung.p3.listener.ObjektBearbeitenListener;
import prüfung.p3.listener.ObjektFensterBearbeitenÖffnen;
import prüfung.p3.listener.ObjektFensterEntfernenÖffnen;
import prüfung.p3.listener.ObjektFensterHinzufügenÖffnen;
import prüfung.p3.sprachauswahl.SpracheVariablen;

/**
 *
 * @author Dennis Schäfer
 */
public class KursObjektBearbeitenGUI extends JFrame {

    private kursObjekt kurs;
    private JTextField modul;
    private JTextField note;
    private JTextField dozent;
    private JTextField semester;
    private JTextField versuche;
    private JCheckBox belegt;

    public KursObjektBearbeitenGUI(kursObjekt kurs) {
        super("Modul bearbeiten");

        this.kurs = kurs;
        modul = new JTextField(kurs.getModul());  // Hier die Initialisierung mit dem Wert aus dem kurs-Objekt
        note = new JTextField(String.valueOf(kurs.getNote())); // Hier die Initialisierung mit dem Wert aus dem kurs-Objekt
        dozent = new JTextField(kurs.getDozent()); // Hier die Initialisierung mit dem Wert aus dem kurs-Objekt
        semester = new JTextField(String.valueOf(kurs.getSemester())); // Hier die Initialisierung mit dem Wert aus dem kurs-Objekt
        versuche = new JTextField(String.valueOf(kurs.getVersuche())); // Hier die Initialisierung mit dem Wert aus dem kurs-Objekt
        belegt = new JCheckBox();
        belegt.setSelected(kurs.isBelegt());
        
        JButton bearbeiten = new JButton("Bearbeiten");

        bearbeiten.addActionListener(new ObjektBearbeitenListener(this ,modul.getText())); 
            
        
           
        

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5)); // 3 Zeilen, 2 Spalten, Abstand 5x5
        panel.add(new JLabel("Welches Modul möchten Sie bearbeiten?"));
        panel.add(modul);
        panel.add(new JLabel()); // Leeres Label für den Abstand
        panel.add(bearbeiten);

        add(panel);
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void openDetailsPanel() {
        // Schließen Sie das aktuelle Fenster, um das zweite Panel zu öffnen

        // Öffnen Sie das zweite Panel für die Detailsbearbeitung
        showEditDialog();
    }

    void showEditDialog() {
        JTextField modulField = new JTextField(modul.getText());
        JTextField noteField = new JTextField(note.getText());
        JTextField dozentField = new JTextField(dozent.getText());
        JTextField semesterField = new JTextField(semester.getText());
        JTextField versucheField = new JTextField(versuche.getText());
        JCheckBox belegtField = new JCheckBox();
        belegtField.setSelected(belegt.isSelected());

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hier aktualisieren Sie die Werte in den Textfeldern
                modul.setText(modulField.getText());
                note.setText(noteField.getText());
                dozent.setText(dozentField.getText());
                semester.setText(semesterField.getText());
                versuche.setText(versucheField.getText());
                belegt.setSelected(belegtField.isSelected());

                // Änderungen direkt auf das kursObjekt-Objekt anwenden
                kurs.setModul(modul.getText());
                kurs.setNote(Double.parseDouble(note.getText()));
                kurs.setDozent(dozent.getText());
                kurs.setSemester(Integer.parseInt(semester.getText()));
                kurs.setVersuche(Integer.parseInt(versuche.getText()));
                kurs.setBelegt(belegt.isSelected());

                // Fügen Sie hier weitere Aktualisierungen für andere Attribute hinzu
                // Schließen Sie den Dialog
                dispose();
                new PrüfungP3();
            }
        });

        JButton cancelButton = new JButton("Abbrechen");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Schließen Sie den Dialog ohne Änderungen vorzunehmen
                dispose();
            }
        });

        JPanel editPanel = new JPanel(new GridLayout(6, 2, 5, 5)); // 6 Zeilen, 2 Spalten, Abstand 5x5
        editPanel.add(new JLabel("Modul:"));
        editPanel.add(modulField);
        editPanel.add(new JLabel("Note:"));
        editPanel.add(noteField);
        editPanel.add(new JLabel("Dozent:"));
        editPanel.add(dozentField);
        editPanel.add(new JLabel("Semester:"));
        editPanel.add(semesterField);
        editPanel.add(new JLabel("Versuche:"));
        editPanel.add(versucheField);
        editPanel.add(new JLabel("Belegt:"));
        editPanel.add(belegtField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        // Erstellen Sie Ihren Dialog mit den erstellten Komponenten
        // Hier können Sie ein GridLayout, GroupLayout oder ein anderes Layout-Manager verwenden
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(editPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null); // Zentrieren Sie den Dialog auf dem Bildschirm
        setVisible(true);
    }

    // Weitere Methoden...
    public void showInfoDialog(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
