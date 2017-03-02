package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.CabeceraPedido;
import erp.cinesaztec.modelo.CuerpoPedido;
import erp.cinesaztec.modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase dedicada a la persistencia de Cuerpo Pedido en BD.
 *
 * @author Cine Aztec Team
 */
public class PedidoPersistencia {

    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private Connection c;
    private CuerpoPedido cuerpoPedido;
    private CabeceraPedido cabeceraPedido;
    private ArrayList<CuerpoPedido> alCuerpoPedido = new ArrayList();
    private ArrayList<CabeceraPedido> alCabeceraPedido = new ArrayList();

    public void ingresarCabeceraPedido(CabeceraPedido cabeceraPedido) throws SQLException, ClassNotFoundException {

        String sql = "insert into cabecera_pedido (fecha_pedido, importe_total_sin_iva, iva, importe_total_con_iva ) values (?,?,?,?)";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps.setDate(1, cabeceraPedido.getFecha_pedido());
        ps.setFloat(2, cabeceraPedido.getImporte_total_sin_iva());
        ps.setFloat(3, cabeceraPedido.getIVA());
        ps.setFloat(4, cabeceraPedido.getImporte_total_con_iva());

        ps.executeUpdate();
        ps.close();

        gbd.cerrarConexionBBDD();
    }

    public void ingresarCuerpoPedido(CuerpoPedido cuerpoPedido) throws SQLException, ClassNotFoundException {
        String sql = "insert into cuerpo_pedido (descrip_producto, cantidad, id_producto, id_cabecera_pedido) values (?,?,?,?)";

        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps.setString(1, cuerpoPedido.getDescrip_producto());
        ps.setInt(2, cuerpoPedido.getCantidad());
        ps.setInt(3, cuerpoPedido.getId_producto());
        ps.setInt(4, cuerpoPedido.getId_cabecera_pedido());

        ps.executeUpdate();
        ps.close();

        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarCabeceraPedidos() throws ClassNotFoundException, SQLException {
        String sql = "select * from cabecera_pedido";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            cabeceraPedido = new CabeceraPedido(rs.getInt(1), rs.getDate(2), rs.getFloat(3), rs.getFloat(4), rs.getFloat(5));
            alCabeceraPedido.add(cabeceraPedido);
        }
        gbd.cerrarConexionBBDD();
        return alCabeceraPedido;
    }

    public ArrayList listarCuerpoPedidos() throws ClassNotFoundException, SQLException {
        String sql = "select * from cuerpo_pedido";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            cuerpoPedido = new CuerpoPedido(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            alCuerpoPedido.add(cuerpoPedido);
        }
        gbd.cerrarConexionBBDD();
        return alCuerpoPedido;
    }

    public CabeceraPedido buscarCabeceraPedido(int id) throws ClassNotFoundException, SQLException {

        String sql = "select * from cabecera_pedido where id_cab_pedido= " + id;
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        while (rs.next()) {
            cabeceraPedido = new CabeceraPedido(rs.getInt(1), rs.getDate(2), rs.getFloat(3), rs.getFloat(4), rs.getFloat(5));
        }
        gbd.cerrarConexionBBDD();
        return cabeceraPedido;
    }

    public int buscarUltimoId() throws ClassNotFoundException, SQLException{
       int id_cab_pedido; 
       String  sql = "SELECT MAX(id_cab_pedido) FROM cabecera_pedido";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        id_cab_pedido = rs.getInt(1);
        
        return id_cab_pedido++;    
    }
    
    public CuerpoPedido buscarCuerpoPedido(int id) throws ClassNotFoundException, SQLException {

        String sql = "select * from cuerpo_pedido where id_cabecera_pedido= " + id;
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        while (rs.next()) {
            cuerpoPedido = new CuerpoPedido(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
        }
        gbd.cerrarConexionBBDD();
        return cuerpoPedido;
    }

    public void eliminarCabeceraPedido(int id) throws ClassNotFoundException, SQLException {
        c = gbd.conectarBBDD();
        String sql = "delete from cabecera_pedido where id_cab_pedido = " + id;
        st = c.createStatement();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }

    public void eliminarCuerpoPedido(int id) throws ClassNotFoundException, SQLException {
        c = gbd.conectarBBDD();
        String sql = "delete from cuerpo_pedido where id_cuerpo_pedido = " + id;
        st = c.createStatement();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }

    public void actualizarCabeceraPedido(CabeceraPedido cabeceraPedido, int id) throws SQLException, ClassNotFoundException {

        String sql = "update cabecera_pedido set fecha_pedido = ?, importe_total_sin_iva= ?, iva = ?, importe_total_con_iva= ? where id_cab_pedido = " + id;
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);

        ps.setDate(1, cabeceraPedido.getFecha_pedido());
        ps.setFloat(2, cabeceraPedido.getImporte_total_sin_iva());
        ps.setFloat(3, cabeceraPedido.getIVA());
        ps.setFloat(4, cabeceraPedido.getImporte_total_con_iva());

        ps.executeUpdate();
        ps.close();
        gbd.cerrarConexionBBDD();
    }

    public void actualizarCuerpoPedido(CuerpoPedido cuerpoPedido, int id) throws SQLException, ClassNotFoundException {

        String sql = "update cuerpo_pedido set descrip_producto = ?, cantidad= ?, id_producto= ?, id_cabecera_pedido= ? where id_cuerpo_pedido = " + id;
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);

        ps.setString(1, cuerpoPedido.getDescrip_producto());
        ps.setInt(2, cuerpoPedido.getCantidad());
        ps.setInt(3, cuerpoPedido.getId_producto());
        ps.setInt(4, cuerpoPedido.getId_cabecera_pedido());

        ps.executeUpdate();
        ps.close();
        gbd.cerrarConexionBBDD();
    }
    
    public Producto buscarProductoPorId(int id_producto) throws SQLException, ClassNotFoundException {
        Producto producto = null;
        gbd.conectarBBDD();
        String sql = "SELECT * FROM producto WHERE id_producto = "+ id_producto;
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        producto = new Producto(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3).floatValue(), rs.getBigDecimal(4).floatValue(), rs.getString(5));
        gbd.cerrarConexionBBDD();
        return producto;
    }
    
    public int buscarProductoPorNombre(String nombre) throws SQLException, ClassNotFoundException {
        int id;
        gbd.conectarBBDD();
        String sql = "SELECT id_producto FROM producto WHERE lower(nombre_producto) = lower('" + nombre + "')";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        id =rs.getInt(1);
        gbd.cerrarConexionBBDD();
        return id;
    }
    
//     public void actualizarEmpleado(CabeceraPedido cabeceraPedido, int id) throws SQLException, ClassNotFoundException {
//
//        String sql = "update cabecera_pedido set dni_emp = ?, nombre_emp = ?, apellidos_emp = ?, telefono_emp = ?, fecha_inicio_emp = ? , cargo_emp = ?, usuario_empleado = ?, contrasena_empleado = ?, id_cineEmp = ? where dni_emp = '" + dni + "'";
//        c = gbd.conectarBBDD();
//        ps = c.prepareStatement(sql);
//
//        ps.setString(1, empleado.getDni_empleado());
//        ps.setString(2, empleado.getNombre_empleado());
//        ps.setString(3, empleado.getApellidos_empleado());
//        ps.setInt(4, empleado.getTelefono_empleado());
//        ps.setDate(5, empleado.getFecha_inicio());
//        ps.setString(6, empleado.getCargo_empleado());
//        ps.setString(7, empleado.getUsuario_empleado());
//        ps.setString(8, empleado.getPassword_empleado());
//        ps.setInt(9, empleado.getId_cine());        
//
//        ps.executeUpdate();
//        ps.close();
//        gbd.cerrarConexionBBDD();
//    }
    
}
