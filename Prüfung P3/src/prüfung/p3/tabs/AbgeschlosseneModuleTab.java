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
import prüfung.p3.arrays.ObjektArrayClass;
import prüfung.p3.sprachauswahl.SpracheVariablen;

public class AbgeschlosseneModuleTab implements java.io.Serializable{
    private final JPanel panel;

    public AbgeschlosseneModuleTab() {
        panel = new JPanel(new BorderLayout());

        Object[][] data = new Object[ObjektArrayClass.objektList.size()][6];
        boolean istBestanden;

        for (int i = 0; i < ObjektArrayClass.objektList.size(); i++) {
            istBestanden = ObjektArrayClass.objektList.get(i).getBestanden();
            if (ObjektArrayClass.objektList.get(i) != null && istBestanden == true) {
                data[i][0] = ObjektArrayClass.objektList.get(i).getModul();
                data[i][1] = ObjektArrayClass.objektList.get(i).getNote();
                data[i][2] = ObjektArrayClass.objektList.get(i).getVersuche();
                data[i][3] = ObjektArrayClass.objektList.get(i).getBestanden() ? "Ja" : "Nein";
                data[i][4] = ObjektArrayClass.objektList.get(i).getNameDozent();

            }

        }

        String[] columns = {SpracheVariablen.modulName, SpracheVariablen.note, SpracheVariablen.versuche, SpracheVariablen.dozent};

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
