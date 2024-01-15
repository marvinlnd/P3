/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import javax.swing.JMenuItem;
import prüfung.p3.listener.DateiNeuListener;
import prüfung.p3.sprachauswahl.SpracheVariablen;

class FileDateiNeu extends JMenuItem {

    public FileDateiNeu() {
        super(SpracheVariablen.neu); 
        this.addActionListener(new DateiNeuListener());
    }
}

