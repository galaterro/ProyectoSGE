package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Producto;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Galaterro on 25/01/2017.
 */
public class ProductoPersistencia {

    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Producto producto;
    private ArrayList<Producto> alProducto = new ArrayList();

    public void ingresarProducto(Producto producto) throws SQLException, ClassNotFoundException {
        String sql = "insert into producto (descripcion_producto, precio_producto, precio_venta, nombre_producto) values (?,?,?,?)";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps.setString(1, producto.getDesc_producto());
        ps.setFloat(2, producto.getPrecio_producto());
        ps.setFloat(3, producto.getPrecio_venta());
        ps.setString(4, producto.getNombre_producto());
        ps.executeUpdate();
        ps.close();
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarProducto() throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        String sql = "select * from producto";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);       
        while (rs.next()) {
            producto = new Producto(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3).floatValue(), rs.getBigDecimal(4).floatValue(), rs.getString(5));
            alProducto.add(producto);
        }
        gbd.cerrarConexionBBDD();
        return alProducto;

    }
    
    public Producto buscarProducto(int id_producto) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        String sql = "SELECT * FROM producto WHERE id_producto = " + id_producto + "";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        producto = new Producto(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3).floatValue(), rs.getBigDecimal(4).floatValue(), rs.getString(5));
        gbd.cerrarConexionBBDD();
        return producto;
    }
    
    public void eliminarProducto(int id_producto) throws ClassNotFoundException, SQLException{
        c = gbd.conectarBBDD();
        String sql = "delete from producto where id_producto = " + id_producto;
        st = c.createStatement();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }
    
    public void actualizarProducto(Producto producto) throws SQLException, ClassNotFoundException {

        String sql = "update producto set descripcion_producto = ?, precio_producto = ? , precio_venta = ?, nombre_producto = ? where id_producto =?";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);

        ps.setString(1, producto.getDesc_producto());
        ps.setFloat(2, producto.getPrecio_producto());
        ps.setFloat(3, producto.getPrecio_venta());
        ps.setString(4, producto.getNombre_producto());
        ps.setInt(5, producto.getId_producto());

        ps.executeUpdate();
        ps.close();
        gbd.cerrarConexionBBDD();
    }
    
    /* Usado para analizar si existe una Pelicula con el ID facilitado. */
    public boolean existeProducto(int id) throws SQLException, ClassNotFoundException {
        boolean encontrado = false;
        String sql = "select * from producto where id_producto = ?";
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
