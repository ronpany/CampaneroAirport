/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RONNY PANTOJA
 */
public class ControladorRegistros implements ActionListener{
    public static int       index = -1;
    public static String    alto = "";
    public static String    ancho = "";
    public static String    largo = "";
    public static String    tarifa = "";
    RegistrarHangar         registrarHangar;
    RegistrarCliente        registrarCliente;
    RegistrarAvion          registrarAvion;
    Alquilar                alquilarAvion;
    AlquilarFinal           alquilarFinal;
    Menu                    menu;
    ConsultarCliente        consultarCliente;
    ConsultarHangar         consultarHangar;
    ConsultarAvion          consultarAvion;
    Factura                 factura;
    BorrarHangar            borrarHangar;
    BorrarAvion             borrarAvion;    
    BorrarCliente           borrarCliente;
    ConsultaFactura         consultaFactura;

    public ControladorRegistros() {
        super();
    }

    public ControladorRegistros(RegistrarHangar registrarHangar,RegistrarCliente registrarCliente, RegistrarAvion registrarAvion,Alquilar alquilarAvion,AlquilarFinal alquilarFinal, Menu menu,ConsultarCliente con,ConsultarHangar conh,ConsultarAvion cona, Factura factura, BorrarHangar bhangar, BorrarAvion bavion, BorrarCliente bcliente, ConsultaFactura cfactura) {
        this.registrarHangar    = registrarHangar;
        this.registrarCliente   = registrarCliente;
        this.registrarAvion     = registrarAvion;
        this.alquilarAvion      = alquilarAvion;
        this.alquilarFinal      = alquilarFinal;
        this.menu               = menu;
        this.consultarCliente   = con;
        this.consultarHangar    = conh;
        this.consultarAvion     = cona;
        this.factura            = factura;
        this.borrarHangar       = bhangar;
        this.borrarAvion        = bavion;
        this.borrarCliente      = bcliente;
        this.consultaFactura    = cfactura;
        
        agregarEventos();
        
        menu.setVisible(true);
        
      
    }

    public void agregarEventos(){
        registrarHangar.getBtn_Registrar().addActionListener(this);
        registrarCliente.getBtn_registrar().addActionListener(this);
        registrarAvion.getBtn_registrar().addActionListener(this);
        alquilarAvion.getBtn_alquilar().addActionListener(this);
        alquilarAvion.getBtn_refrescar().addActionListener(this);
        registrarAvion.getBtn_refrescarClientes().addActionListener(this);
        alquilarFinal.getBtn_alquilar().addActionListener(this);
        alquilarFinal.getBtn_registrar().addActionListener(this);
        alquilarFinal.getBtn_buscar().addActionListener(this);
        alquilarFinal.getBtn_refrescar().addActionListener(this);
        menu.getBtn_alquilar().addActionListener(this);
        menu.getBtn_cliente().addActionListener(this);
        menu.getBtn_hangar().addActionListener(this);
        menu.getBtn_ConsultarAvion().addActionListener(this);
        menu.getBtn_ConsultarHangar().addActionListener(this);
        menu.getBtn_ConsultarCliente().addActionListener(this);
        menu.getBtn_borrarHangar().addActionListener(this);
        menu.getBtn_borrarAvion().addActionListener(this);
        menu.getBtn_borrarCliente().addActionListener(this);
        menu.getBtn_reporte().addActionListener(this);
        consultarCliente.getBtn_BuscarCliente().addActionListener(this);
        consultarCliente.getBtn_modificar().addActionListener(this);
        consultarHangar.getBtn_BuscarHangar().addActionListener(this);
        consultarHangar.getBtn_modificar().addActionListener(this);
        consultarAvion.getBtn_BuscarAvion().addActionListener(this);
        consultarAvion.getBtn_modificar().addActionListener(this);
        borrarHangar.getBtn_Eliminar().addActionListener(this);
        borrarAvion.getBtn_Eliminar().addActionListener(this);
        borrarCliente.getBtn_Eliminar().addActionListener(this);
        
    }
        
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==registrarAvion.getBtn_refrescarClientes()){
            refrescarAvion();
            System.out.println("funciona");
        }
        
        if(ae.getSource()==registrarHangar.getBtn_Registrar()){
            registrarHangar();
        }
        if(ae.getSource()==registrarCliente.getBtn_registrar()){
            registrarCliente();
        }
        if (ae.getSource()==registrarAvion.getBtn_registrar()){
            registrarAvionHangar();
        }
        if(ae.getSource()==alquilarAvion.getBtn_refrescar()){
            refrescar();
        }
        
        if(ae.getSource()==alquilarAvion.getBtn_alquilar()){
            alquilar();
        }
        
        if(ae.getSource()==alquilarFinal.getBtn_refrescar()){
            refrescarAviones();
        }
        
        if(ae.getSource()==alquilarFinal.getBtn_registrar()){
            registrarAvion.setVisible(true);
        }
        
        if(ae.getSource()==alquilarFinal.getBtn_buscar()){
            buscarAvionesHangar();
        }
        
        if (ae.getSource()==alquilarFinal.getBtn_alquilar()){
            GuardarAlquiler(index,alto,largo,ancho,tarifa);
        }
        if(ae.getSource()==menu.getBtn_alquilar()){
            alquilarAvion.setVisible(true);
        }
        
        if(ae.getSource()==menu.getBtn_cliente()){
            registrarCliente.setVisible(true);
        }
        
        if(ae.getSource()==menu.getBtn_hangar()){
            registrarHangar.setVisible(true);
        }
        
        //--------------------------------- Consultar Cliente -------------------
        if (ae.getSource()==consultarCliente.getBtn_BuscarCliente()){
            consultarCliente();
        }
        //---------------------------- Consultar Hangar -----------------------
        if (ae.getSource()==consultarHangar.getBtn_BuscarHangar()){
            consultarHangar();
        }
        //---------------------------- Consultar Avion -----------------------------------
        if(ae.getSource() == consultarAvion.getBtn_BuscarAvion()){
            consultarAvion();
        }
        
        if(ae.getSource() == menu.getBtn_ConsultarAvion()){
            consultarAvion.setVisible(true);
        }
        
        if(ae.getSource() == menu.getBtn_ConsultarHangar()){
            consultarHangar.setVisible(true);
        }
        
        if(ae.getSource() == menu.getBtn_ConsultarCliente()){
            consultarCliente.setVisible(true);
        }
        //---------------------------------MODIFICAR AVION----------------------------
        
        if(ae.getSource() == consultarAvion.getBtn_modificar()){
            modificarAvion();
        }
        //----------------------------------MODIFICAR HANGAR--------------------------
        if(ae.getSource() == consultarHangar.getBtn_modificar()){
            modificarHangar();
        }
        //----------------------------------MODIFICAR CLIENTE-------------------------
        if(ae.getSource() == consultarCliente.getBtn_modificar()){
            modificarCliente();
        }
        
        //----------------------------------BORRAR HANGAR-----------------------------
        if(ae.getSource() == menu.getBtn_borrarHangar()){
            borrarHangar.setVisible(true);
            refrescarBorrarHangar();
        }
        
        if(ae.getSource() == borrarHangar.getBtn_Eliminar()){
            eliminarHangar();
            refrescarBorrarHangar();
        }
        
        //---------------------------------BORRAR AVION------------------------------
        
        if(ae.getSource() == menu.getBtn_borrarAvion()){
            borrarAvion.setVisible(true);
            refrescarBorrarAvion();
        }
        
        if(ae.getSource() == borrarAvion.getBtn_Eliminar()){
            eliminarAvion();
            refrescarBorrarAvion();
        }
        
        //---------------------------------BORRAR CLIENTE----------------------------
        
        if(ae.getSource() == menu.getBtn_borrarCliente()){
            borrarCliente.setVisible(true);
            refrescarBorrarCliente();
        }
        
        if(ae.getSource() == borrarCliente.getBtn_Eliminar()){
            eliminarCliente();
            refrescarBorrarCliente();
        }
        
        
        
    }
// ================================== REGISTRAR HANGAR =========================================================================
    public boolean validarCamposHangar(){
        boolean band = false;
        if (registrarHangar.getTxt_Alto().getText().equals("") || registrarHangar.getTxt_Ancho().getText().equals("") || registrarHangar.getTxt_Largo().equals("") || registrarHangar.getTxt_Precio().equals("")){
        JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS! "); 
        }else{
        band = true;}
    return band;
    }  
    public boolean registrarHangar(){
        
        boolean band=false;
        if(validarCamposHangar()){
            String alto = registrarHangar.getTxt_Alto().getText();
            String ancho = registrarHangar.getTxt_Ancho().getText();
            String largo = registrarHangar.getTxt_Largo().getText();
            String tarifa = registrarHangar.getTxt_Precio().getText();

            String sql = "INSERT INTO hangar (idhangar,alto,largo,ancho,estado,tarifa) VALUES(?,?,?,?,?,?)";
            Connection conectar;
            PreparedStatement pst;
            try {
                conectar = Conexion.getConnection();
                pst = conectar.prepareStatement(sql);
                pst.setInt(1, 0);
                pst.setString(2, alto);
                pst.setString(3, largo);
                pst.setString(4, ancho);
                pst.setInt(5, 0);
                pst.setString(6, tarifa);
                int i = pst.executeUpdate();
                if(i!=0){
                    JOptionPane.showMessageDialog(null, "Se Registro Exitosamente");
                    band = true;
                }else{
                    band= false;
                }
            } catch (SQLException e) {
            }
        
        }
    return band;
    }
    
//=================================== REGISTRAR CLIENTE =============================================================================

    public boolean registrarCliente(){
        boolean band = false;
        if(validarCamposCliente()){
                if(buscarCliente()==false){
                int idcliente = Integer.parseInt(registrarCliente.getTxt_identificacion().getText());
                String nombre = registrarCliente.getTxt_nombre().getText();
                String email = registrarCliente.getTxt_email().getText();
                String direccion = registrarCliente.getTxt_direccion().getText();
                String telefono = registrarCliente.getTxt_telefono().getText();

                String sql = "INSERT INTO cliente (idcliente,nombre,email,direccion,telefono) VALUES(?,?,?,?,?)";
                Connection conectar;
                PreparedStatement pst;
                try {
                    conectar = Conexion.getConnection();
                    pst = conectar.prepareStatement(sql);
                    pst.setInt(1, idcliente);
                    pst.setString(2, nombre);
                    pst.setString(3, email);
                    pst.setString(4, direccion);
                    pst.setString(5, telefono);
                    int i = pst.executeUpdate();
                    if(i!=0){
                        JOptionPane.showMessageDialog(null, "Se Registro Exitosamente");
                        registrarAvion.getTxt_propieetario().setText(registrarCliente.getTxt_identificacion().getText());
                        refrescarAvion();
                        registrarAvion.setVisible(true);
                        band = true;
                    }else{
                        band= false;
                    }
                } catch (SQLException e) {
                }
            
        }
        }
    return band;
    }
    public boolean buscarCliente(){
        boolean band = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT idcliente FROM cliente WHERE idcliente = ?");
            ps.setInt(1, Integer.parseInt(registrarCliente.getTxt_identificacion().getText()));
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt("idcliente");
                JOptionPane.showMessageDialog(null, "EL CLIENTE CON ID: "+id+" YA SE ENCUENTRA REGISTRADO");
                band = true;
            }else{}
        } catch (Exception e) {
        }
        
        
        
    return band;
    }
    
    public boolean buscarClienteAvion(){
        boolean band = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT idcliente FROM cliente WHERE idcliente = ?");
            ps.setInt(1, Integer.parseInt(registrarAvion.getTxt_propieetario().getText()));
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt("idcliente");
                band = true;
            }else{}
        } catch (Exception e) {
        }
        
        
        
    return band;
    }
    
    public boolean validarCamposCliente(){
        boolean band = false;
        if(registrarCliente.getTxt_direccion().getText().equals("")||registrarCliente.getTxt_email().getText().equals("")||registrarCliente.getTxt_identificacion().getText().equals("")||registrarCliente.getTxt_nombre().getText().equals("")||registrarCliente.getTxt_telefono().getText().equals("")){
             JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS! "); 
        }else{band = true;}
    return band;
    }
    
//=================================== REGISTRAR AVION ================================================================================
    public void refrescarAvion(){
    
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            registrarAvion.getTbl_Cliente().setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT idcliente, nombre, email, direccion, telefono FROM cliente";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("ID Cliente");
            modelo.addColumn("Nombre");
            modelo.addColumn("Email");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");
            

            while(rs.next()){

                Object [] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i+1);
                }

                modelo.addRow(filas);
            }
            

        }catch(SQLException ex){

            System.err.println(ex.toString());
        }
    }
    
    
    public boolean registrarAvion(){
        
        
        
        boolean band = false;
        if(validarCamposCliente()){
            if (buscarAvion()==false && validarCamposAvion()==true){
                int idavion = Integer.parseInt(registrarAvion.getTxt_matricula().getText());
                String alto = registrarAvion.getTxt_alto().getText();
                String largo = registrarAvion.getTxt_largo().getText();
                String ancho = registrarAvion.getTxt_ancho().getText();
                int idcliente = Integer.parseInt(registrarAvion.getTxt_propieetario().getText());
                String estado = "0";
                
                System.out.println(idavion+" \n"+alto);
                
                String sql = "INSERT INTO avion (idavion,alto,largo,ancho,idcliente,estado) VALUES(?,?,?,?,?,?)";
                Connection conectar;
                PreparedStatement pst;
                try {
                    conectar = Conexion.getConnection();
                    pst = conectar.prepareStatement(sql);
                    pst.setInt(1, idavion);
                    pst.setString(2, alto);
                    pst.setString(3, largo);
                    pst.setString(4, ancho);
                    pst.setInt(5, idcliente);
                    pst.setString(6, estado);
                    int i = pst.executeUpdate();
                    if(i!=0){
                        JOptionPane.showMessageDialog(null, "Se Registro Exitosamente");          
                        band = true;
                    }else{
                        band= false;
                    }
                } catch (SQLException e) {
                }
                
            }
        }
        registrarAvion.getTxt_alto().setText("");
        registrarAvion.getTxt_ancho().setText("");
        registrarAvion.getTxt_largo().setText("");
        
        registrarAvion.getTxt_aerolinea().setText("");
            
    return band;
    }
    
    public boolean registrarAvionHangar(){
        
               
        
        boolean band = false;
        if (buscarAvion()==false && validarCamposAvion()==true){
            if(buscarClienteAvion()==true){
            
                int idavion = Integer.parseInt(registrarAvion.getTxt_matricula().getText());
                String alto = registrarAvion.getTxt_alto().getText();
                String largo = registrarAvion.getTxt_largo().getText();
                String ancho = registrarAvion.getTxt_ancho().getText();
                int idcliente = Integer.parseInt(registrarAvion.getTxt_propieetario().getText());
                String estado = "0";
                
                System.out.println(idavion+" \n"+alto);
                
                String sql = "INSERT INTO avion (idavion,alto,largo,ancho,idcliente,estado) VALUES(?,?,?,?,?,?)";
                Connection conectar;
                PreparedStatement pst;
                try {
                    conectar = Conexion.getConnection();
                    pst = conectar.prepareStatement(sql);
                    pst.setInt(1, idavion);
                    pst.setString(2, alto);
                    pst.setString(3, largo);
                    pst.setString(4, ancho);
                    pst.setInt(5, idcliente);
                    pst.setString(6, estado);
                    int i = pst.executeUpdate();
                    if(i!=0){
                        JOptionPane.showMessageDialog(null, "Se Registro Exitosamente");          
                        band = true;
                    }else{
                        band= false;
                    }
                } catch (SQLException e) {
                }
            
            }else{JOptionPane.showMessageDialog(null, "EL CLIENTE NO EXISTE");     }
                
                
            }
        return band;
    }
    
    public boolean buscarAvion(){
         boolean band = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT idavion FROM avion WHERE idavion = ?");
            ps.setInt(1, Integer.parseInt(registrarAvion.getTxt_matricula().getText()));
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt("idavion");
                JOptionPane.showMessageDialog(null, "EL AVION CON ID: "+id+" YA SE ENCUENTRA REGISTRADO");
                band = true;
            }else{}
        } catch (Exception e) {
        }       
                
    return band;
    }
    public boolean validarCamposAvion(){
        boolean band = false;
         if (registrarAvion.getTxt_aerolinea().getText().equals("")||registrarAvion.getTxt_alto().getText().equals("")||registrarAvion.getTxt_ancho().getText().equals("")||registrarAvion.getTxt_largo().getText().equals("")||registrarAvion.getTxt_matricula().getText().equals("")||registrarAvion.getTxt_propieetario().getText().equals("")){
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS! "); 
        }else{ band = true;}
        
    return band;    
    }
    

}
