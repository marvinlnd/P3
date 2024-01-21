/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import prüfung.p3.menu.ExportDateien;
import prüfung.p3.PrüfungP3;

/**
 *
 * author senol
 */
public class DateiSpeichernListener implements ActionListener {
    
   
    private String dateiName = "Datei";
    
    public DateiSpeichernListener(PrüfungP3 pruefung, String dateiName) {
        
        this.dateiName = dateiName;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        ExportDateien.serializeObject(PrüfungP3.ursprünglichesFenster);
    }
}
    
