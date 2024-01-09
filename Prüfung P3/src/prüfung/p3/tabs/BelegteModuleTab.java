/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.tabs;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import prüfung.p3.sprachauswahl.SpracheVariablen;

public class BelegteModuleTab {
    private final JPanel panel;

    public BelegteModuleTab() {
        panel = new JPanel(new BorderLayout());

        // Beispielmodule erstellen
        Object[][] data = {
                {"Mathe 2", "/", "Nein"},
                {"Statistik", "/", "Nein"},
                {"Kosten- und Leistungsrechnung", "/", "Nein"},
                {"Software Engineering", "/", "Nein"},
                {"Programmieren 2", "/", "Nein"},
                {"IT-Projektmanagement", "/", "Nein"}
        };

        String[] columns = {SpracheVariablen.modulName, SpracheVariablen.note, SpracheVariablen.bestanden};

        // Tabelle erstellen
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);

        // Tabelle zum Panel hinzufügen
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }
}

