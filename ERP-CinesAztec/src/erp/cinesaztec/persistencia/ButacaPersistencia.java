package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Butaca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author juanxxiiiTarde
 */
public class ButacaPersistencia {
    
    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Butaca butaca;
    private ArrayList<Butaca> alButaca = new ArrayList();
    
    public void ingresarButaca(Butaca butaca) throws SQLException, ClassNotFoundException {
        String sql = "insert into butaca (numero_fila, numero_columna, id_sala) values (?,?,?)";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps.setInt(1, butaca.getNumero_fila());
        ps.setInt(2, butaca.getNumero_columna());
        ps.setInt(3, butaca.getId_sala());
        
        ps.executeUpdate();
        ps.close();

        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarButacas() throws ClassNotFoundException, SQLException {
        String sql = "select * from butaca";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            butaca = new Butaca(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
            alButaca.add(butaca);
        }
        gbd.cerrarConexionBBDD();
        
        return alButaca;
    }

    public Butaca buscarButaca(int cif) throws ClassNotFoundException, SQLException {
        String sql = "select * from butaca where id_butaca = " + cif;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            butaca = new Butaca(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));  
        }
        gbd.cerrarConexionBBDD();
        return butaca;
    }
    
     public void actualizarButaca(Butaca butaca, int id) throws SQLException, ClassNotFoundException {

        String sql = "update butaca set numero_fila = ?, numero_columna = ?, id_sala = ? where id_butaca = " + id ;
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);

        ps.setInt(1, butaca.getNumero_fila());
        ps.setInt(2, butaca.getNumero_columna());
        ps.setInt(3, butaca.getId_sala());
        ps.executeUpdate();
        ps.close();
        gbd.cerrarConexionBBDD();
    }
    
    public int consultarIdSala(String nombre) throws ClassNotFoundException, SQLException {

        int id = 0;
        String sql = "SELECT id_sala FROM sala WHERE lower(nombre_sala) = lower('" + nombre + "')";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            id = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return id;
    }
    
    public String buscarNombreSala(int id) throws ClassNotFoundException, SQLException {
        String nombre = null;
        c = gbd.conectarBBDD();
        String sql = "Select nombre_sala from sala where id_sala = " + id;
        st =  c.createStatement();
        rs = st.executeQuery(sql);
        
        while (rs.next()) {
            nombre = rs.getString(1);
        }
        gbd.cerrarConexionBBDD();
        return nombre;
    }
    
     public void eliminarButaca(int id) throws ClassNotFoundException, SQLException {
        c = gbd.conectarBBDD();
        String sql = "delete from butaca where id_butaca = " + id ;
        st = c.createStatement();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }
    
     /* Usado para analizar si existe una butaca con el id facilitado. */
    public boolean existeButaca(int id) throws SQLException, ClassNotFoundException {
        boolean encontrado = false;
        String sql = "select * from butaca where id_butaca = ?";
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
