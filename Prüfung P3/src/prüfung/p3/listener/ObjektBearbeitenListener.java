/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import prüfung.p3.kursObjekt.KursObjektBearbeitenGUI;
import prüfung.p3.kursObjekt.KursObjektEntfernenGUI;
import prüfung.p3.kursObjekt.kursObjekt;


/**
 *
 * @author Dennis Schäfer
 */
public class ObjektBearbeitenListener implements ActionListener {
    
    private KursObjektBearbeitenGUI gui;
    
    public ObjektBearbeitenListener(KursObjektBearbeitenGUI gui) {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gui != null) {
            gui.openDetailsPanel();
        } else {
            System.out.println("gui ist null. Stellen Sie sicher, dass es korrekt initialisiert wurde.");
        }
    }
}   

