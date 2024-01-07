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

public class AbgeschlosseneModuleTab {
    private final JPanel panel;

    public AbgeschlosseneModuleTab() {
        panel = new JPanel(new BorderLayout());

        // Beispielmodule erstellen
        Object[][] data = {
                {"Mathe 1", "2.7", "Ja"},
                {"Wissenschaftliches Arbeiten", "1.0", "Ja"},
                {"Externes Rechnungswesen", "5.0", "Nein"},
                {"Grundlagen der Informatik", "3.3", "Ja"},
                {"Programmieren 1", "2.0", "Ja"},
                {"Einführung Wirttschaftsinformatik", "3.0", "Ja"}
        };

        String[] columns = {"Modulname", "Note", "Bestanden"};

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
