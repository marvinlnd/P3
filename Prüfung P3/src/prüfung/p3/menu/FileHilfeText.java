/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import javax.swing.JMenuItem;
import prüfung.p3.listener.HilfeListener;
import prüfung.p3.sprachauswahl.SpracheVariablen;



/**
 *
 * @author lindn
 */
public class FileHilfeText extends JMenuItem{
    FileHilfeText(){
        super(SpracheVariablen.hilfe);
        this.addActionListener(new HilfeListener());
    }
}
