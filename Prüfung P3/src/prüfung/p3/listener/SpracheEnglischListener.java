/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import prüfung.p3.PrüfungP3;

import prüfung.p3.sprachauswahl.SpracheVariablen;

/**
 *
 * @author lindn
 */
public class SpracheEnglischListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        SpracheVariablen.datei = "File";
        SpracheVariablen.dateiÖffnen = "Open File";
        SpracheVariablen.neu = "new File";
        SpracheVariablen.speichern = "Save File";
        SpracheVariablen.beenden = "Close File";
        
        SpracheVariablen.einstellungen = "Settings";
        SpracheVariablen.sprachauswahl = "Language";
        
        SpracheVariablen.hilfe = "Help";
        SpracheVariablen.hilfeText = "Instructions";
        
        SpracheVariablen.module = "Lectures";
        SpracheVariablen.belegteModule = "Current Lectures";
        SpracheVariablen.abgeschlosseneModule = "Finished Lectures";
        
        SpracheVariablen.modulName = "Name";
        SpracheVariablen.note = "Grade";
        SpracheVariablen.bestanden = "Passed";
        SpracheVariablen.dozent = "Lecturer";
        
        SpracheVariablen.falscheNote = "The grade has to be inbetween 1.0 and 5.0";
        SpracheVariablen.semesterOderNoteFalsch = "Invalid entry for semester or grade";
        
        SpracheVariablen.welches = "Which ";
        SpracheVariablen.entfernen = " should be removed?";
        
        SpracheVariablen.nichtGefunden = " could not be found";
        SpracheVariablen.erfolgreichEntfernt = " successfully deleted";

        new PrüfungP3();
        
        
    }

    
}
