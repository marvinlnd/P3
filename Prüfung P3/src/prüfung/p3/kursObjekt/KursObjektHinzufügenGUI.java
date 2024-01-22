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
import prüfung.p3.PrüfungP3;
import prüfung.p3.icons.ErstelltesIcon;
import prüfung.p3.listener.ObjektFensterHinzufügenÖffnen;
import prüfung.p3.sprachauswahl.SpracheVariablen;

/**
 *
 * @author lindn
 */
public class KursObjektHinzufügenGUI extends JFrame {

    static JTextField modul;
    static JTextField note;
    static JTextField dozent;
    static JTextField semester;
    static JTextField versuche;
    static JCheckBox bestanden;
    static JCheckBox belegt;

    public KursObjektHinzufügenGUI() {
        super("Modul hinuzufügen");

        modul = new JTextField(10);
        note = new JTextField(10);
        dozent = new JTextField(10);
        semester = new JTextField(10);
        versuche = new JTextField(10);
        belegt = new JCheckBox();

        JButton bestätigen = new JButton(ErstelltesIcon.createIcon("/prüfung/p3/icons/92.gif", 16, 16));

        bestätigen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                KursObjektMethoden.addKursObjekt(ObjektFensterHinzufügenÖffnen.gui);
                new PrüfungP3();

            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel(SpracheVariablen.module));
        panel.add(modul);
        panel.add(new JLabel(SpracheVariablen.note + ": "));
        panel.add(note);
        panel.add(new JLabel(SpracheVariablen.dozent + ": "));
        panel.add(dozent);
        panel.add(new JLabel(SpracheVariablen.zeitpunktDerBelegung + ": "));
        panel.add(semester);
        panel.add(new JLabel(SpracheVariablen.anzahlVersuche + ": "));
        panel.add(versuche);
        panel.add(new JLabel(SpracheVariablen.belegt));
        panel.add(belegt);

        belegt.isSelected();
        panel.add(bestätigen);

        add(panel);
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void showInfoDialog(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
