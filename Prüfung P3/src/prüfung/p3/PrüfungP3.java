/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prüfung.p3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import prüfung.p3.icons.ErstelltesIcon;
import prüfung.p3.kursObjekt.kursObjekt;
import prüfung.p3.listener.ObjektFensterHinzufügenÖffnen;
import prüfung.p3.listener.ObjektHinzufügenListener;
import prüfung.p3.listener.WindowEventListener;
import prüfung.p3.menu.FileMenuBar;
import prüfung.p3.sprachauswahl.SpracheVariablen;
import prüfung.p3.tabs.AbgeschlosseneModuleTab;
import prüfung.p3.tabs.BelegteModuleTab;
import prüfung.p3.tabs.ModuleTab;

public class PrüfungP3 extends JFrame {
    
    private static PrüfungP3 ursprünglichesFenster;
    
    public PrüfungP3() {
        
        if(ursprünglichesFenster != null){
            ursprünglichesFenster.dispose();
        }
        
        ursprünglichesFenster = this;
        
        this.setSize(500, 300);
        this.setJMenuBar(new FileMenuBar());
        this.addWindowListener(new WindowEventListener());
        initTabs();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        JButton hinzufügen = new JButton(ErstelltesIcon.createIcon("/prüfung/p3/icons/78.gif", 16, 16));
        hinzufügen.addActionListener(new ObjektFensterHinzufügenÖffnen());
        JButton entfernen = new JButton(ErstelltesIcon.createIcon("/prüfung/p3/icons/14.gif", 16, 16));
        buttonPanel.add(hinzufügen);
        buttonPanel.add(entfernen);
        
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    private void initTabs() {
        JTabbedPane tabbedPane = new JTabbedPane();

        
        ModuleTab moduleTab = new ModuleTab();
        tabbedPane.addTab(SpracheVariablen.module, moduleTab.getPanel());

        
        BelegteModuleTab belegteModuleTab = new BelegteModuleTab();
        tabbedPane.addTab(SpracheVariablen.belegteModule, belegteModuleTab.getPanel());

        
        AbgeschlosseneModuleTab abgeschlosseneModuleTab = new AbgeschlosseneModuleTab();
        tabbedPane.addTab(SpracheVariablen.abgeschlosseneModule, abgeschlosseneModuleTab.getPanel());

        this.add(tabbedPane);
    }

    public static void main(String[] args) {
       new PrüfungP3();
    }
}


