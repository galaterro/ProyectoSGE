/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.persistencia;


import erp.cinesaztec.modelo.Entrada;
import erp.cinesaztec.modelo.Sala;
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
public class EntradaPersistencia {
    GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    Entrada entrada;
    ArrayList<Entrada> alEntrada = new ArrayList();
    
    public void ingresarEntrada(Entrada entrada) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        int filasAfectadas;

        String sql = "insert into entrada values(" + entrada.getId_entrada()+ "," + entrada.getPrecio_entrada() + "," + entrada.getId_pelicula() + ")";
        
        c = gbd.conectarBBDD();
        st = c.createStatement();

        filasAfectadas = st.executeUpdate(sql);
        System.out.println("filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }
    
    public ArrayList listarEntradas() throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        String sql = "select * from entrada";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            entrada = new Entrada(rs.getInt(1), rs.getDouble(2), rs.getInt(3));
            alEntrada.add(entrada);
           
        }
        gbd.cerrarConexionBBDD();
        return alEntrada;

    }
}
