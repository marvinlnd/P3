/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.kursObjekt;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import prüfung.p3.PrüfungP3;
import prüfung.p3.arrays.ObjektArrayClass;
import static prüfung.p3.kursObjekt.KursObjektHinzufügenGUI.belegt;
import static prüfung.p3.kursObjekt.KursObjektHinzufügenGUI.dozent;
import static prüfung.p3.kursObjekt.KursObjektHinzufügenGUI.modul;
import static prüfung.p3.kursObjekt.KursObjektHinzufügenGUI.note;
import static prüfung.p3.kursObjekt.KursObjektHinzufügenGUI.semester;
import static prüfung.p3.kursObjekt.KursObjektHinzufügenGUI.versuche;
import static prüfung.p3.listener.ObjektFensterEntfernenÖffnen.gui;
import prüfung.p3.sprachauswahl.SpracheVariablen;
import prüfung.p3.tabs.ModuleTab;

/**
 *
 * @author lindn
 */
public class KursObjektMethoden {

    private static String modulToRemove;

    public static void addKursObjekt(KursObjektHinzufügenGUI gui) {

        String modul = gui.modul.getText().trim();
        String dozent = gui.dozent.getText().trim();

        int semester;
        int versuche;
        double note;

        boolean bestanden;

        boolean belegt = KursObjektHinzufügenGUI.belegt.isSelected();
        System.out.println(belegt);

        String semesterText = KursObjektHinzufügenGUI.semester.getText().trim();
        String versucheText = KursObjektHinzufügenGUI.versuche.getText().trim();
        String noteText = KursObjektHinzufügenGUI.note.getText().trim();

        if (semesterText.isEmpty() || noteText.isEmpty()) {
            gui.showInfoDialog("Bitte geben Sie gültige Werte für Semester und Note ein");
            return;
        }

        try {

            semester = Integer.parseInt(semesterText);
            versuche = Integer.parseInt(versucheText);
            note = Double.parseDouble(noteText);

            if (note < 1.0 || 5.0 < note) {
                gui.showInfoDialog(SpracheVariablen.falscheNote);
                return;
            }

        } catch (NumberFormatException ex) {

            gui.showInfoDialog(SpracheVariablen.semesterOderNoteFalsch);
            return;
        }

        if (note < 5 && versuche > 0) {
            bestanden = true;
        } else {
            bestanden = false;
        }

        kursObjekt kurs = new kursObjekt(modul, dozent, semester, note, bestanden, belegt);

        ObjektArrayClass.objektList.add(kurs);

    }

    public static void removeKursObjekt(KursObjektEntfernenGUI gui, String modulToRemove) {

        if (ObjektArrayClass.objektList.isEmpty()) {
            System.out.println("Die Liste ist leer");
            return;
        }

        int indexToRemove = -1;

        for (int i = 0; i < ObjektArrayClass.objektList.size(); i++) {
            if (ObjektArrayClass.objektList.get(i).getModul().equals(modulToRemove)) {
                indexToRemove = i;
                break;
            } else {
                System.out.println("Es ist ein Fehler aufgetreten");
            }
        }

        if (indexToRemove != -1) {

            ObjektArrayClass.objektList.remove(indexToRemove);
            gui.showInfoDialog(modulToRemove + SpracheVariablen.erfolgreichEntfernt);

            new PrüfungP3();

            System.out.println("Wenn es hier aufhört wird es nur nicht aktualisiert");
        } else {
            gui.showInfoDialog(modulToRemove + SpracheVariablen.nichtGefunden);
        }

        System.out.println(ObjektArrayClass.größeArrayList);
    }

    public static void editKursObjekt(KursObjektBearbeitenGUI gui, String modulToEdit) {

        if (ObjektArrayClass.objektList.isEmpty()) {
            System.out.println("Die Liste ist leer");
            gui.showInfoDialog("Die Liste ist leer");
            return;
        }

        int indexToEdit = -1;

        for (int i = 0; i < ObjektArrayClass.objektList.size(); i++) {
            if (ObjektArrayClass.objektList.get(i).getModul().equals(modulToEdit)) {
                indexToEdit = i;
                break;
            }
        }

        if (indexToEdit != -1) {

            kursObjekt kurs = ObjektArrayClass.objektList.get(indexToEdit);

        // Öffnen Sie das zweite Panel für die Details
        gui.showEditDialog();

        // Nachdem die Bearbeitung abgeschlossen ist, aktualisieren Sie das Kursobjekt in der Liste
        kurs.setModul(modul.getText());
        kurs.setNote(Double.parseDouble(note.getText()));
        kurs.setDozent(dozent.getText());
        kurs.setSemester(Integer.parseInt(semester.getText()));
        kurs.setVersuche(Integer.parseInt(versuche.getText()));
        kurs.setBelegt(belegt.isSelected());

        // Fügen Sie das aktualisierte Kursobjekt zur Liste hinzu
        ObjektArrayClass.objektList.set(indexToEdit, kurs);

        // Zeigen Sie eine Erfolgsmeldung an
        gui.showInfoDialog("Objekt mit Modul '" + modulToEdit + "' wurde erfolgreich bearbeitet.");

        // Aktualisieren Sie die Tabelle oder die Ansicht nach Bedarf
        // z.B., wenn Sie eine Tabelle in Ihrer GUI verwenden
        new PrüfungP3();


        } else {
            // Das zu bearbeitende Kursobjekt wurde nicht gefunden
            gui.showInfoDialog("Objekt mit Modul '" + modulToEdit + "' wurde nicht gefunden.");
        }
    }

}
