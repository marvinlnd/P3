/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FileMenuBar extends JMenuBar {

    public FileMenuBar() {
        this.add(new FileDatei());

        // Hier wird der Text über den Tabs gesetzt
        JMenu studiengangMenu = new JMenu("Studiengang: Wirtschaftsinformatik");
        this.add(studiengangMenu);
    }
}

