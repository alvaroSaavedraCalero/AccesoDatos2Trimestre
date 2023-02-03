/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

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
        
        sesion.getTransaction().commit();
        
        
        for (Libros l : libros) {
            System.out.println(l.toString());
        }
        
        sesion.close();
    }
}
