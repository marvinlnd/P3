/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prüfung.p3.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import prüfung.p3.PrüfungP3;
import prüfung.p3.sprachauswahl.SpracheVariablen;

/**
 *
 * @author lindn
 */
public class SpracheSpanischListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        SpracheVariablen.datei = "File";
        SpracheVariablen.dateiÖffnen = "Abrir Documento";
        SpracheVariablen.neu = "Crear un Documento";
        SpracheVariablen.speichern = "Guardar Documento";
        SpracheVariablen.beenden = "Cerrar Documento";
        
        SpracheVariablen.einstellungen = "Ajustes";
        SpracheVariablen.sprachauswahl = "Idioma";
        
        SpracheVariablen.hilfe = "Ayuda";
        SpracheVariablen.hilfeText = "Manual";
        
        SpracheVariablen.module = "Módulos";
        SpracheVariablen.belegteModule = "Módulos ocupados";
        SpracheVariablen.abgeschlosseneModule = "Módulos completados";
        
        SpracheVariablen.modulName = "Nombre";
        SpracheVariablen.note = "Calificatión";
        SpracheVariablen.bestanden = "Aprobado";
        SpracheVariablen.dozent = "Conferenciante";
        
        SpracheVariablen.falscheNote = "La calificación debe estar entre 1.0 y 5.0";
        SpracheVariablen.semesterOderNoteFalsch = "Entrada no válida de semestre o grado";
        
        SpracheVariablen.welches = "Qué ";
        SpracheVariablen.entfernen = " se debe eliminar?";
        SpracheVariablen.bearbeiten = " se debe editar?";
        
        SpracheVariablen.nichtGefunden = " no pudo ser encontrado";
        SpracheVariablen.erfolgreichEntfernt = " fue eliminado exitosamente";

        
        new PrüfungP3();
    }
    
}
