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
        gbd.conectarBBDD();

        int filasAfectadas;

        String sql = "insert into butaca values(" + butaca.getId_butaca() + ", " + butaca.getNumero_fila() + ", " + butaca.getId_sala() + ")";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        filasAfectadas = st.executeUpdate(sql);
        System.out.println("Filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarButacas() throws ClassNotFoundException, SQLException {
        gbd.conectarBBDD();

        String sql = "select * from  butaca";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        System.out.println("Las butacas son: ");
        while (rs.next()) {
            butaca = new Butaca(rs.getInt(1), rs.getInt(2), rs.getInt(3));
            alButaca.add(butaca);
        }
        gbd.cerrarConexionBBDD();
        return alButaca;
    }

    public Butaca buscarButaca(int numero_aux) throws ClassNotFoundException, SQLException {
        gbd.conectarBBDD();

        String sql = "select * from  butaca WHERE numero_fila = '" + numero_aux + "'";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        System.out.println("Las butacas son: ");
        while (rs.next()) {
            butaca = new Butaca(rs.getInt(1), rs.getInt(2), rs.getInt(3));
            
        }
        gbd.cerrarConexionBBDD();
        return butaca;
    }
}
