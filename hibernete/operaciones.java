/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernete;

import Inferfaz.opciones;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
/**
 *
 * @author Adonis
 */
public class operaciones {

    private Session sesion;
    
    private void iniciarOperacion(){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        sesion = sessionFactory.openSession(); 
        sesion.getTransaction().begin();
    }
    private void terminarOperacion(){
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    public int guardarFederado(Personas personas){
        int id=0;
        iniciarOperacion();
        id = (int)sesion.save(personas);
        terminarOperacion();
        return id;
    }
    public void actualizarFederado (Personas personas){
        iniciarOperacion();
        sesion.update(personas);
        terminarOperacion();
    }
    public void eliminarFederado (Personas personas){
        iniciarOperacion ();
        sesion.delete(personas);
        terminarOperacion();
    }
    
    public Personas obtenerFederado (int idFederado){
        Personas personas =null;
        iniciarOperacion();
        personas = (Personas) sesion.get(Personas.class, idFederado);
        terminarOperacion();
        return personas;
    }
    
    public List<Personas> ListaDeFederados(){
        List<Personas> listaFederado = null;
        iniciarOperacion();
        listaFederado = sesion.createQuery("from Personas").list();
        terminarOperacion();
        return listaFederado;
    }

    public operaciones() {
    }
    public static void main(String[] args) {
        // TODO code application logic here
        // opciones v= new opciones();
       // v.setVisible(true);
    }
}
    