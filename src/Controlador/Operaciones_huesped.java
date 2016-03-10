/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Huesped;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author vesprada
 */
public class Operaciones_huesped {

    private final SessionFactory sessionFactory;

    public Operaciones_huesped() {

        sessionFactory = NewHibernateUtil.getSessionFactory();
    }

    public DefaultListModel mostrarHuespedes() {

        Session session = sessionFactory.openSession();

        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Huesped order by dni");
        List<Huesped> lista = q.list();
        Iterator<Huesped> iter = lista.iterator();
        tx.commit();
        session.close();
        DefaultListModel dlm = new DefaultListModel();
        while (iter.hasNext()) {
            Huesped noti = (Huesped) iter.next();
            dlm.addElement(noti);
        }
        return dlm;
    }

    public void altaHuesped(Huesped huesped) {

        Session session = sessionFactory.openSession();

        Transaction tx;

        try {
            tx = session.beginTransaction();
            session.save(huesped);
            tx.commit();

            JOptionPane.showMessageDialog(null, "Insertado correctamente.");
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al dar de alta un usuario, el usuario ya existe en la base de datos");
        } finally {

            session.close();
        }

    }

    public void bajaHuesped(String dni) {

        Session session = sessionFactory.openSession();
        Transaction tx;
        try {
            tx = session.beginTransaction();
            Huesped actor = (Huesped) session.get(Huesped.class, dni);
            session.delete(actor);
            tx.commit();

            JOptionPane.showMessageDialog(null, "Borrado correctamente.");
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al dar de alta un usuario, el usuario ya existe en la base de datos");
        } finally {

            session.close();
        }
    }

    public void ModiHuesped(Huesped huesped) {

        Session session = sessionFactory.openSession();

        Transaction tx;

        try {
            tx = session.beginTransaction();

            session.update(huesped);
            tx.commit();

            JOptionPane.showMessageDialog(null, "Modificado correctamente.");
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al dar de alta un usuario, el usuario ya existe en la base de datos");
        } finally {

            session.close();
        }
    }

    public Iterator<Huesped> todosHuespedes() {
        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Huesped  ");
        List<Huesped> lista = q.list();
        Iterator<Huesped> iter = lista.iterator();
        tx.commit();
        session.close();
        return iter;
    }

}
