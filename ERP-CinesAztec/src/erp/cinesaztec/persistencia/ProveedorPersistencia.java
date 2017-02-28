/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.persistencia;

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

    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Proveedor proveedor;
    private ArrayList<Proveedor> alProveedor = new ArrayList();
    
    public void ingresarProveedor(Proveedor proveedor) throws SQLException, ClassNotFoundException {
        
        String sql = "insert into proveedor (cif_proveedor, nombre_proveedor, apellidos_proveedor, telefono_proveedor, poblacion_proveedor, cp_proveedor, id_cine) values (?,?,?,?,?,?,?)";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps.setString(1, proveedor.getCif_proveedor());
        ps.setString(2, proveedor.getNombre_proveedor());
        ps.setString(3, proveedor.getApellidos_proveedor());
        ps.setInt(4, proveedor.getTelefono_proveedor());
        ps.setString(5, proveedor.getPob_proveedor());
        ps.setInt(6, proveedor.getCodPos_proveedor());
        ps.setInt(7, proveedor.getId_cine());
        ps.executeUpdate();
        ps.close();
        gbd.cerrarConexionBBDD();
    }
    
    public ArrayList listarProveedores() throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        
        String sql = "select * from proveedor";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            proveedor = new Proveedor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
            alProveedor.add(proveedor);
            
        }
        gbd.cerrarConexionBBDD();
        return alProveedor;
        
    }
    
    public Proveedor buscarProveedor(String cif_aux) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        String sql = "SELECT * FROM proveedor WHERE cif_proveedor = '" + cif_aux + "'";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        proveedor = new Proveedor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
        gbd.cerrarConexionBBDD();
        return proveedor;
    }
    
     public int buscarIdCinePorNombre(String nombre) throws ClassNotFoundException, SQLException{
        int id_Cine = 0;
        String sql = "SELECT id_cine FROM cine WHERE lower(nombre_cine) = lower('" + nombre + "')";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        id_Cine = rs.getInt(1);
        gbd.cerrarConexionBBDD();
        return id_Cine;
    }
     
      /* Usado para modificar los datos de un proveedor existente. */
    public void actualizarCine(Proveedor proveedor, String cif) throws SQLException, ClassNotFoundException {

        String sql = "update cine set cif_proveedor = ?, nombre_proveedor= ?, apellidos_proveedor= ?, telefono_proveedor = ?, poblacion_proveedor = ?, cp_proveedor = ?, id_cine = ? where cif_cine = '" + cif + "'";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);

        ps.setString(1, proveedor.getCif_proveedor());
        ps.setString(2, proveedor.getNombre_proveedor());
        ps.setString(3, proveedor.getApellidos_proveedor());
        ps.setInt(4, proveedor.getTelefono_proveedor());
        ps.setString(5, proveedor.getPob_proveedor());
        ps.setInt(5, proveedor.getCodPos_proveedor());
        ps.setInt(5, proveedor.getId_cine());
        ps.executeUpdate();
        ps.close();
        gbd.cerrarConexionBBDD();
    }

    public boolean existeProveedor(String cif) throws SQLException, ClassNotFoundException {
        boolean encontrado = false;
        String sql = "select * from proveedor where cif_proveedor= ?";
        c = gbd.conectarBBDD();
        ps = (PreparedStatement) c.prepareStatement(sql);
        ps.setString(1, cif);
        rs = ps.executeQuery();

        while (rs.next()) {
            encontrado = true;
        }
        ps.close();
        gbd.cerrarConexionBBDD();
        return encontrado;
    }
}
