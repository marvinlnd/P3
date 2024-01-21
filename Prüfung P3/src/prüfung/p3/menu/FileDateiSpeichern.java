/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import static javax.swing.text.StyleConstants.setIcon;
import prüfung.p3.icons.ErstelltesIcon;
import prüfung.p3.sprachauswahl.SpracheVariablen;
import prüfung.p3.listener.DateiSpeichernListener;
import prüfung.p3.PrüfungP3;
/**
 *
 * @author lindn
 */
public class FileDateiSpeichern extends JMenuItem{
    
    private PrüfungP3 pruefung; // Deklariere die Variable pruefung
    private String dateiName; // Deklariere die Variable dateiName
    
    public FileDateiSpeichern(PrüfungP3 pruefung, String dateiName) {
        super(SpracheVariablen.speichern);
        
        String pfad = "/prüfung/p3/icons/22.gif";
        
        setIcon(ErstelltesIcon.createIcon(pfad, 14, 14));
        
        this.pruefung = pruefung; // Initialisiere die Variable pruefung
        this.dateiName = dateiName; // Initialisiere die Variable dateiName
        
        addActionListener(new DateiSpeichernListener(pruefung, dateiName));
    }
}
