/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.persistencia;


import erp.cinesaztec.modelo.Sesion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author juanxxiii
 */
class SesionPersistencia {
    
    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Sesion sesion;
    private ArrayList<Sesion> alSesion = new ArrayList();

    
     public void ingresarSesion(Sesion sesion) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        int filasAfectadas;
        String sql = "insert into sesion values(" + sesion.getId_sesion()+ ",'" + sesion.getHora_sesion() + "'," + sesion.getId_pelicula()+ "," + sesion.getId_sala() + ")";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        filasAfectadas = st.executeUpdate(sql);
        System.out.println("filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarSesion() throws ClassNotFoundException, SQLException {
        gbd.conectarBBDD();
        String sql = "select * from sesion";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        System.out.println("Las sesiones son: ");
        while (rs.next()) {
            sesion = new Sesion(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getInt(4));
            alSesion.add(sesion);
        }
        gbd.cerrarConexionBBDD();
        return alSesion;
    }
    
    public Sesion buscarSesiones(int id_aux) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        String sql = "SELECT * FROM SESION WHERE id_sesion= '" + id_aux + "'";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        sesion = new Sesion(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getInt(4));
        gbd.cerrarConexionBBDD();
        return sesion;
    }
}
