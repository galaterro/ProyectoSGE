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

        String sql = "insert into cliente (dni_cli, nombre_cli, apellidos_cli, telefono_cli, cp, puntos, usuario, password) values (?,?,?,?,?,?,?,?)";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps = c.prepareStatement(sql);
        ps.setString(1, cliente.getDni_cliente());
        ps.setString(2, cliente.getNombre_cliente());
        ps.setString(3, cliente.getApellidos_cliente());
        ps.setInt(4, cliente.getTelefono_cliente());
        ps.setInt(5, cliente.getCodpos_cliente());
        ps.setInt(6, cliente.getPuntos());
        ps.setString(7, cliente.getUsuario_cliente());
        ps.setString(8, cliente.getContraseña_cliente());
        ps.executeUpdate();
        ps.close();
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
