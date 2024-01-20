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

public class ModuleTab {
    private JPanel panel;

    public ModuleTab() {
        panel = new JPanel(new BorderLayout());
        
        Object [][] data = new Object[ObjektArrayClass.objektArray.length][5];
        
       
            for (int i = 0; i < ObjektArrayClass.objektArray.length; i++) {
            if(ObjektArrayClass.objektArray[i] != null){
                data[i][0] = ObjektArrayClass.objektArray[i].getModul();
            data[i][1] = ObjektArrayClass.objektArray[i].getNote();
            data[i][2] = ObjektArrayClass.objektArray[i].getBestanden() ? "Ja" : "Nein";
            data[i][4] = ObjektArrayClass.objektArray[i].getNameDozent();
            
            }
            


        }

        
        String[] columns = {SpracheVariablen.modulName, SpracheVariablen.note,SpracheVariablen.bestanden, "Momentan Belegt", "Dozent"};
        
               
        DefaultTableModel model = new DefaultTableModel(data, columns){
                @Override
                public boolean isCellEditable(int row, int column){
                    return column !=2;
                }
                };
        
                
        JTable table = new JTable(model);

        // Tabelle zum Panel hinzufügen
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }
}


