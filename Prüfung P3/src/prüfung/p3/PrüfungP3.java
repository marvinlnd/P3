/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prüfung.p3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import prüfung.p3.listener.WindowEventListener;
import prüfung.p3.menu.FileMenuBar;

/**
 *
 * @author lindn
 */
public class PrüfungP3 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PrüfungP3 fenster = new PrüfungP3();
        PrüfungP3 fensterBelegteModule = new PrüfungP3();
        
        fenster.setSize(500, 300);
        fenster.setJMenuBar(new FileMenuBar());
        fenster.setVisible(true);
        fenster.addWindowListener(new WindowEventListener());
        
        fensterBelegteModule.setJMenuBar(new FileMenuBar());
        fensterBelegteModule.setVisible(false);
        fensterBelegteModule.addWindowListener(new WindowEventListener());
        fensterBelegteModule.setSize(500, 300);
        
        JPanel panel = new JPanel();        
        JPanel panelStartseite = new JPanel();
        
        fenster.add(panelStartseite, BorderLayout.CENTER);
  
        panel.setLayout(new FlowLayout());
        
        
        
        panelStartseite.add(new JButton("Module"), BorderLayout.WEST);
        panelStartseite.add(new JButton("Belegte Module"));    
        panelStartseite.add(new JButton("Abgeschlossene Module"));
 
    }
    
}
