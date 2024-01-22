/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import prüfung.p3.kursObjekt.KursObjektBearbeitenGUI;
import prüfung.p3.kursObjekt.KursObjektEntfernenGUI;
import prüfung.p3.kursObjekt.KursObjektMethoden;
import prüfung.p3.kursObjekt.kursObjekt;
import static prüfung.p3.listener.ObjektFensterHinzufügenÖffnen.gui;

/**
 *
 * @author Dennis Schäfer
 */
public class ObjektBearbeitenListener implements ActionListener {
    
    private KursObjektBearbeitenGUI gui;
    private String modulToEdit;  // Modul, das bearbeitet werden soll
    
    public ObjektBearbeitenListener(KursObjektBearbeitenGUI gui, String modulToEdit) {
        this.gui = gui;
        this.modulToEdit = modulToEdit;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gui != null) {
            // Rufen Sie die Methode zum Bearbeiten des Kursobjekts auf
            KursObjektMethoden.editKursObjekt(gui, modulToEdit);
        } else {
            System.out.println("gui ist null. Stellen Sie sicher, dass es korrekt initialisiert wurde.");
        }
    }
}
