/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Cine;
import erp.cinesaztec.modelo.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author allen
 */
public class ProveedorPersistencia {
    GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Proveedor proveedor;
    private ArrayList<Proveedor> alProveedor = new ArrayList();

    
     public void ingresarProveedor(Proveedor proveedor) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        int filasAfectadas;

        String sql = "insert into proveedor values(" + proveedor.getId_proveedor() + ",'" +proveedor.getCif_proveedor()+ "','" + proveedor.getNombre_proveedor()+ "','" + proveedor.getApellidos_proveedor()  + "'," + proveedor.getTelefono_proveedor() + ",'" + proveedor.getPob_proveedor() + "',"+proveedor.getCodPos_proveedor()+")";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        filasAfectadas = st.executeUpdate(sql);
        System.out.println("filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarProveedores() throws ClassNotFoundException, SQLException {
        gbd.conectarBBDD();

        String sql = "select * from proveedor";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        System.out.println("Los Proveedores son: ");
        while (rs.next()) {
            proveedor = new Proveedor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),rs.getString(6), rs.getInt(7));
            alProveedor.add(proveedor);
        }
        gbd.cerrarConexionBBDD();
        return alProveedor;
    }
}
