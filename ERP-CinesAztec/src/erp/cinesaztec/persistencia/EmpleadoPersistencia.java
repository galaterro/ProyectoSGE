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
     GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    Empleado empleado;
    ArrayList<Empleado> alEmpleado = new ArrayList();

    
     public void ingresarEmpleado(Empleado empleado) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        int filasAfectadas;

        String sql = "insert into sesion values(" + empleado.getId_empleado() + ",'" + empleado.getDni_empleado() + "','" 
                + empleado.getNombre_empleado()+ "','" + empleado.getApellidos_empleado()+ "'," + empleado.getTelefono_empleado() + 
                ",'" + empleado.getFecha_inicio() + "','" + empleado.getCargo_empleado() + "'," + empleado.getId_cine() + ")";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        filasAfectadas = st.executeUpdate(sql);
        System.out.println("filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarSesion() throws ClassNotFoundException, SQLException {
        gbd.conectarBBDD();

        String sql = "select * from cine";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        System.out.println("Los cines son: ");
        while (rs.next()) {
            empleado = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDate(6),
                    rs.getString(7), rs.getInt(8));
            alEmpleado.add(empleado);
        }
        gbd.cerrarConexionBBDD();
        return alEmpleado;
    }
}
