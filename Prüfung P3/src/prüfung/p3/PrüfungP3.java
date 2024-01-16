/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prüfung.p3;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
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
        this.add(new JButton("Hallo"));
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


