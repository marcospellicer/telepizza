/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telepizza;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Bd {
    private Connection con;
    private String url;
    private String usu;
    private  String passwd;

    public Bd(String url, String usu, String passwd) {
        this.url = url;
        this.usu = usu;
        this.passwd = passwd;
    }
    
    private void conectar(){
        try {
            con= (Connection) DriverManager.getConnection(url, usu, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(Bd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Bd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<String> devovlerPizzas(){
      conectar();
        ArrayList<String> pi = new ArrayList<>();
        try {
            Statement s =  (Statement) con.createStatement();
            ResultSet rs = s.executeQuery("select nombre from pizzas;");
            
            while(rs.next()){
                pi.add(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bd.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
       return pi;
    }
     public Cliente devovlerCliente(String tel){
      conectar();
       Cliente  c = null;
        try {
            Statement s =  (Statement) con.createStatement();
            ResultSet rs = s.executeQuery("select * from clientes where telefono ='"+tel+"';");
            
            if(rs.first()){
                c = new Cliente(rs.getString("nombre"), rs.getString("telefono"), rs.getString("direccion"));  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bd.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
       return c;
    }
     public int estaCliente(String tel){
      conectar();
      int aux = -1;
        try {
            Statement s =  (Statement) con.createStatement();
            ResultSet rs = s.executeQuery("select count(*) from clientes where telefono ='"+tel+"';");
            
            if(rs.first()){
          aux= rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bd.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
        
       return aux;
    }
    
    public ArrayList<Cliente> devovlerClientes(){
      conectar();
        ArrayList<Cliente> pi = new ArrayList<>();
        try {
            Statement s =  (Statement) con.createStatement();
            ResultSet rs = s.executeQuery("select * from clientes;");
            
            while(rs.next()){
                Cliente c = new Cliente(rs.getString("nombre"), rs.getString("telefono"), rs.getString("direccion"));
                pi.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bd.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
       return pi;
    }
    public void guardarCliente(Cliente c){
        conectar();
        try {
            Statement s =  (Statement) con.createStatement();
            s.executeUpdate("insert into clientes values (0,'"+c.getNombre()+"','"+c.getTelefono()+"','"+c.getDireccion()+"');");
            
          
        } catch (SQLException ex) {
            Logger.getLogger(Bd.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the usu
     */
    public String getUsu() {
        return usu;
    }

    /**
     * @param usu the usu to set
     */
    public void setUsu(String usu) {
        this.usu = usu;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    
}
