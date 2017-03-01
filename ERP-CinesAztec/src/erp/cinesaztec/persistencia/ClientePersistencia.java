package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Butaca;
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

        String sql = "select * from cliente WHERE lower(dni_cli) = lower('" + dni_aux + "')";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);

        while (rs.next()) {
            cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9));
            
        }
        gbd.cerrarConexionBBDD();
        return cliente;
    }
    
    public void actualizarCliente(Cliente cliente, String cif) throws SQLException, ClassNotFoundException {

        String sql = "update cliente set dni_cli = ?, nombre_cli= ?, apellidos_cli= ?, telefono_cli = ?, cp = ?, puntos = ?, usuario = ?, password = ? where lower(dni_cli)= lower('" + cif + "')";
        c = gbd.conectarBBDD();
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
    
    public void eliminarCliente(String cif) throws ClassNotFoundException, SQLException {
        c = gbd.conectarBBDD();
        String sql = "delete from cliente where lower(dni_Cli) = ('" + cif +"')";
        st = c.createStatement();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }
    
      /* Usado para analizar si existe un cliente con el id facilitado. */
    public boolean existeCliente(String cif) throws SQLException, ClassNotFoundException {
        boolean encontrado = false;
        String sql = "select * from cliente where lower(dni_cli) = lower(?)";
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
