/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import javax.swing.JMenu;
import prüfung.p3.sprachauswahl.SpracheVariablen;
import prüfung.p3.PrüfungP3;
/**
 *
 * author lindn
 */
public class FileDatei extends JMenu {
    
    // Annahme: Du hast eine Instanz von PrüfungP3 namens 'pruefung' und einen Dateinamen namens 'dateiName'
    private PrüfungP3 pruefung;
    private String dateiName;
    
    public FileDatei() {
        super(SpracheVariablen.datei);
        this.add(new FileDateiÖffnen());
        this.add(new FileDateiNeu());
        this.addSeparator();
        this.add(new FileDateiSpeichern(pruefung, dateiName)); // Übergebe die erforderlichen Argumente
        this.addSeparator();
        this.add(new FileDateiBeenden());
    }
}
