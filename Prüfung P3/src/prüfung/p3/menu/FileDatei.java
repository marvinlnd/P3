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
public class FileDatei extends JMenu {
    public FileDatei() {
        super("Datei");
        this.add(new FileDateiÖffnen());
        this.add(new FileDateiNeu()); // Stelle sicher, dass der Konstruktor korrekt ist
        this.addSeparator();
        this.add(new FileDateiSpeichern());
        this.addSeparator();
        this.add(new FileDateiBeenden());
    }
}
