/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import Modelo.Habitacion;
import Modelo.Hotel;
import Modelo.Huesped;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

public class Operaciones_hoteles {

    private final SessionFactory sessionFactory;

    public Operaciones_hoteles() {

        sessionFactory = NewHibernateUtil.getSessionFactory();
    }

    public void altaHotel(Hotel hotel) {

        Session session = sessionFactory.openSession();

        Transaction tx;

        try {
            tx = session.beginTransaction();
            session.save(hotel);
            tx.commit();

            JOptionPane.showMessageDialog(null, "Insertado correctamente.");
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al dar de alta un hotel");
        } finally {

            session.close();
        }

    }

    public void ModiHotel(Hotel hotel) {

        Session session = sessionFactory.openSession();

        Transaction tx;

        try {
            tx = session.beginTransaction();

            session.update(hotel);
            tx.commit();

            JOptionPane.showMessageDialog(null, "Modificado correctamente.");
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al dar de alta un usuario, el usuario ya existe en la base de datos");
        } finally {

            session.close();
        }
    }

    public void bajaHotel(Integer dni) {
        Session session = sessionFactory.openSession();
        Transaction tx;
        try {
            tx = session.beginTransaction();
            Hotel hotel = (Hotel) session.get(Hotel.class, dni);

            Set habitacions = hotel.getHabitacions();
            ArrayList<Habitacion> listahabitaciones = new ArrayList<Habitacion>(habitacions);

            Query q = session.createQuery("from Huesped ");
            tx.commit();
            List<Huesped> lista = q.list();
            Iterator<Huesped> iter = lista.iterator();
            ArrayList<Huesped> listahuesped = new ArrayList<Huesped>();
            while (iter.hasNext()) {
                listahuesped.add(iter.next());
            }

            for (int i = 0; i < listahabitaciones.size(); i++) {
                listahabitaciones.get(i);
                for (int j = 0; j < listahuesped.size(); j++) {
                    listahuesped.get(j);
                    if (listahabitaciones.get(i) == listahuesped.get(j).getHabitacion()) {
                        listahuesped.get(j).setHabitacion(null);
                    }
                }
                tx = session.beginTransaction();
                q = session.createQuery("from Habitacion where idhabitacion= " + listahabitaciones.get(i).getIdhabitacion());
                session.delete(listahabitaciones.get(i));
                tx.commit();
            }

            tx = session.beginTransaction();
            session.delete(hotel);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Borrado correctamente.");
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al Borrar el Hotel");
        } finally {

            session.close();
        }
    }

    public DefaultListModel mostrarHoteles() {

        Session session = sessionFactory.openSession();

        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Hotel ");
        List<Hotel> lista = q.list();
        Iterator<Hotel> iter = lista.iterator();
        tx.commit();
        session.close();
        DefaultListModel dlm = new DefaultListModel();
        while (iter.hasNext()) {
            Hotel noti = (Hotel) iter.next();
            dlm.addElement(noti);
        }
        return dlm;
    }

    public Iterator<Categoria> cargarcombocategoria() {
        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Categoria  ");
        List<Categoria> lista = q.list();
        Iterator<Categoria> iter = lista.iterator();
        tx.commit();
        session.close();
        return iter;
    }

    public Iterator<Hotel> todosHoteles() {
        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Hotel  ");
        List<Hotel> lista = q.list();
        Iterator<Hotel> iter = lista.iterator();
        tx.commit();
        session.close();
        return iter;
    }

    public Categoria buscarCategoria(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Categoria where idcategoria=" + id);
        List<Categoria> lista = q.list();
        Categoria act = lista.get(0);
        session.close();
        return act;

    }

    public Hotel ultimoHotel() {
        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Hotel order by idhotel DESC");
        q.getMaxResults();
        List<Hotel> lista = q.list();
        Hotel act = lista.get(0);
        session.close();
        return act;

    }

    public DefaultListModel mostrarHabitaciones(int id) {

        Session session = sessionFactory.openSession();

        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Habitacion where hotel=" + id);
        List<Habitacion> lista = q.list();
        Iterator<Habitacion> iter = lista.iterator();
        tx.commit();
        session.close();
        DefaultListModel dlm = new DefaultListModel();
        while (iter.hasNext()) {
            Habitacion habi = (Habitacion) iter.next();
            dlm.addElement(habi);
        }
        return dlm;
    }

    public void altaHabitacion(Habitacion habitacion) {
        Session session = sessionFactory.openSession();

        Transaction tx;

        try {
            tx = session.beginTransaction();
            session.save(habitacion);
            tx.commit();

            JOptionPane.showMessageDialog(null, "Insertado correctamente.");
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al dar de alta la habitacion");
        } finally {

            session.close();
        }
    }

    public void bajaHabitacion(Habitacion habitacion) {
        Session session = sessionFactory.openSession();
        Transaction tx;
        try {
            tx = session.beginTransaction();

            Query q = session.createQuery("from Huesped where habitacion =" + habitacion.getIdhabitacion());
            tx.commit();
            List<Huesped> lista = q.list();
            Iterator<Huesped> iter = lista.iterator();
            ArrayList<Huesped> listahuesped = new ArrayList<Huesped>();
            while (iter.hasNext()) {
                listahuesped.add(iter.next());
            }
            for (int i = 0; i < listahuesped.size(); i++) {
                listahuesped.get(i).setHabitacion(null);
            }
            tx = session.beginTransaction();
            q = session.createQuery("from Habitacion where idhabitacion= " + habitacion.getIdhabitacion());
            session.delete(habitacion);
            tx.commit();

            JOptionPane.showMessageDialog(null, "Borrado correctamente.");
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al Borrar la habitacion");
        } finally {

            session.close();
        }

    }

    public void ModiHabitacion(Habitacion habitacion) {
        Session session = sessionFactory.openSession();

        Transaction tx;

        try {
            tx = session.beginTransaction();

            session.update(habitacion);
            tx.commit();

            JOptionPane.showMessageDialog(null, "Modificado correctamente.");
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al modificar la habitacion");
        } finally {

            session.close();
        }
    }

    public DefaultListModel mostrarHuespedes(int idhabitacion) {

        Session session = sessionFactory.openSession();

        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Huesped where habitacion=" + idhabitacion);
        List<Huesped> lista = q.list();
        Iterator<Huesped> iter = lista.iterator();
        tx.commit();
        session.close();
        DefaultListModel dlm = new DefaultListModel();
        while (iter.hasNext()) {
            Huesped hue = (Huesped) iter.next();
            dlm.addElement(hue);
        }
        return dlm;
    }

    public DefaultListModel mostrarHuespedes() {

        Session session = sessionFactory.openSession();

        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Huesped where habitacion=null");
        List<Huesped> lista = q.list();
        Iterator<Huesped> iter = lista.iterator();
        tx.commit();
        session.close();
        DefaultListModel dlm = new DefaultListModel();
        while (iter.hasNext()) {
            Huesped hue = (Huesped) iter.next();
            dlm.addElement(hue);
        }
        return dlm;
    }

    public Huesped buscarHuesped(String dni) {
        Session session = sessionFactory.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        Query q = session.createQuery("from Huesped where dni='" + dni + "'");
        List<Huesped> lista = q.list();
        Huesped act = lista.get(0);
        session.close();
        return act;

    }

    public void ModiHuesped(Huesped huesped) {

        Session session = sessionFactory.openSession();
        Transaction tx;
        try {
            tx = session.beginTransaction();
            session.update(huesped);
            tx.commit();
            
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al dar de alta un usuario, el usuario ya existe en la base de datos");
        } finally {

            session.close();
        }
    }

}
