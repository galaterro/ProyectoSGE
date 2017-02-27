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

    public Pelicula buscarPelicula(String nombre) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        String sql = "SELECT * FROM pelicula WHERE lower(nombre_pelicula) = lower('" + nombre + "')";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        pelicula = new Pelicula(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
        gbd.cerrarConexionBBDD();
        return pelicula;
    }
    
    /* Usado para analizar si existe una Pelicula con el ID facilitado. */
    public boolean existePelicula(int id) throws SQLException, ClassNotFoundException {
        boolean encontrado = false;
        String sql = "select * from pelicula where id_pelicula = ?";
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
    
    public void eliminarPelicula(int id_pelicula) throws ClassNotFoundException, SQLException{
        c = gbd.conectarBBDD();
        String sql = "delete from pelicula where id_pelicula = " + id_pelicula;
        st = c.createStatement();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }
    
    public void actualizarPelicula(Pelicula pelicula) throws SQLException, ClassNotFoundException {

        String sql = "update pelicula set nombre_pelicula = ?, duracion_pelicula = ? , edad_acceso = ? where id_pelicula =?";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);

        ps.setString(1, pelicula.getNombre_pelicula());
        ps.setInt(2, pelicula.getDur_pelicula());
        ps.setInt(3, pelicula.getEdad_acceso());
        ps.setInt(4, pelicula.getId_pelicula());

        ps.executeUpdate();
        ps.close();

        System.out.println("Actualizado");

        gbd.cerrarConexionBBDD();
    }

}
