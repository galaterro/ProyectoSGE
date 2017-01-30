package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Pelicula;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by juanxxiii on 25/01/2017.
 */
public class PeliculaPersistencia {
    GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    Pelicula pelicula;
    ArrayList<Pelicula> alPelicula = new ArrayList();

    public void ingresarPelicula(Pelicula pelicula) throws SQLException, ClassNotFoundException {
        int filasAfectadas;

        String sql = "insert into pelicula values(" + pelicula.getId_pelicula() + "," + pelicula.getId_sala() + ",'" + pelicula.getNombre_pelicula() + "'," + pelicula.getDur_pelicula()+ "," + pelicula.getEdad_acceso() + ")";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        filasAfectadas = st.executeUpdate(sql);
        System.out.println("filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarPelicula() throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        String sql = "select * from pelicula";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        System.out.println("Las Peliculas son: ");
        while (rs.next()) {
            pelicula = new Pelicula(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            alPelicula.add(pelicula);
        }
        gbd.cerrarConexionBBDD();
        return alPelicula;

    }

}
