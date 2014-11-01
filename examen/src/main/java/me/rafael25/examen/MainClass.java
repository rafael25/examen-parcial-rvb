/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.rafael25.examen;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T107
 */
public class MainClass {
    public static void main(String argv[]) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction transa = s.getTransaction();
        
        GeneradorCalificaciones generador = new GeneradorCalificaciones();
        ArrayList<Evaluacion> evaluaciones = generador.generarCalificaciones();
        
        for (Evaluacion eva : evaluaciones) {
            s.save(eva);
        }
        
        transa.commit();
        s.close();
    }
}
