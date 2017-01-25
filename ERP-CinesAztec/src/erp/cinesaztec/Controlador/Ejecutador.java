package erp.cinesaztec.Controlador;

import erp.cinesaztec.modelo.Entrada;
import erp.cinesaztec.modelo.Sala;
import erp.cinesaztec.persistencia.EntradaPersistencia;
import erp.cinesaztec.persistencia.SalaPersistencia;
import java.math.BigDecimal;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by juanxxiii on 23/01/2017.
 */
public class Ejecutador {
    public static void main(String[] args) {
        SalaPersistencia sp = new SalaPersistencia();
        EntradaPersistencia ep = new EntradaPersistencia();
        ArrayList<Entrada> alE = new ArrayList();
        Entrada entra ;
        
        try {
            //sp.ingresarSala(new Sala(1,"sala porno", 25,1));
            ep.ingresarEntrada(new Entrada(7,  9.50));
           
             alE = ep.listarEntradas();
             
             for (Entrada e : alE) {
                 System.out.println(e.getId_entrada()+" " + e.getPrecio_entrada());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
