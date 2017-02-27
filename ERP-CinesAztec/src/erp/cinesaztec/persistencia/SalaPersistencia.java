package erp.cinesaztec.persistencia;

import erp.cinesaztec.modelo.Sala;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Galaterro on 23/01/2017.
 */
public class SalaPersistencia {

    private GestorBBDD gbd = new GestorBBDD();
    private Statement st = null;//sentencia a ejecutar
    private ResultSet rs = null;//resultado
    private PreparedStatement ps = null;
    private Connection c;
    private Sala sala;
    private ArrayList<Sala> alSala = new ArrayList();

    public void ingresarSala(Sala sala) throws SQLException, ClassNotFoundException {

        String sql = "insert into sala (nombre_sala, numero_butacas, id_cine) VALUES (?,?,?)";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);
        ps.setString(1, sala.getNombre_sala());
        ps.setInt(2, sala.getNumero_butacas());
        ps.setInt(3, sala.getId_cine());
        ps.executeUpdate();
        ps.close();
        gbd.cerrarConexionBBDD();
    }

    public ArrayList listarSalas() throws SQLException, ClassNotFoundException {
        String sql = "select * from sala";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            sala = new Sala(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            alSala.add(sala);
        }
        gbd.cerrarConexionBBDD();
        return alSala;

    }

    public int consultarIdCine(String nombre) throws ClassNotFoundException, SQLException {

        int id = 0;
        String sql = "SELECT id_cine FROM cine WHERE lower(nombre_cine) = lower('"+nombre+"')";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            id = rs.getInt(1);
        }
        gbd.cerrarConexionBBDD();
        return id;
    }

    public String buscarNombreCine(int id) throws ClassNotFoundException, SQLException {
        String nombre = null;
        c = gbd.conectarBBDD();
        String sql = "Select nombre_cine from cine where id_cine = ?";
        ps = (PreparedStatement) c.prepareStatement(sql);
        ps.setInt(1, id);
        while (rs.next()) {
            nombre = rs.getString(1);
        }
        gbd.cerrarConexionBBDD();
        return nombre;
    }

    public void actualizarSala(Sala sala, int id) throws SQLException, ClassNotFoundException {

        String sql = "update sala set nombre_sala = ?, numero_butacas = ? where id_sala =?";
        c = gbd.conectarBBDD();
        ps = c.prepareStatement(sql);

        ps.setString(1, sala.getNombre_sala());
        ps.setInt(2, sala.getNumero_butacas());
        ps.setInt(3, id);

        ps.executeUpdate();
        ps.close();

        System.out.println("Actualizado");

        gbd.cerrarConexionBBDD();
    }

    public Sala buscarSala(String nombre) throws SQLException, ClassNotFoundException {
        gbd.conectarBBDD();
        String sql = "SELECT * FROM sala WHERE lower(nombre_sala) = lower('" + nombre +"')";
        c = gbd.conectarBBDD();
        st = c.createStatement();
        rs = st.executeQuery(sql);
        rs.next();
        sala = new Sala(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
        gbd.cerrarConexionBBDD();
        return sala;
    }

    /* Usado para analizar si existe una Sala con el ID facilitado. */
    public boolean existeSala(int id) throws SQLException, ClassNotFoundException {
        boolean encontrado = false;
        String sql = "select * from sala where id_sala = ?";
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
    
    public void eliminarSala(int id_sala) throws ClassNotFoundException, SQLException{
        c = gbd.conectarBBDD();
        String sql = "delete from sala where id_sala = " + id_sala;
        st = c.createStatement();
        st.executeUpdate(sql);
        gbd.cerrarConexionBBDD();
    }

    public int cargarSalaPorId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
