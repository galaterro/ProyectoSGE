package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Cliente;
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
public class ClientePersistencia {
    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Cliente cliente;
    private ArrayList<Cliente> alCliente = new ArrayList();
    
    public void ingresarCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        int filasAfectadas;

        String sql = "insert into cliente values(" + cliente.getId_cliente()+ ", '" + cliente.getDni_cliente()+ "', '" + cliente.getNombre_cliente()+ "', '" + cliente.getApellidos_cliente() + "', " + cliente.getTelefono_cliente() + ", " + cliente.getCodpos_cliente() + ", " + cliente.getPuntos() + ", '" + cliente.getUsuario_cliente() + "', '" + cliente.getContraseña_cliente() + "')";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        filasAfectadas = st.executeUpdate(sql);
        System.out.println("Filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarClientes() throws ClassNotFoundException, SQLException {
        gbd.conectarBBDD();

        String sql = "select * from cliente";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        System.out.println("Los clientes son: ");
        while (rs.next()) {
            cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9));
            alCliente.add(cliente);
        }
        gbd.cerrarConexionBBDD();
        return alCliente;
    }

    public Cliente buscarCliente(String dni_aux) throws ClassNotFoundException, SQLException {
        gbd.conectarBBDD();

        String sql = "select * from cliente WHERE dni_cli = '%" + dni_aux + "%'";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);

        while (rs.next()) {
            cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9));
            
        }
        gbd.cerrarConexionBBDD();
        return cliente;
    }
}
