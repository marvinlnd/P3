/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import javax.swing.JMenu;

/**
 *
 * @author lindn
 */
public class FileEinstellungen extends JMenu{
    FileEinstellungen(){
        super("Einstellungen");
        this.add(new FileEinstellungenSprache());
    }
    
}
