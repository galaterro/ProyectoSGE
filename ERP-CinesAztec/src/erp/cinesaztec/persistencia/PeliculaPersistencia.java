package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Pelicula;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Galaterro on 25/01/2017.
 */
public class PeliculaPersistencia {

    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Pelicula pelicula;
    private ArrayList<Pelicula> alPelicula = new ArrayList();

    public void ingresarPelicula(Pelicula pelicula) throws SQLException, ClassNotFoundException {

        String sql = "insert into pelicula (id_sala, nombre_pelicula, duracion_pelicula, edad_acceso) values (?,?,?,?)";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps.setInt(1, 1);
        ps.setString(2, pelicula.getNombre_pelicula());
        ps.setInt(3, pelicula.getDur_pelicula());
        ps.setInt(4, pelicula.getEdad_acceso());
        ps.executeUpdate();
        ps.close();

        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarPelicula() throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        String sql = "select * from pelicula";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            pelicula = new Pelicula(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            alPelicula.add(pelicula);
        }
        gbd.cerrarConexionBBDD();
        return alPelicula;

    }

    public Pelicula buscarPelicula(int id) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        String sql = "SELECT * FROM pelicula WHERE id_pelicula= " + id + "";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        pelicula = new Pelicula(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
        gbd.cerrarConexionBBDD();
        return pelicula;
    }

}
