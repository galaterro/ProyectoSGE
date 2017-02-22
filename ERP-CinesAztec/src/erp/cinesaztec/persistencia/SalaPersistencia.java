package erp.cinesaztec.persistencia;



import erp.cinesaztec.modelo.Sala;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Galaterro on 23/01/2017.
 */
public class SalaPersistencia {
    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Sala sala;
    private ArrayList<Sala> alSala = new ArrayList();

    public void ingresarSala(Sala sala) throws SQLException, ClassNotFoundException {
        int filasAfectadas;

        String sql = "insert into sala values(" + sala.getId_sala() + ",'" + sala.getNombre_sala() + "'," + sala.getNumero_butacas() + "," + sala.getId_cine() + ")";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        filasAfectadas = st.executeUpdate(sql);
        System.out.println("filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarSalas() throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        String sql = "select * from sala";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            sala = new Sala(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            alSala.add(sala);
        }
        gbd.cerrarConexionBBDD();
        return alSala;

    }
    
    public Sala buscarSala(int id_aux) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        String sql = "SELECT * FROM sala WHERE id_sala= " + id_aux;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        sala = new Sala(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
        gbd.cerrarConexionBBDD();
        return sala;
    }

}
