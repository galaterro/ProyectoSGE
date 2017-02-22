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
        
        String sql = "insert into sala values(nombre_sala, numero_butacas) VALUES (?,?,?)";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps.setString(1, sala.getNombre_sala());
        ps.setInt(2, sala.getNumero_butacas());
        
        st = c.createStatement();

        ps.executeUpdate();
        ps.close();

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
    
    /* Usado para analizar si existe una Sala con el ID facilitado. */
    public boolean existeSala(int id) throws SQLException, ClassNotFoundException {
        boolean encontrado = false;
        String sql = "select * from sala where id_sala = ?";
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

}
