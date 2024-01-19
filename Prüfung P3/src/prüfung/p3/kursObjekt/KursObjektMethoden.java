/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.kursObjekt;

import javax.swing.JOptionPane;

/**
 *
 * @author lindn
 */
public class KursObjektMethoden {
    
    static int größeArray = 1;

    static kursObjekt[] modulArray = new kursObjekt[größeArray];
    public static void addKursObjekt(KursObjektGUI gui) {

        System.out.println("Semester-Text: [" + KursObjektGUI.semester.getText() + "]");
        System.out.println("Note-Text: [" + KursObjektGUI.note.getText() + "]");

        String modul = gui.modul.getText().trim();
        String dozent = gui.dozent.getText().trim();

        System.out.println("Semester-Text: [" + KursObjektGUI.semester.getText() + "]");
        System.out.println("Note-Text: [" + KursObjektGUI.note.getText() + "]");

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

            if (note < 1.0 || 5.0 > note) {
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

       // modulArray[größeArray] = kurs;
    }

}
