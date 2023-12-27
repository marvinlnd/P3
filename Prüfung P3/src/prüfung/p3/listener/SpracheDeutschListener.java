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
public class SpracheDeutschListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        SpracheVariablen.datei = "Datei";
        SpracheVariablen.dateiÖffnen = "Öffnen";
        SpracheVariablen.neu = "Neu";
        SpracheVariablen.speichern = "Speichern";
        SpracheVariablen.beenden = "Beenden";
        
        SpracheVariablen.einstellungen = "Einstellungen";
        SpracheVariablen.sprachauswahl = "Sprache";
        
        SpracheVariablen.module = "Module";
        SpracheVariablen.belegteModule = "Belegte Module";
        SpracheVariablen.abgeschlosseneModule = "Abgeschlossene Module";

        new PrüfungP3();
    }
    
}
