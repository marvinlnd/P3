/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.icons;

import javax.swing.ImageIcon;

/**
 *
 * @author lindn
 */
public class ErstelltesIcon {
     public static ImageIcon createIcon(String pfad, int width, int height) {
        ImageIcon icon = new ImageIcon(ErstelltesIcon.class.getResource(pfad));
        return new ImageIcon(icon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH));
    }
}
