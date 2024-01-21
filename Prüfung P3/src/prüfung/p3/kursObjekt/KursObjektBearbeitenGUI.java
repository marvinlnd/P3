/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.kursObjekt;

import java.awt.BorderLayout;
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
import prüfung.p3.icons.ErstelltesIcon;
import static prüfung.p3.kursObjekt.KursObjektEntfernenGUI.modul;
import prüfung.p3.listener.ObjektFensterBearbeitenÖffnen;
import prüfung.p3.listener.ObjektFensterHinzufügenÖffnen;
import prüfung.p3.sprachauswahl.SpracheVariablen;

/**
 *
 * @author Dennis Schäfer
 */
public class KursObjektBearbeitenGUI extends JFrame {

    protected static JTextField modul;
    protected static JTextField note;
    protected static JTextField dozent;
    protected static JTextField semester;
    protected static JTextField versuche;
    protected static JCheckBox bestanden;
    protected static JCheckBox belegt;

    public KursObjektBearbeitenGUI() {
        super("Modul bearbeiten");

        modul = new JTextField(10);
        note = new JTextField(10);
        dozent = new JTextField(10);
        semester = new JTextField(10);
        versuche = new JTextField(10);
        belegt = new JCheckBox();

        JButton bearbeiten = new JButton(ErstelltesIcon.createIcon("/prüfung/p3/icons/73.gif", 16, 16));

        bearbeiten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                KursObjektMethoden.editKursObjekt(ObjektFensterBearbeitenÖffnen.gui, modul.getText());  // Das klappt noch nicht
                new PrüfungP3();

            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel(SpracheVariablen.welches + SpracheVariablen.module + " "+ SpracheVariablen.bearbeiten));
        panel.add(modul);

        belegt.isSelected();
        panel.add(bearbeiten);

        add(panel);
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void showEditDialog() {
        JTextField modulField = new JTextField(modul.getText());
        JTextField dozentField = new JTextField(dozent.getText());

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hier aktualisieren Sie die Werte in den Textfeldern
                modul.setText(modulField.getText());
                dozent.setText(dozentField.getText());

                // Fügen Sie hier weitere Aktualisierungen für andere Attribute hinzu

                // Schließen Sie den Dialog
                dispose();
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

        JPanel editPanel = new JPanel(new BorderLayout());
        editPanel.add(new JLabel("Modul:"), BorderLayout.WEST);
        editPanel.add(modulField, BorderLayout.CENTER);
        editPanel.add(new JLabel("Dozent:"), BorderLayout.WEST);
        editPanel.add(dozentField, BorderLayout.CENTER);

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
    }

    public void showInfoDialog(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    
    
 
}
