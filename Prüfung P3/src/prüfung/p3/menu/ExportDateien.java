/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import prüfung.p3.PrüfungP3;

/**
 *
 * @author senol
 */
public class ExportDateien {

    public static void serializeObject(PrüfungP3 obj) {
        try {
            String filePath = "serializedObject.ser";
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            
            objectOut.writeObject(obj);
            
            objectOut.close();
            fileOut.close();
            
            System.out.println("Objekt wurde erfolgreich serialisiert");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
