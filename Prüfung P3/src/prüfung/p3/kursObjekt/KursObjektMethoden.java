/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.kursObjekt;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import prüfung.p3.PrüfungP3;
import prüfung.p3.arrays.ObjektArrayClass;
import static prüfung.p3.listener.ObjektFensterEntfernenÖffnen.gui;
import prüfung.p3.tabs.ModuleTab;

/**
 *
 * @author lindn
 */
public class KursObjektMethoden {

    private static String modulToRemove;

    public static void addKursObjekt(KursObjektHinzufügenGUI gui) {

        String modul = gui.modul.getText().trim();
        String dozent = gui.dozent.getText().trim();

        int semester;
        double note;

        boolean bestanden;

        String semesterText = KursObjektHinzufügenGUI.semester.getText().trim();
        String noteText = KursObjektHinzufügenGUI.note.getText().trim();

        if (semesterText.isEmpty() || noteText.isEmpty()) {
            gui.showInfoDialog("Bitte geben Sie gültige Werte für Semester und Note ein");
            return;
        }

        try {

            semester = Integer.parseInt(semesterText);
            note = Double.parseDouble(noteText);

            if (note < 1.0 || 5.0 < note) {
                gui.showInfoDialog("Die Note muss zwischen 1.0 und 5.0 liegen");
                return;
            }

        } catch (NumberFormatException ex) {

            gui.showInfoDialog("Ungültige Eingabe für Semester oder Note");
            return;
        }

        if (note < 5) {
            bestanden = true;
        } else {
            bestanden = false;
        }

        kursObjekt kurs = new kursObjekt(modul, dozent, semester, note, bestanden);

        if (ObjektArrayClass.größeArrayList == ObjektArrayClass.objektList.size()) {
            // ArrayList vergrößern, wenn sie voll ist
            ObjektArrayClass.objektList.add(kurs);
            ObjektArrayClass.größeArrayList++;

            System.out.println(ObjektArrayClass.größeArrayList);
        }
        ObjektArrayClass.objektList.set(ObjektArrayClass.größeArrayList - 1, kurs);
        ObjektArrayClass.größeArrayList++;

        System.out.println(ObjektArrayClass.größeArrayList);
    }

   

    public static void removeKursObjekt(KursObjektEntfernenGUI gui, String modulToRemove) {
        System.out.println("Anfang Liste: " + ObjektArrayClass.objektList);

        if (ObjektArrayClass.objektList.isEmpty()) {
            System.out.println("Die Liste ist leer");
            return;
        }

        int indexToRemove = -1;

        // Liste durchsuchen
        for (int i = 0; i < ObjektArrayClass.objektList.size(); i++) {
            if (ObjektArrayClass.objektList.get(i).getModul().equals(modulToRemove)) {
                indexToRemove = i;
                break;
            } else {
                System.out.println("Es ist ein Fehler aufgetreten");
            }
        }

        if (indexToRemove != -1) {
            // Entferne das Element aus der Liste
            ObjektArrayClass.objektList.remove(indexToRemove);
            gui.showInfoDialog("Objekt mit Modul '" + modulToRemove + "' wurde erfolgreich entfernt.");
            System.out.println("Anfang Liste: " + ObjektArrayClass.objektList);
            
            new PrüfungP3();
            
            // Aktualisiere die Tabelle
          
        } else {
            gui.showInfoDialog("Objekt mit Modul '" + modulToRemove + "' wurde nicht gefunden.");
        }

        System.out.println(ObjektArrayClass.größeArrayList);
    }

//updaten der tabelle
}
