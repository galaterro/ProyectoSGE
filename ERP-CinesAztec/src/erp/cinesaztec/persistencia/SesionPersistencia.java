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
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author juanxxiii
 */
public class SesionPersistencia {
    
    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Sesion sesion;
    private ArrayList<Sesion> alSesion = new ArrayList();

    
     public void ingresarSesion(Sesion sesion) throws SQLException, ClassNotFoundException {
        
        String sql = "insert into sesion (hora_sesion, id_pelicula,id_sala) values (?,?,?)";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        
        ps = c.prepareStatement(sql);
        ps.setTime(1, sesion.getHora_sesion());
        ps.setInt(2, sesion.getId_pelicula());
        ps.setInt(3, sesion.getId_sala());
        ps.executeUpdate();
        ps.close();
        gbd.cerrarConexionBBDD();
    }
     
    public void actualizarSesion(Sesion sesion, int id) throws SQLException, ClassNotFoundException {

        String sql = "update sesion set hora_sesion= ?, id_pelicula = ?, id_sala = ? where id_sesion = " + id;
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);

        ps.setTime(1, sesion.getHora_sesion());
        ps.setInt(2, sesion.getId_pelicula());
        ps.setInt(3, sesion.getId_sala());

        ps.executeUpdate();
        ps.close();

        System.out.println("Actualizado");

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
            sesion = new Sesion(rs.getInt(1), rs.getTime(2), rs.getInt(3), rs.getInt(4));
            alSesion.add(sesion);
        }
        gbd.cerrarConexionBBDD();
        return alSesion;
    }
    
    public Sesion buscarSesiones(int id_aux) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        String sql = "SELECT * FROM sesion WHERE id_sesion= " + id_aux ;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        sesion = new Sesion(rs.getInt(1), rs.getTime(2), rs.getInt(3), rs.getInt(4));
        gbd.cerrarConexionBBDD();
        return sesion;
    }
    
    public boolean existeSesion(int id) throws SQLException, ClassNotFoundException {
        boolean encontrado = false;
        String sql = "select * from sesion where id_sesion = ?";
        c = gbd.conectarBBDD();
        ps = (PreparedStatement) c.prepareStatement(sql);
        ps.setInt(1, id);
        rs = ps.executeQuery();

        while (rs.next()) {
            encontrado = true;
        }
        ps.close();
        gbd.cerrarConexionBBDD();
        return encontrado;
    }
    
     public int consultarIdPelicula(String nombre) throws ClassNotFoundException, SQLException {

        int id = 0;
        String sql = "SELECT id_pelicula FROM pelicula WHERE lower(nombre_pelicula) = lower('"+nombre+"')";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            id = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return id;
    }

    public String buscarNombrePelicula(int id) throws ClassNotFoundException, SQLException {
        String nombre = null;
        c = gbd.conectarBBDD();
        String sql = "Select nombre_pelicula from pelicula where id_pelicula = " + id;
        st =  c.createStatement();
        rs = st.executeQuery(sql);
        
        while (rs.next()) {
            nombre = rs.getString(1);
        }
        gbd.cerrarConexionBBDD();
        return nombre;
    }
     public int consultarIdSala(String nombre) throws ClassNotFoundException, SQLException {

        int id = 0;
        String sql = "SELECT id_sala FROM sala WHERE lower(nombre_sala) = lower('"+nombre+"')";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            id = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return id;
    }

    public String buscarNombreSala(int id) throws ClassNotFoundException, SQLException {
        String nombre = null;
        c = gbd.conectarBBDD();
        String sql = "Select nombre_sala from sala where id_sala = " + id;
        st =  c.createStatement();
        rs = st.executeQuery(sql);
        
        while (rs.next()) {
            nombre = rs.getString(1);
        }
        gbd.cerrarConexionBBDD();
        return nombre;
    }

    public void eliminarSesion(int id) throws ClassNotFoundException, SQLException {
        c = gbd.conectarBBDD();
        String sql = "delete from sesion where id_sesion = " + id ;
        st = c.createStatement();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }

}
