/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import prüfung.p3.menu.ImportDateien;

/**
 *
 * @author senol
 */
public class DateiÖffnenListener implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        ImportDateien opener = new ImportDateien();
        opener.öffneDatei();
    }
}
