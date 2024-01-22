/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package prüfung.p3.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import prüfung.p3.arrays.ObjektArrayClass;
import static prüfung.p3.arrays.ObjektArrayClass.objektList;
import prüfung.p3.kursObjekt.KursObjektBearbeitenGUI;
import prüfung.p3.kursObjekt.kursObjekt;

/**
 *
 
@author Dennis Schäfer*/
public class ObjektFensterBearbeitenÖffnen implements ActionListener {
    public KursObjektBearbeitenGUI gui;

    public ObjektFensterBearbeitenÖffnen() {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         kursObjekt kurs = new kursObjekt("Mathe 1", "Dozent", 1, 2.5, true, false);

        KursObjektBearbeitenGUI gui = new KursObjektBearbeitenGUI(kurs);
        if (gui != null) {
            new KursObjektBearbeitenGUI(kurs);
        } else {
            System.out.println("gui ist null. Stellen Sie sicher, dass es korrekt initialisiert wurde.");
        }
    }
}
