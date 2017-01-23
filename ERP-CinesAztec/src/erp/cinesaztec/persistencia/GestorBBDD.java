/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Cine;
import erp.cinesaztec.modelo.Sala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allen
 */
public class GestorBBDD {
    
    private Connection c;//Conexión
    

    public Connection conectarBBDD() throws ClassNotFoundException, SQLException {

        String user = "usuario";
        String passWord = "usuario";
        String driver = "com.mysql.jdbc.Driver";
        String servidor = "jdbc:mysql://146.185.160.131:3306/cinema";

        Class.forName(driver);//Carga del driver
        c = (Connection) DriverManager.getConnection(servidor, user, passWord);
        System.out.println("Conexion exitosa");
        System.out.println("Conexión : " + c);
        
        return c;
    }

    public void cerrarConexionBBDD() throws SQLException {
        c.close();
    }

   
    public static void prueba() {

       GestorBBDD g = new GestorBBDD();
        //Cine cine = new Cine(13,"cineXXX","123456789","calle cinex","Madrid",28400);
        CinePersistencia cineP = new CinePersistencia();
        ArrayList<Cine> alCin = new ArrayList();
        try {
            g.conectarBBDD();
            //cineP.ingresarCine(cine);
            alCin = cineP.listarCines();

            for (Cine cine1 : alCin) {
                System.out.println(cine1.getId_cine()+" "+cine1.getDir_cine());
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestorBBDD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("aqui");
            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(GestorBBDD.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
