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
        JMenu fileMenu = new JMenu("Datei");
        JMenuItem fileNew = new JMenuItem("Neu");
        JMenuItem fileOpen = new JMenuItem("Öffnen");
        JMenuItem fileExit = new JMenuItem("Beenden");

        fileMenu.add(fileNew);
        fileMenu.add(fileOpen);
        fileMenu.addSeparator();
        fileMenu.add(fileExit);

        this.add(fileMenu);

        // Hier wird der Text über den Tabs gesetzt
        JMenu studiengangMenu = new JMenu("Studiengang: Wirtschaftsinformatik");
        this.add(studiengangMenu);
    }
}

