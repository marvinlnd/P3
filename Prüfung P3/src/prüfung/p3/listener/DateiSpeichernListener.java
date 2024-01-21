/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import prüfung.p3.menu.ExportDateien;

/**
 *
 * author senol
 */
public class DateiSpeichernListener implements ActionListener {
    
    public void actionPerformed(ActionEvent e) {
        ExportDateien exporter = new ExportDateien();
        // Voraussetzung: Sie haben Zugriff auf das PrüfungP3-Objekt, das exportiert werden soll
        exporter.serializeObject(obj);
    }
}
    
