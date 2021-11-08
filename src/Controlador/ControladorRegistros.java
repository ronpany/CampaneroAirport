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
//================================== ALQUILAR HANGAR ==================================================================================
    public void refrescar(){
         try{
            DefaultTableModel modelo = new DefaultTableModel();
            alquilarAvion.getTbl_hangares().setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT idhangar, alto, largo, ancho, estado, tarifa FROM hangar";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("ID Hangar");
            modelo.addColumn("Alto");
            modelo.addColumn("Largo");
            modelo.addColumn("Ancho");
            modelo.addColumn("Estado");
            modelo.addColumn("Tarifa/Hora");

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
         
        for(int i = 0; i<alquilarAvion.getTbl_hangares().getRowCount(); i++) {//para recorrer la filas de jtabla
                           
                String s = alquilarAvion.getTbl_hangares().getValueAt(i, 4).toString();
                
                if(!s.equals("0")){
                    alquilarAvion.getTbl_hangares().setValueAt("NO DISPONIBLE", i, 4);                   
                }
                else{                
                    alquilarAvion.getTbl_hangares().setValueAt("DISPONIBLE", i, 4);  
                }             
            
        }
        
    }  

    public void alquilar(){
        
        try {
            
        int indice_1 = alquilarAvion.getTbl_hangares().getSelectedRow();        
        
        if(indice_1<0){
        
            JOptionPane.showMessageDialog(null, "ESCOJA UN HANGAR PARA ALQUILAR"); 
            
        }else{
            String indice = alquilarAvion.getTbl_hangares().getValueAt(alquilarAvion.getTbl_hangares().getSelectedRow(), 4).toString();
            if (indice.equals("NO DISPONIBLE")){
        
            JOptionPane.showMessageDialog(null, "EL HANGAR YA ESTA OCUPADO, ESCOJA UN HANGAR DISPONIBLE"); 
        }
        else{
            
            alquilarFinal.setVisible(true);
                        
        }
        }
        index=(int)alquilarAvion.getTbl_hangares().getValueAt(alquilarAvion.getTbl_hangares().getSelectedRow(),0);
        alto= alquilarAvion.getTbl_hangares().getValueAt(alquilarAvion.getTbl_hangares().getSelectedRow(), 1).toString();
        largo=alquilarAvion.getTbl_hangares().getValueAt(alquilarAvion.getTbl_hangares().getSelectedRow(), 2).toString();
        ancho=alquilarAvion.getTbl_hangares().getValueAt(alquilarAvion.getTbl_hangares().getSelectedRow(), 3).toString();
        tarifa=alquilarAvion.getTbl_hangares().getValueAt(alquilarAvion.getTbl_hangares().getSelectedRow(), 5).toString();
        } catch (Exception e) {
            
        }
        
    }
    
    
    public void refrescarAviones(){
    
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            alquilarFinal.getTbl_aviones().setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT idavion, alto, largo, ancho, idcliente, estado FROM avion";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("Matricula");
            modelo.addColumn("Alto");
            modelo.addColumn("Largo");
            modelo.addColumn("Ancho");
            modelo.addColumn("ID Cliente");
            modelo.addColumn("Estado");

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
        
        for(int i = 0; i<alquilarFinal.getTbl_aviones().getRowCount(); i++) {//para recorrer la filas de jtabla
                           
                String s = alquilarFinal.getTbl_aviones().getValueAt(i, 5).toString();
                
                if(!s.equals("0")){
                    alquilarFinal.getTbl_aviones().setValueAt("EN HANGAR", i, 5);                   
                }
                else{                
                    alquilarFinal.getTbl_aviones().setValueAt("SIN HANGAR", i, 5);  
                }             
            
        }
    }
    
    public void buscarAvionesHangar(){
        String matricula    = alquilarFinal.getTxt_matricula().getText();
        String where        = "";
        
        if(!matricula.equals("")){
        
            where = "WHERE idavion = '"+matricula+"'";
        }
        else{JOptionPane.showMessageDialog(null, "INGRESE UNA MATRICULA");}
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            alquilarFinal.getTbl_aviones().setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT idavion, alto, largo, ancho, idcliente FROM avion "+where;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("Matricula");
            modelo.addColumn("Alto");
            modelo.addColumn("Largo");
            modelo.addColumn("Ancho");
            modelo.addColumn("ID Cliente");

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
    
    public void GuardarAlquiler(int idhangar, String alto, String largo, String ancho,String tarifa){
        
        if (alquilarFinal.getDtc_entrada().getDate()!=null&&!alquilarFinal.getTxt_Horas().getText().equals("")){
            int horas = Integer.parseInt(alquilarFinal.getTxt_Horas().getText());
            Calendar fecha_entrada  = alquilarFinal.getDtc_entrada().getCalendar();
          
            try {
                String s = alquilarFinal.getTbl_aviones().getValueAt(alquilarFinal.getTbl_aviones().getSelectedRow(), 5).toString();
                System.out.println(s);

           if (s.equals("EN HANGAR")){

               JOptionPane.showMessageDialog(null, "ESCOJA UN AVION SIN HANGAR");
           }
           else{ 
                String x = alquilarFinal.getTbl_aviones().getValueAt(alquilarFinal.getTbl_aviones().getSelectedRow(), 1).toString();
                int alto_1 = Integer.parseInt(x);

                x = alquilarFinal.getTbl_aviones().getValueAt(alquilarFinal.getTbl_aviones().getSelectedRow(), 2).toString();
                int largo_1 = Integer.parseInt(x);

                x = alquilarFinal.getTbl_aviones().getValueAt(alquilarFinal.getTbl_aviones().getSelectedRow(), 3).toString();
                int ancho_1 = Integer.parseInt(x);

                int alto_2  = Integer.parseInt(alto);
                int largo_2 = Integer.parseInt(largo);
                int ancho_2 = Integer.parseInt(ancho);

                String matricula_avion = alquilarFinal.getTbl_aviones().getValueAt(alquilarFinal.getTbl_aviones().getSelectedRow(), 0).toString();

                if(alto_1<alto_2 && largo_1<largo_2 && ancho_1<ancho_2){
                    if(buscarAvionHangar()){
                     PreparedStatement PS;
                     Connection CN =null;
                     String idavion = alquilarFinal.getTxt_matricula().getText();

                     String sql = "UPDATE hangar SET estado ="+idavion+" WHERE idhangar ="+idhangar;
                     int res =0;
                     try {
                     CN= Conexion.getConnection();
                     PS=CN.prepareStatement(sql);
                     res = PS.executeUpdate();
                     if(res>0){                
                         String estado = idhangar+"";
                         sql = "UPDATE avion SET estado ="+estado+" WHERE idavion ="+matricula_avion;
                         res =0;
                         try{
                             CN= Conexion.getConnection();
                             PS=CN.prepareStatement(sql);
                             res= PS.executeUpdate();
                             if(res>0){
                                float tarifaFloat    = Float.parseFloat(tarifa);
                                int   horasInt       = Integer.parseInt(alquilarFinal.getTxt_Horas().getText());
                                float total          = tarifaFloat * horasInt;
                                
                                String dia = Integer.toString(alquilarFinal.getDtc_entrada().getCalendar().get(Calendar.DAY_OF_MONTH));
                                String mes = Integer.toString(alquilarFinal.getDtc_entrada().getCalendar().get(Calendar.MONTH) + 1);
                                String year = Integer.toString(alquilarFinal.getDtc_entrada().getCalendar().get(Calendar.YEAR));
                                String fechatipostring = (year + "-" + mes+ "-" + dia);
                                sql = "INSERT INTO registro (idregistro,entrada,salida,idhangar,idavion,total,tiempo) VALUES(?,?,?,?,?,?,?)";
                                Connection conectar;
                                PreparedStatement pst;
                                try {
                                    conectar = Conexion.getConnection();
                                    pst = conectar.prepareStatement(sql);
                                    pst.setInt(1, 0);
                                    pst.setString(2, fechatipostring);
                                    pst.setString(3, "0");
                                    pst.setInt(4, idhangar);
                                    pst.setString(5, idavion);
                                    pst.setFloat(6, total);
                                    pst.setInt(7, horasInt);
                                    int i = pst.executeUpdate();
                                    if(i!=0){
                                        Connection con = null;
                                        try {
                                            con = Conexion.getConnection();
                                            PreparedStatement ps = con.prepareStatement("SELECT idregistro FROM registro WHERE idhangar = ?");
                                            ps.setInt(1, idhangar);
                                            ResultSet rs = ps.executeQuery();
                                            if(rs.next()){
                                                int id = rs.getInt("idregistro");
                                                factura.getLbl_NumeroFactura().setText(id+"");
                                                factura.getLbl_MatriculaAvion().setText(idavion);
                                                factura.getLbl_NumeroHangar().setText(idhangar+"");
                                                factura.getLbl_TotalHoras().setText(horasInt+"");
                                                factura.getLbl_tarifa().setText(tarifa);
                                                factura.getLbl_total().setText(total+"");
                                                factura.setVisible(true);
                                                JOptionPane.showMessageDialog(null, "Se Registro Exitosamente");
                                            }else{}
                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }                                        
                                        
                                    }
                                } catch (SQLException e) {
                                    System.out.println(e);
                                }                            
                                
                                 refrescarAviones();
                             }
                         }catch(SQLException e){
                             JOptionPane.showMessageDialog(null, "NO SE PUDO CONECTAR CON LA BASE DE DATOS!");
                         }
                     }
                     } catch (SQLException e) {
                         JOptionPane.showMessageDialog(null, "NO SE PUDO CONECTAR CON LA BASE DE DATOS!");
                     }
                     }
                     else{JOptionPane.showMessageDialog(null, "INGRESE UNA MATRICULA EXISTENTE");}
                }
                else {JOptionPane.showMessageDialog(null, "EL AVION ES MUY GRANDE PARA EL HANGAR");}



           }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UN AVION! ");
                }
            
        } else {JOptionPane.showMessageDialog(null, "DEBE INGRESAR UNA FECHA Y UN NUMERO DE HORAS! ");}
        
    }
    
    public boolean buscarAvionHangar(){
         boolean band = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT idavion FROM avion WHERE idavion = ?");
            ps.setInt(1, Integer.parseInt(alquilarFinal.getTxt_matricula().getText()));
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt("idavion");
                band = true;
            }else{}
        } catch (Exception e) {
        }       
                
    return band;
    }

    // --------------------- CONSULTAR CLIENTE --------------------------------------------------
    public boolean consultarCliente(){
        boolean band = false;
        if (validarCamposConsultarCliente()&&buscarClienteconID(Integer.parseInt(consultarCliente.getTxt_idcliente().getText()))){
            Connection con = null;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT idcliente,nombre,email,direccion,telefono FROM cliente WHERE idcliente = ?");
             ps.setInt(1, Integer.parseInt(consultarCliente.getTxt_idcliente().getText()));
            ResultSet rs = ps.executeQuery();
            String nombre ="";
            String email="";
            String direccion="";
            String telefono="";
            if(rs.next()){
                nombre = rs.getString("nombre");
                email = rs.getString("email");
                direccion = rs.getString("direccion");
                telefono = rs.getString("telefono");
                consultarCliente.getTxt_nombre().setText(nombre);
                consultarCliente.getTxt_email().setText(email);
                consultarCliente.getTxt_direccion().setText(direccion);
                consultarCliente.getTxt_telefono().setText(telefono);                
            }
 
            
            
        } catch (Exception e) {
        }
        }else{
            JOptionPane.showMessageDialog(null, "EL CLIENTE NO EXISTE"); 
        }
        return band;
    }
    public boolean validarCamposConsultarCliente(){
        boolean band = false;
        if(consultarCliente.getTxt_idcliente().getText().equals("")){
            JOptionPane.showMessageDialog(null, "INGRESE UNA IDENTIFICACION!");
            
        }else{band=true;}
        
        return band;
    }
    // Este metodo busca a un cliente por su cedula
    public boolean buscarClienteconID(int idcliente){
        boolean band = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT idcliente FROM cliente WHERE idcliente = ?");
            ps.setInt(1, idcliente);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt("idcliente");
                band = true;
            }else{}
        } catch (Exception e) {
        }
        
        
        
    return band;
    }
     
    public void modificarCliente(){
     
         if(consultarCliente.getTxt_direccion().getText().equals("")||consultarCliente.getTxt_email().getText().equals("")||consultarCliente.getTxt_idcliente().getText().equals("")||consultarCliente.getTxt_nombre().getText().equals("")||consultarCliente.getTxt_telefono().getText().equals("")){
         
             JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS DATOS"); 
         }
         else{
             if (buscarClienteconID(Integer.parseInt(consultarCliente.getTxt_idcliente().getText()))) {
                                Connection con = null;
                                try {
                                    String v_nombre          = consultarCliente.getTxt_nombre().getText();
                                    String v_email           = consultarCliente.getTxt_email().getText();
                                    String v_direccion       = consultarCliente.getTxt_direccion().getText();
                                    String v_telefono        = consultarCliente.getTxt_telefono().getText();
                                    int    v_idcliente       = Integer.parseInt(consultarCliente.getTxt_idcliente().getText());
                                    con = Conexion.getConnection();
                                    PreparedStatement ps = con.prepareStatement("UPDATE cliente SET  nombre='"+v_nombre+"',email='"+v_email+"',direccion='"+v_direccion+"', telefono='"+v_telefono+"' WHERE idcliente = '"+v_idcliente+"'");
 
                                    ps.executeUpdate();
                                    JOptionPane.showMessageDialog(null, "ACTUALIZACION EXITOSA");

                                } catch (Exception e) {
                                    System.out.println(e);
                                }
             }else{JOptionPane.showMessageDialog(null, "INGRESE EL ID DE UN CLIENTE EXISTENTE");}
         }
  }
    

}
