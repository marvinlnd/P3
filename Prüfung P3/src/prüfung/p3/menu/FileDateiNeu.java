/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import javax.swing.JMenuItem;
import prüfung.p3.icons.ErstelltesIcon;
import prüfung.p3.listener.DateiNeuListener;
import prüfung.p3.sprachauswahl.SpracheVariablen;

class FileDateiNeu extends JMenuItem {

    public FileDateiNeu() {
        super(SpracheVariablen.neu); 
        String pfad = "/prüfung/p3/icons/1.gif";
        
        setIcon(ErstelltesIcon.createIcon(pfad, 14, 14));
        this.addActionListener(new DateiNeuListener());
    }
}

