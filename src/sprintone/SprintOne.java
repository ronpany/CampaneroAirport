/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprintone;

import Controlador.ControladorRegistros;
import Vista.Alquilar;
import Vista.AlquilarFinal;
import Vista.BorrarAvion;
import Vista.BorrarCliente;
import Vista.BorrarHangar;
import Vista.BorrarRegistro;
import Vista.ConsultaFactura;
import Vista.ConsultarAvion;
import Vista.ConsultarCliente;
import Vista.ConsultarHangar;
import Vista.Factura;
import Vista.Menu;
import Vista.RegistrarAvion;
import Vista.RegistrarCliente;
import Vista.RegistrarHangar;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.text.StyleConstants;

/**
 *
 * @author RONNY PANTOJA
 */
public class SprintOne {

    
    public static void main(String[] args) {
        
        RegistrarHangar     r          = new RegistrarHangar();
        RegistrarCliente    rc         = new RegistrarCliente();
        RegistrarAvion      ra         = new RegistrarAvion();
        Alquilar            a          = new Alquilar();
        AlquilarFinal       af         = new AlquilarFinal();
        Menu                mn         = new Menu();
        Factura             fc         = new Factura();
        BorrarHangar        bh         = new BorrarHangar();
        BorrarAvion         ba         = new BorrarAvion();
        BorrarCliente       bc         = new BorrarCliente();
        ConsultaFactura     cf         = new ConsultaFactura();
       
        ConsultarCliente        cc= new ConsultarCliente();
        ConsultarHangar         ch = new ConsultarHangar();
        ConsultarAvion          ca = new ConsultarAvion();
        ControladorRegistros cr = new ControladorRegistros(r,rc,ra,a,af,mn,cc,ch,ca,fc,bh,ba,bc,cf);
        
    }

    private static void setIconImage(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
