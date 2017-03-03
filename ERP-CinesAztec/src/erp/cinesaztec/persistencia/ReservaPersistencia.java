/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Reserva;
import java.sql.Connection;
import java.sql.Date;
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
public class ReservaPersistencia {
    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Reserva reserva;
    private ArrayList<Reserva> alReserva = new ArrayList();

    public void ingresarReserva(Reserva reserva) throws SQLException, ClassNotFoundException {
        String sql = "insert into reserva (id_pelicula, id_sesion, id_butaca, id_cliente) values (?,?,?,?)";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps.setInt(1, reserva.getId_pelicula());
        ps.setInt(2, reserva.getId_sesion());
        ps.setInt(3, reserva.getId_butaca());
        ps.setInt(4, reserva.getId_cliente());
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
        String sql = "SELECT `id_sesion` from sesion where id_sesion in (select id_pelicula from sala where id_sesion in (select id_sesion from sala where id_sala in (select id_sala from butaca)))"; 
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            id = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return id;
    }
    
    public int consultaIdCliente(String dni) throws ClassNotFoundException, SQLException{
        String sql = "Select id_cliente from cliente where lower(dni_cli) = lower('" + dni + "')";
        int id = 0;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            id = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return id;
    }
    
    public int consultarIDPelicula(String nombre, int idSala) throws ClassNotFoundException, SQLException{
        String sql = "Select id_pelicula from pelicula where lower(nombre_pelicula) = lower('" + nombre + "') and id_sala = " + idSala ;
        int id = 0;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            id = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return id;
    }
    
    public int consultarIDSala(String nombre) throws ClassNotFoundException, SQLException{
        String sql = "Select id_sala from sala where lower(nombre_sala) = lower('" + nombre + "')";
        int id = 0;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            id = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return id;
    }
    
    public int consultarIDSesion(Time hora, int idPelicula, int idSala) throws ClassNotFoundException, SQLException{
        String sql = "Select id_sesion from sesion where hora_sesion = '" + hora + "' and id_pelicula = " + idPelicula + " and id_sala = " + idSala;
        int idSesion = 0;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            idSesion = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return idSesion;
    }
    
    public int consultarIDButaca(int fila, int columna, int idSala) throws ClassNotFoundException, SQLException{
        String sql = "Select id_butaca from butaca where numero_fila = " + fila + " and numero_columna = " + columna + " and id_sala = " + idSala;
        int id = 0;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            id = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return id;
    }
    
    public String consultarNombreSala (String nombre) throws ClassNotFoundException, SQLException{
        String sql = "Select nombre_sala from sala where id_sala = (Select id_sala from pelicula where lower(nombre_pelicula) = lower('" + nombre + "'))";
        String nombreSala = null;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            nombreSala = rs.getString(1);
        }
        gbd.cerrarConexionBBDD();
        return nombreSala;
    }
    
    public int consultarColumnaButaca(int id) throws ClassNotFoundException, SQLException{
        String sql = "Select numero_columna from butaca where id_butaca = " + id;
        int columna = 0;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            columna = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return columna;
    }
    
     public String consultarDniCliente(int id) throws ClassNotFoundException, SQLException{
        String sql = "Select dni_cli from cliente where id_cliente= " + id;
        String dni = null;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            dni = rs.getString(1);
        }
        gbd.cerrarConexionBBDD();
        return dni;
    }
     
     public void actualizarReserva(Reserva reserva, int id) throws SQLException, ClassNotFoundException {

        String sql = "update reserva set id_pelicula = ?, id_sesion = ?, id_butaca = ?, id_cliente = ? where id_reserva =?";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);

        ps.setInt(1, reserva.getId_pelicula());
        ps.setInt(2, reserva.getId_sesion());
        ps.setInt(3, reserva.getId_butaca());
        ps.setInt(4, reserva.getId_cliente());
        ps.setInt(5, id);

        ps.executeUpdate();
        ps.close();

        System.out.println("Actualizado");

        gbd.cerrarConexionBBDD();
    }
     
    public Time consultarHoraSesion(int id) throws ClassNotFoundException, SQLException{
        String sql = "Select hora_sesion from sesion where id_sesion = " + id;
        Time hora = null;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            hora = rs.getTime(1);
        }
        gbd.cerrarConexionBBDD();
        return hora;
    }
    
    public int consultarFilaButaca(int id) throws ClassNotFoundException, SQLException{
        String sql = "Select numero_fila from butaca where id_butaca = " + id;
        int fila = 0;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            fila = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return fila;
    }
    
    public boolean existeReserva(int id) throws SQLException, ClassNotFoundException {
        boolean encontrado = false;
        String sql = "select * from reserva where id_reserva = ?";
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
    
    public void eliminarReserva(int id) throws ClassNotFoundException, SQLException {
        c = gbd.conectarBBDD();
        String sql = "delete from reserva where id_reserva = " + id ;
        st = c.createStatement();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }
}
