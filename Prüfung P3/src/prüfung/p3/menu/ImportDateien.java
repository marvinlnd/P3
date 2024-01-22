/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import prüfung.p3.PrüfungP3;
import prüfung.p3.icons.ErstelltesIcon;
import prüfung.p3.listener.ObjektFensterBearbeitenÖffnen;
import prüfung.p3.listener.ObjektFensterEntfernenÖffnen;
import prüfung.p3.listener.ObjektFensterHinzufügenÖffnen;
import prüfung.p3.listener.WindowEventListener;
import prüfung.p3.sprachauswahl.SpracheVariablen;
import prüfung.p3.tabs.AbgeschlosseneModuleTab;
import prüfung.p3.tabs.BelegteModuleTab;
import prüfung.p3.tabs.ModuleTab;

/**
 *
 * @author senol
 */
public class ImportDateien {
    static JTabbedPane tabbedPane = new JTabbedPane();

    public static PrüfungP3 deserializeObject(String filePath) {
        PrüfungP3 obj = null;

        try (ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(filePath))) {
            obj = (PrüfungP3) objectIn.readObject();
            System.out.println("Objekt wurde erfolgreich deserialisiert.");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }

    public static void fenster() {
        // Annahme: "serializedObject.ser" ist die zuvor serialisierte Datei
        PrüfungP3 deserializedObj = deserializeObject("serializedObject.ser");

        // Hier können Sie das deserialisierte Objekt verwenden, z.B. Ihre GUI aktualisieren, etc.
        if (deserializedObj != null) {
            SwingUtilities.invokeLater(() -> {
                // Hier können Sie das deserialisierte Objekt verwenden, z.B. Ihre GUI aktualisieren, etc.
                JFrame frame = new JFrame("Deserialisiertes Fenster");
                // Fügen Sie hier weitere Anpassungen für Ihr deserialisiertes Objekt hinzu
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(800, 600);
                frame.setVisible(true);

                frame.setJMenuBar(new FileMenuBar());
                frame.addWindowListener(new WindowEventListener());

                JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5));

                JButton hinzufügen = new JButton(ErstelltesIcon.createIcon("/prüfung/p3/icons/78.gif", 16, 16));
                hinzufügen.addActionListener(new ObjektFensterHinzufügenÖffnen());
                JButton entfernen = new JButton(ErstelltesIcon.createIcon("/prüfung/p3/icons/14.gif", 16, 16));
                entfernen.addActionListener(new ObjektFensterEntfernenÖffnen());
                JButton bearbeiten = new JButton(ErstelltesIcon.createIcon("/prüfung/p3/icons/73.gif", 16, 16));
                bearbeiten.addActionListener(new ObjektFensterBearbeitenÖffnen());

                buttonPanel.add(hinzufügen);
                buttonPanel.add(entfernen);
                buttonPanel.add(bearbeiten);

                frame.add(buttonPanel, BorderLayout.SOUTH);
                initTabs();
                frame.add(tabbedPane);
                

            });
        }
    }
    
    private static void initTabs(){
        
        //tabbedPane.removeAll();

        ModuleTab moduleTab = new ModuleTab();
        tabbedPane.addTab(SpracheVariablen.module, moduleTab.getPanel());

        BelegteModuleTab belegteModuleTab = new BelegteModuleTab();
        tabbedPane.addTab(SpracheVariablen.belegteModule, belegteModuleTab.getPanel());

        AbgeschlosseneModuleTab abgeschlosseneModuleTab = new AbgeschlosseneModuleTab();
        tabbedPane.addTab(SpracheVariablen.abgeschlosseneModule, abgeschlosseneModuleTab.getPanel());

        
        
    }
}
