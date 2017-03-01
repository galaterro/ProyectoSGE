/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Empleado;
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
public class EmpleadoPersistencia {

    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Empleado empleado;
    private ArrayList<Empleado> alEmpleado = new ArrayList();

    public void ingresarEmpleado(Empleado empleado) throws SQLException, ClassNotFoundException {
  
        String sql = "insert into empleado (dni_empleado, telefono_empleado, fecha_inicio, cargo_empleado, id_cine, usuario_empleado, password_empleado) values (?,?,?,?,?,?,?)";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        ps = c.prepareStatement(sql);
        ps.setString(1, empleado.getDni_empleado());
        ps.setInt(2, empleado.getTelefono_empleado());
        ps.setDate(3, empleado.getFecha_inicio());
        ps.setString(4, empleado.getCargo_empleado());
        ps.setInt(5, empleado.getId_cine());
        ps.setString(6, empleado.getUsuario_empleado());
        ps.setString(7, empleado.getPassword_empleado());
        ps.executeUpdate();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarEmpleados() throws ClassNotFoundException, SQLException {
        gbd.conectarBBDD();

        String sql = "select * from empleado";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            empleado = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDate(6),
                    rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10));
            alEmpleado.add(empleado);
        }
        gbd.cerrarConexionBBDD();
        return alEmpleado;
    }

    public Empleado buscarEmpleado(String dni_aux) throws ClassNotFoundException, SQLException {
        gbd.conectarBBDD();

        String sql = "select * from empleado WHERE dni_emp = '%" + dni_aux + "%'";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            empleado = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDate(6),
                    rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10));

        }
        gbd.cerrarConexionBBDD();
        return empleado;
    }
}
