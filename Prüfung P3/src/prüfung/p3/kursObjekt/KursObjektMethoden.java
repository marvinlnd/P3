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
    
     public static void addKursObjekt(KursObjektGUI gui){
        
        String modul = gui.modul.getText();
        String dozent = gui.dozent.getText();
        
        int semester;
        double note;
        
        try{
            
            semester = Integer.parseInt(KursObjektGUI.semester.getText());
            note = Double.parseDouble(KursObjektGUI.note.getText());
            
            if(note < 1.0 || 5.0 > note){
                gui.showInfoDialog("Die Note muss zwischen 1.0 und 5.0 liegen");
                return;
            }
            
        }catch(NumberFormatException ex){
            
            gui.showInfoDialog("Ungültige Eingabe für Semester oder Note");
            return;
        }
        
        boolean bestanden = KursObjektGUI.bestanden.isSelected();
        
        kursObjekt kurs = new kursObjekt(modul, dozent, semester, note, bestanden);
        
        kurs.displayObjektInfo();
    }
    
}
