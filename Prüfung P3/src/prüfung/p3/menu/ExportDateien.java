/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.menu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import prüfung.p3.PrüfungP3;

/**
 *
 * @author senol
 */
public class ExportDateien {

    public static void speichern(PrüfungP3 pruefung, String dateiName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dateiName))) {
            oos.writeObject(pruefung);
            System.out.println("Objekt erfolgreich gespeichert.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
