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
        
        fenster.setSize(500, 300);
        fenster.setJMenuBar(new FileMenuBar());
        fenster.setVisible(true);
        fenster.addWindowListener(new WindowEventListener());
        
        JPanel panel = new JPanel();        
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        
        fenster.add(panel, BorderLayout.WEST);
        fenster.add(panel2, BorderLayout.CENTER);
        fenster.add(panel3, BorderLayout.EAST);   
        fenster.add(panel4, BorderLayout.NORTH);
        
        panel.setLayout(new FlowLayout());
        
        
        
        panel4.add(new JButton("Module"), BorderLayout.WEST);
        panel4.add(new JButton("Belegte Module"));
        
        panel4.add(new JButton("Abgeschlossene Module"));
        
       // panel2.add(new JButton("Mathe1"));
        
        
        
       
        
    }
    
}
