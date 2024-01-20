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

/**
 *
 * @author lindn
 */
public class FileDateiSpeichern extends JMenuItem{
    
    public FileDateiSpeichern(){
        super(SpracheVariablen.speichern);
        
        String pfad = "/prüfung/p3/icons/22.gif";
        
        setIcon(ErstelltesIcon.createIcon(pfad, 14, 14));
    }
    
} 

