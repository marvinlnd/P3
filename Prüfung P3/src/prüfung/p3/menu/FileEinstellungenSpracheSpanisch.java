/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import javax.swing.JMenuItem;
import prüfung.p3.listener.SpracheSpanischListener;

/**
 *
 * @author lindn
 */
public class FileEinstellungenSpracheSpanisch extends JMenuItem{
    
    FileEinstellungenSpracheSpanisch(){
        super("Español");
        this.addActionListener(new SpracheSpanischListener());
    }
}
