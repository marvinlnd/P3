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
import prüfung.p3.kursObjekt.KursObjektMethoden;
import prüfung.p3.sprachauswahl.SpracheVariablen;

public class ModuleTab implements java.io.Serializable{

    private JPanel panel;
    private JTable table;
    private DefaultTableModel model;

    public ModuleTab() {
        panel = new JPanel(new BorderLayout());

        Object[][] data = new Object[ObjektArrayClass.objektList.size()][7];

        for (int i = 0; i < ObjektArrayClass.objektList.size(); i++) {
            if (ObjektArrayClass.objektList.get(i) != null) {
                data[i][0] = ObjektArrayClass.objektList.get(i).getModul();
                data[i][1] = ObjektArrayClass.objektList.get(i).getNote();
                data[i][2] = ObjektArrayClass.objektList.get(i).getVersuche();
                data[i][3] = ObjektArrayClass.objektList.get(i).getSemester();
                data[i][4] = ObjektArrayClass.objektList.get(i).getBestanden() ? "Ja" : "Nein";
                data[i][5] = ObjektArrayClass.objektList.get(i).isBelegt() ? "Ja" : "Nein";
                data[i][6] = ObjektArrayClass.objektList.get(i).getDozent();

            }

        }

        String[] columns = {SpracheVariablen.modulName, SpracheVariablen.angestrebteNoteOderNote, SpracheVariablen.versuche, SpracheVariablen.semester, SpracheVariablen.bestanden, "Momentan Belegt", "Dozent"};

        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 2;
            }
        };

        // Tabelle zum Panel hinzufügen
        table = new JTable(model);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
    }




    public JPanel getPanel() {
        return panel;
    }
}
