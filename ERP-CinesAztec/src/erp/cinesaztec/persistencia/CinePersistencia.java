package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Cine;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase dedicada a las operaciones en BD relacionadas con Cine.
 *
 * @author Cine Aztec Team
 */
public class CinePersistencia {

    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private Connection c;
    private Cine cine;
    private ArrayList<Cine> alCine = new ArrayList();
    

    /* Usado para añadir un nuevo Cine. */
    public void ingresarCine(Cine cine) throws SQLException, ClassNotFoundException {

        String sql = "insert into cine (nombre_cine, cif_cine, direccion_cine, poblacion_cine, cp_cine) values (?,?,?,?,?)";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps.setString(1, cine.getNombre_cine());
        ps.setString(2, cine.getCif_cine());
        ps.setString(3, cine.getDir_cine());
        ps.setString(4, cine.getPob_cine());
        ps.setInt(5, cine.getCodPos_cine());

        ps.executeUpdate();
        ps.close();

        gbd.cerrarConexionBBDD();
    }

    /* Usado para devolver un listado de los Cines existentes. */
    public ArrayList listarCines() throws ClassNotFoundException, SQLException {
        String sql = "select * from cine";
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

    /* Usado para buscar un Cine específico por su CIF. */
    public Cine buscarCine(String cif) throws ClassNotFoundException, SQLException {

        String sql = "select * from cine where lower(cif_cine) = lower('" + cif+"')";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        while (rs.next()) {
            cine = new Cine(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));

        }
        gbd.cerrarConexionBBDD();
        return cine;
    }

    /* Usado para modificar los datos de un Cine existente. */
    public void actualizarCine(Cine cine, String cif) throws SQLException, ClassNotFoundException {

        String sql = "update cine set nombre_cine = ?, cif_cine = ?, direccion_cine = ?, poblacion_cine = ?, cp_cine = ? where lower(cif_cine) = ?";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);

        ps.setString(1, cine.getNombre_cine());
        ps.setString(2, cine.getCif_cine());
        ps.setString(3, cine.getDir_cine());
        ps.setString(4, cine.getPob_cine());
        ps.setInt(5, cine.getCodPos_cine());
        ps.setString(6, cif);

        ps.executeUpdate();
        ps.close();
        gbd.cerrarConexionBBDD();
    }

    /* Usado para eliminar un Cine. */
    public void eliminarCine(String cif) throws ClassNotFoundException, SQLException {
        c = gbd.conectarBBDD();
        String sql = "delete from cine where cif_cine = '" + cif + "'";
        st = c.createStatement();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }

    /* Usado para analizar si existe un Cine con el CIF facilitado. */
    public boolean existeCine(String cif) throws SQLException, ClassNotFoundException {
        boolean encontrado = false;
        String sql = "select * from cine where cif_cine = ?";
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
