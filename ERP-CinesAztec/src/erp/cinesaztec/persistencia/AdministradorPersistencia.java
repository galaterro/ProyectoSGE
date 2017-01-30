/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Administrador;
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
public class AdministradorPersistencia {
    GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Administrador administrador ;
    ArrayList<Administrador> alAdministrador = new ArrayList();
    
    public void ingresarAdministrador(Administrador administrador) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        int filasAfectadas;

        String sql = "insert into administrador values('" + administrador.getUsuario_admin()
                +"','" + administrador.getContraseña_admin() + "'," + administrador.getId_empleado() +
                ", '"+ administrador.getDni_empleado() + "', '" + administrador.getNombre_empleado() +
                "','" + administrador.getApellidos_empleado() + "'," + administrador.getTelefono_empleado()
                + ", '" + administrador.getFecha_inicio() + "','" + administrador.getCargo_empleado() + "'," 
                + administrador.getId_cine() + ")";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        filasAfectadas = st.executeUpdate(sql);
        System.out.println("Filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarAdministrador() throws ClassNotFoundException, SQLException {
        gbd.conectarBBDD();

        String sql = "select * from administrador";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        System.out.println("Los Administradores son: ");
        while (rs.next()) {
            administrador = new Administrador(rs.getString(1), rs.getString(2), rs.getInt(3),
                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDate(8),
                    rs.getString(9), rs.getInt(10));
            alAdministrador.add(administrador);
        }
        gbd.cerrarConexionBBDD();
        return alAdministrador;
    }

    public ArrayList buscarAdmin(String dni_aux) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        String sql = "select * from  administrador WHERE dni_admin = '%" + dni_aux + "%'";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            administrador = new Administrador(rs.getString(1), rs.getString(2), rs.getInt(3),
                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDate(8),
                    rs.getString(9), rs.getInt(10));
            alAdministrador.add(administrador);
        }
        gbd.cerrarConexionBBDD();
        return alAdministrador;
    }
}
