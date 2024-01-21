/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import javax.swing.JMenuItem;
import prüfung.p3.icons.ErstelltesIcon;
import prüfung.p3.sprachauswahl.SpracheVariablen;
import prüfung.p3.listener.DateiÖffnenListener;

/**
 *
 * @author lindn
 */
public class FileDateiÖffnen extends JMenuItem {

    public FileDateiÖffnen() {
        super(SpracheVariablen.dateiÖffnen);
        String pfad = "/prüfung/p3/icons/52.gif";

        setIcon(ErstelltesIcon.createIcon(pfad, 14, 14));
        
        addActionListener(new DateiÖffnenListener());
    }
}

