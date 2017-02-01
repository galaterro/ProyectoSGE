/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author allen
 */
class GestorBBDD {
    
    private Connection c;//Conexión
    

    public Connection conectarBBDD() throws ClassNotFoundException, SQLException {

        String user = "usuario";
        String passWord = "usuario";
        String driver = "com.mysql.jdbc.Driver";
        String servidor = "jdbc:mysql://146.185.160.131:3306/cinema";

        Class.forName(driver);//Carga del driver
        c = DriverManager.getConnection(servidor, user, passWord);
        System.out.println("Conexion exitosa");
        System.out.println("Conexión : " + c);
        
        return c;
    }

    public void cerrarConexionBBDD() throws SQLException {
        c.close();
    }

}
