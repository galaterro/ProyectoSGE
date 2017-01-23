package erp.cinesaztec.Controlador;

import erp.cinesaztec.modelo.Sala;
import erp.cinesaztec.persistencia.SalaPersistencia;

import java.sql.SQLException;

/**
 * Created by juanxxiii on 23/01/2017.
 */
public class Ejecutador {
    public static void main(String[] args) {
        SalaPersistencia sp = new SalaPersistencia();

        try {
            sp.ingresarSala(new Sala(1,"sala porno", 25,1));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
