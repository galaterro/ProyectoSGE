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
    GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    Reserva reserva;
    ArrayList<Reserva> alReserva = new ArrayList();

    public void ingresarReserva(Reserva reserva) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        int filasAfectadas;

        String sql = "insert into reserva values(" + reserva.getId_reserva()+ ",'" + reserva.getId_pelicula()+ "','" + reserva.getId_sesion() + "','" + reserva.getId_butaca() + "','" + reserva.getId_cliente() + "','" + reserva.getId_sala() + ")";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        filasAfectadas = st.executeUpdate(sql);
        System.out.println("filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarSalas() throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        String sql = "select * from reserva";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        System.out.println("Las reservas son: ");
        while (rs.next()) {
            reserva = new Reserva(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
            alReserva.add(reserva);
        }
        gbd.cerrarConexionBBDD();
        return alReserva;

    }

}
