/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.kursObjekt;

/**
 *
 * @author Dennis Schäfer
 */
public class kursObjekt implements java.io.Serializable{

    private String modul;
    private String dozent;
    private int semester;
    private int versuche;
    private double note;
    private boolean bestanden;
    private boolean belegt;

    public kursObjekt(String Modul, String nameDozent, int semester, double note, boolean bestanden, boolean belegt) {
        this.modul = Modul;
        this.dozent = nameDozent;
        this.semester = semester;
        this.note = note;
        this.bestanden = bestanden;
        this.belegt = belegt;
    }

    public String getModul() {
        return modul;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }


    public String getDozent() {
        return dozent;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }


    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getVersuche() {
        return versuche;
    }

    public void setVersuche(int versuche) {
        this.versuche = versuche;
    }

 
    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public boolean getBestanden() {
        return bestanden;
    }

    public void bestanden(boolean bestanden) {
        this.bestanden = bestanden;
    }

    public boolean isBelegt() {
        return belegt;
    }

    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }

    public void displayObjektInfo() {
        System.out.println("Fach Name: " + modul);
        System.out.println("Dozent: " + dozent);
        System.out.println("Current Semester: " + semester);
        System.out.println("Note: " + note);
        System.out.println("Bestanden" + bestanden);
    }

}
