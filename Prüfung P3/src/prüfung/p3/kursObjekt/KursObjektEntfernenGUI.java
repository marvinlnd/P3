/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.kursObjekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import prüfung.p3.icons.ErstelltesIcon;
import prüfung.p3.listener.ObjektFensterEntfernenÖffnen;
import prüfung.p3.sprachauswahl.SpracheVariablen;

/**
 *
 * @author Dennis Schäfer
 */
public class KursObjektEntfernenGUI extends JFrame {

    protected static JTextField modul;
    protected static JTextField note;
    protected static JTextField dozent;
    protected static JTextField semester;
    protected static JCheckBox bestanden;

    public KursObjektEntfernenGUI() {
        super("Modul entfernen");

        modul = new JTextField(10);
        note = new JTextField(10);
        dozent = new JTextField(10);
        semester = new JTextField(10);
        JButton entfernen = new JButton(ErstelltesIcon.createIcon("/prüfung/p3/icons/14.gif", 16, 16));

        entfernen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String modulToRemove = modul.getText().trim();
                KursObjektMethoden.removeKursObjekt(ObjektFensterEntfernenÖffnen.gui, modulToRemove);
            }
        });

        
        
        JPanel panel = new JPanel();
        panel.add(new JLabel(SpracheVariablen.welches + SpracheVariablen.module + " "+ SpracheVariablen.entfernen));
        panel.add(modul);
        

    
        
        
        panel.add(entfernen);
        add(panel);
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void showInfoDialog(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}