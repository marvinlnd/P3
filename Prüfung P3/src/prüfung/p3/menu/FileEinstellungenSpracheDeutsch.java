/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import javax.swing.JMenuItem;
import prüfung.p3.listener.SpracheDeutschListener;

/**
 *
 * @author lindn
 */
public class FileEinstellungenSpracheDeutsch extends JMenuItem{
    FileEinstellungenSpracheDeutsch(){
        super("Deutsch");
        this.addActionListener(new SpracheDeutschListener());
    }
}
