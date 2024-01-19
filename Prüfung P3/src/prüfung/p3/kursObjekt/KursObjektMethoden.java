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
    
    

    
   
    public static void addKursObjekt(KursObjektGUI gui) {

   

        String modul = gui.modul.getText().trim();
        String dozent = gui.dozent.getText().trim();

        
        int semester;
        double note;
        
        boolean bestanden;

        String semesterText = KursObjektGUI.semester.getText().trim();
        String noteText = KursObjektGUI.note.getText().trim();

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

       if(note < 5){
           bestanden = true;
       }
       else{
           bestanden = false;
       }

        kursObjekt kurs = new kursObjekt(modul, dozent, semester, note, bestanden);

        System.out.println(ObjektArrayClass.größeArray);
       ObjektArrayClass.objektArray[ObjektArrayClass.größeArray -1] = kurs;
       ObjektArrayClass.größeArray = ObjektArrayClass.größeArray +1;
        gui.showInfoDialog("Modul erfolgreich hinzugefügt");
        System.out.println(kurs.getFach());
        
       
       
       System.out.println(ObjektArrayClass.größeArray);
    }

}
