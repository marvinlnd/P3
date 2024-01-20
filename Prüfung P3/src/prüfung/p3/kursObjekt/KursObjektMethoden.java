/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.kursObjekt;

import javax.swing.JOptionPane;
import prüfung.p3.arrays.ObjektArrayClass;

/**
 *
 * @author lindn
 */
public class KursObjektMethoden {

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

        if (ObjektArrayClass.größeArray == ObjektArrayClass.objektArray.length -1) {
            // Array vergrößern, wenn es voll ist
            kursObjekt[] newArray = new kursObjekt[ObjektArrayClass.objektArray.length + 1];
            System.arraycopy(ObjektArrayClass.objektArray, 0, newArray, 0, ObjektArrayClass.objektArray.length);
            ObjektArrayClass.objektArray = newArray;
        }

        ObjektArrayClass.objektArray[ObjektArrayClass.größeArray] = kurs;
        ObjektArrayClass.größeArray++;

        System.out.println(ObjektArrayClass.größeArray);
    }

    public static void removeKursObjekt(KursObjektEntfernenGUI gui, String modulToRemove) {
   
  System.out.println("Anfang" + ObjektArrayClass.objektArray[0]);
        for (int i = 1; i < ObjektArrayClass.größeArray; i++) {
            if (ObjektArrayClass.objektArray[i] != null && ObjektArrayClass.objektArray[i].getModul().equals(modulToRemove)) {
                // Nur auf nicht-null-Objekte zugreifen und dann die Methode aufrufen
                
                System.out.println("Das Objekt konnte nicht entfernt werden! ");
      
            }
        }

        int indexToRemove = -1;

        // Array durchsuchen
        for (int i = 0; i < ObjektArrayClass.größeArray; i++) {
            if (ObjektArrayClass.objektArray[i].getModul().equals(modulToRemove)) {
                indexToRemove = i;
                break;
            }
            else {
                System.out.println("Es ist ein Fehler aufgetreten");
            }
        }

        
        
        
        if (indexToRemove != -1) {
           
            // Verschiebe die nachfolgenden Elemente im Array
            System.arraycopy(ObjektArrayClass.objektArray, indexToRemove + 1, ObjektArrayClass.objektArray, indexToRemove,
                    ObjektArrayClass.größeArray - indexToRemove - 1);

            
            // Reduziere die Größe des Arrays
            ObjektArrayClass.größeArray--;

            gui.showInfoDialog("Objekt mit Modul '" + modulToRemove + "' wurde erfolgreich entfernt.");
            System.out.println("Ende" + ObjektArrayClass.objektArray[0]);
        } else {
            gui.showInfoDialog("Objekt mit Modul '" + modulToRemove + "' wurde nicht gefunden.");
        }
    }
}
