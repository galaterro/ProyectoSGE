package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Producto;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Galaterro on 25/01/2017.
 */
class ProductoPersistencia {

    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Producto producto;
    private ArrayList<Producto> alProducto = new ArrayList();

    public void ingresarProducto(Producto producto) throws SQLException, ClassNotFoundException {
        int filasAfectadas;

        String sql = "insert into producto values(" + producto.getId_producto() + ",'" + producto.getDesc_producto() + "','" + producto.getPrecio_producto() + "','" + producto.getPrecio_venta()+ "','" + producto.getNombre_producto() + "')";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        filasAfectadas = st.executeUpdate(sql);
        System.out.println("filas afectadas: " + filasAfectadas);
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarProducto() throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();

        String sql = "select * from producto";
        c = gbd.conectarBBDD();
        st = c.createStatement();

        rs = st.executeQuery(sql);
        System.out.println("Los Productos son: ");
        while (rs.next()) {
            producto = new Producto(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3).floatValue(), rs.getBigDecimal(4).floatValue(), rs.getString(5));
            alProducto.add(producto);
        }
        gbd.cerrarConexionBBDD();
        return alProducto;

    }

}
