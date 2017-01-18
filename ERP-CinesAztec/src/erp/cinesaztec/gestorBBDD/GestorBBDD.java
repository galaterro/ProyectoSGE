/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.gestorBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author allen
 */
public class GestorBBDD {
    private Connection c;//Conexión
    private Statement st;//sentencia a ejecutar
    private ResultSet rs;//resultado
    private PreparedStatement ps;

    public void conectarBBDD() throws ClassNotFoundException, SQLException {
        
        String user = "usuario";
        String passWord = "usuario";
        String driver = "com.mysql.jdbc.Driver";
        String servidor = "jdbc:mysql://146.185.160.131:3306";
        

        Class.forName(driver);//Carga del driver
        c = (Connection) DriverManager.getConnection(servidor, user, passWord);
        System.out.println("Conexion exitosa");
    }
    public void cerrarConexionBBDD() throws SQLException {
        c.close();
    }
    
    
    
    public static void main(String[] args) {
        GestorBBDD g = new GestorBBDD();
        try {
            g.conectarBBDD();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestorBBDD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("aqui");
        } catch (SQLException ex) {
            Logger.getLogger(GestorBBDD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println();
        }
    }
}
