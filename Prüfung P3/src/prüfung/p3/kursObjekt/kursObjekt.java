/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.kursObjekt;

/**
 *
 * @author Dennis Schäfer
 */
public class kursObjekt {

    private String fach;
    private String nameDozent;
    private int semester;
    private double note;
    private boolean bestanden;
    
    public kursObjekt(String fach, String nameDozent, int semester, double note, boolean bestanden) {
        this.fach = fach;
        this.nameDozent = nameDozent;
        this.semester = semester;
        this.note = note;
        this.bestanden = bestanden;
    }

 
  
    
    
 public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }
    
    
// Für den Dozenten
    public String getNameDozent() {
        return nameDozent;
    }

    public void setNameDozent(String nameDozent) {
        this.nameDozent = nameDozent;
    }
    
    
//Für das Semester
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    
// Für die Note    
    public double getNote () {
        return note;
    }
    
    public void setNote (int note) {
        this.note = note;
    }
    
        public boolean getBestanden () {
        return bestanden;
    }
    
    public void bestanden (boolean bestanden) {
        this.bestanden = bestanden;
    }
    
    
    public void displayObjektInfo() {
        System.out.println("Fach Name: " + fach);
        System.out.println("Dozent: " + nameDozent);
        System.out.println("Current Semester: " + semester);
        System.out.println("Note: " + note);
        System.out.println("Bestanden" + bestanden);
    }
















}
