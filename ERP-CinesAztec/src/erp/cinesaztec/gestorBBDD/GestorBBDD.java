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
        String servidor = "jdbc:mysql://146.185.160.131:3306/cinema";

        Class.forName(driver);//Carga del driver
        c = (Connection) DriverManager.getConnection(servidor, user, passWord);
        System.out.println("Conexion exitosa");
        System.out.println("Conexión : " + c);
    }

    public void cerrarConexionBBDD() throws SQLException {
        c.close();
    }

    public void ingresarCine() throws SQLException, ClassNotFoundException {
        conectarBBDD();
        
        int filasAfectadas;
        String sql = "insert into cine values(1,'cine XXX ','0000450','calle mipalo','getafe',28502)";
        st = c.createStatement();
        filasAfectadas = st.executeUpdate(sql);
        System.out.println("filas afectadas: "+filasAfectadas);
        c.close();
    }
    
    public void listarCines() throws ClassNotFoundException, SQLException{
        conectarBBDD();
        String sql = "select * from cine";

        st = c.createStatement();
        rs = st.executeQuery(sql);
        System.out.println("Los cines son: ");
        while (rs.next()) {
            System.out.println("id_cine: "+rs.getInt(1) + " Nombre cine: " + rs.getString(2) + " cif: " + rs.getString(3)+ " dir: "+ rs.getString(4)+ " pob : "+rs.getString(5)+" cod postal : "+ rs.getInt(6));
        }
        c.close();
    
    }
    public static void main(String[] args) {
        GestorBBDD g = new GestorBBDD();
        try {
            g.conectarBBDD();
            g.ingresarCine();
            g.listarCines();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestorBBDD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("aqui");
        } catch (SQLException ex) {
            Logger.getLogger(GestorBBDD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println();
        }
    }
}
