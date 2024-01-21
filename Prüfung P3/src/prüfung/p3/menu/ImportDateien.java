/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import javax.swing.JFileChooser;

/**
 *
 * @author senol
 */
public class ImportDateien {
    public void öffneDatei() {
        JFileChooser fileChooser = new JFileChooser();

        int auswahl = fileChooser.showOpenDialog(null);

        if (auswahl == JFileChooser.APPROVE_OPTION) {
            String ausgewählterDateipfad = fileChooser.getSelectedFile().getAbsolutePath();

            System.out.println("Datei ausgewählt: " + ausgewählterDateipfad);
        }
    }
}
