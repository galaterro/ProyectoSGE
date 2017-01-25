package erp.cinesaztec.Controlador;

import erp.cinesaztec.modelo.Sala;
import erp.cinesaztec.persistencia.SalaPersistencia;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by juanxxiii on 23/01/2017.
 */
public class Ejecutador {
    public static void main(String[] args) {
        SalaPersistencia sp = new SalaPersistencia();
                System.out.println("funciona");

        try {
            sp.ingresarSala(new Sala(2,"sala porno", 25,1));
            System.out.println("guarda");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
