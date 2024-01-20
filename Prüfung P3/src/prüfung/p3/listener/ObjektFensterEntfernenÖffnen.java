/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import prüfung.p3.kursObjekt.KursObjektGUI;

/**
 *
 * @author Dennis Schäfer
 */

public class ObjektFensterEntfernenÖffnen implements ActionListener{
    public static KursObjektGUI gui;

    @Override
    public void actionPerformed(ActionEvent e) {
        gui = new KursObjektGUI();
        
    }
    
}
