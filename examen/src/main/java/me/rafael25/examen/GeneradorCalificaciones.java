/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.rafael25.examen;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class GeneradorCalificaciones {
    public ArrayList<Evaluacion> generarCalificaciones() {
        ArrayList<Evaluacion> calif = new ArrayList<Evaluacion>();
        
        calif.add(new Evaluacion("Petra", 5.8f));
        calif.add(new Evaluacion("José", 7.4f));
        calif.add(new Evaluacion("Roberta", 8.6f));
        
        return calif;
    }
}
