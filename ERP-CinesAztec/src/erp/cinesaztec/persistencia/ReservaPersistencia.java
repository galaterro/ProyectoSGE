/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Reserva;
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
public class ReservaPersistencia {
    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Reserva reserva;
    private ArrayList<Reserva> alReserva = new ArrayList();

    public void ingresarReserva(Reserva reserva) throws SQLException, ClassNotFoundException {
        String sql = "insert into reserva (id_pelicula, id_sesion, id_butaca, id_cliente) values (?,?,?,?,?)";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps.setInt(1, reserva.getId_reserva());
        ps.setInt(2, reserva.getId_pelicula());
        ps.setInt(3, reserva.getId_sesion());
        ps.setInt(4, reserva.getId_butaca());
        ps.setInt(5, reserva.getId_cliente());
        ps.executeUpdate();
        ps.close();
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarReservas() throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        String sql = "select * from reserva";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            reserva = new Reserva(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            alReserva.add(reserva);
        }
        gbd.cerrarConexionBBDD();
        return alReserva;

    }
    
    public Reserva buscarReserva(int id_aux) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        String sql = "SELECT * FROM reserva WHERE id_reserva = '" + id_aux + "'";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        reserva = new Reserva(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),rs.getInt(5));
        gbd.cerrarConexionBBDD();
        return reserva;
    }

     public int consultarIdPelicula(String nombre) throws ClassNotFoundException, SQLException {

        int id = 0;
        String sql = "SELECT id_pelicula FROM pelicula WHERE lower(nombre_pelicula) = lower('" + nombre + "')";
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
    
    public int consultarIdSesion(String nombre) throws ClassNotFoundException, SQLException {

        int id = 0;
        String sql = "SELECT id_sesion FROM sesion WHERE lower(nombre_pelicula) = lower('" + nombre + "')";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            id = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return id;
    }
    
    
    
    public void eliminarReserva(int id) throws ClassNotFoundException, SQLException {
        c = gbd.conectarBBDD();
        String sql = "delete from reserva where id_reserva = " + id ;
        st = c.createStatement();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }
}
