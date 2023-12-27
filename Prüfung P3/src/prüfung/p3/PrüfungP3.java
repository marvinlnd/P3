/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prüfung.p3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import prüfung.p3.listener.WindowEventListener;
import prüfung.p3.menu.FileMenuBar;
import prüfung.p3.sprachauswahl.SpracheVariablen;
import prüfung.p3.tabs.ModuleTab;

public class PrüfungP3 extends JFrame {

    public PrüfungP3() {
        this.setSize(500, 300);
        this.setJMenuBar(new FileMenuBar());
        this.addWindowListener(new WindowEventListener());
        initTabs();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    private void initTabs() {
        JTabbedPane tabbedPane = new JTabbedPane();

        // Erster Tab: Module
        ModuleTab moduleTab = new ModuleTab();
        tabbedPane.addTab(SpracheVariablen.module, moduleTab.getPanel());

        // Zweiter Tab: Belegte Module
        JPanel panelBelegteModule = new JPanel();
        tabbedPane.addTab(SpracheVariablen.belegteModule, panelBelegteModule);

        // Dritter Tab: Abgeschlossene Module
        JPanel panelAbgeschlosseneModule = new JPanel();
        tabbedPane.addTab(SpracheVariablen.abgeschlosseneModule, panelAbgeschlosseneModule);

        this.add(tabbedPane);
    }

    public static void main(String[] args) {
       new PrüfungP3();
    }
}


