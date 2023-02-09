/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos.modelos;

import accesodatos.modelos.Libros;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author alumno
 */
public class HibenateTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session sesion = sessionFactory.openSession();
        sesion.beginTransaction();

        Query q1 = sesion.createQuery("FROM Libros");
        List<Libros> libros = q1.list();
        
        //sesion.getTransaction().commit();
        
        System.out.println("Todos los libros");
        libros.forEach((l) -> {
            System.out.println(l);
        });
        System.out.println("");
        
        System.out.println("De todos los libros, el que tiene codigo 42");
        for (Libros l : libros) {
            if (l.getCodigo() == 42) {
                System.out.println(l);
            }
        }
        System.out.println("");
        System.out.println("Todos los socios");
        Query q2 = sesion.createQuery("FROM Socios");
        List<Socios> socios = q2.list();
        for (Socios s : socios) {
            System.out.println(s);
        }
        
        System.out.println("");
        System.out.println("Cuantos usuarios diferentes han realizado alguna vez un prestamo");
        Query q3 = sesion.createQuery("SELECT COUNT(DISTINCT documento) FROM Prestamos");
        List<Long> prestamos = q3.list();
        
        
        for (Long i : prestamos) {
            System.out.println(i);
        }
        
        sesion.close();
        sessionFactory.close();
    }
}
