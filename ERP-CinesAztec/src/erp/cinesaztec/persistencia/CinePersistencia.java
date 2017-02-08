/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Cine;
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
public class CinePersistencia {

    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Cine cine;
    private ArrayList<Cine> alCine = new ArrayList();

    
     public void ingresarCine(Cine cine) throws SQLException, ClassNotFoundException {
        int filasAfectadas;

        String sql = "insert into cine values(" + cine.getId_cine() + ",'" + cine.getNombre_cine() + "','" + cine.getCif_cine() + "','" + cine.getDir_cine() + "','" + cine.getPob_cine() + "'," + cine.getCodPos_cine() + ")";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        filasAfectadas = st.executeUpdate(sql);
        System.out.println("filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarCines() throws ClassNotFoundException, SQLException {
        String sql = "select * from cine";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        System.out.println("Los cines son: ");
        while (rs.next()) {
            cine = new Cine(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
            alCine.add(cine);
        }
        gbd.cerrarConexionBBDD();
        return alCine;
    }

    public ArrayList buscarCine(String cif) throws ClassNotFoundException, SQLException {
        //gbd.conectarBBDD();

        String sql = "select * from cine WHERE cif_cine = "+ cif;
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        while (rs.next()) {
            cine = new Cine(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
            alCine.add(cine);
        }
        gbd.cerrarConexionBBDD();
        return alCine;
    }
    public void eliminarCine(String cif)throws ClassNotFoundException, SQLException {
         gbd.conectarBBDD();       
         String sql = "delete from cine where cif = "+cif;
         st.executeUpdate(sql);
         gbd.cerrarConexionBBDD();
    }
}
