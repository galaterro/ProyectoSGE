package erp.cinesaztec.Controlador;

import erp.cinesaztec.modelo.Proveedor;
import erp.cinesaztec.modelo.Sala;
import erp.cinesaztec.persistencia.ProveedorPersistencia;
import erp.cinesaztec.persistencia.SalaPersistencia;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by juanxxiii on 23/01/2017.
 */
public class Ejecutador {
    public static void main(String[] args) {
        SalaPersistencia sp = new SalaPersistencia();
        ProveedorPersistencia pp = new ProveedorPersistencia();
        ArrayList<Proveedor> alPro= new ArrayList();

        try {
            //sp.ingresarSala(new Sala(2,"sala porno", 25,1));
            pp.ingresarProveedor(new Proveedor(2, "cif1", "proveedor", "uno", 1234567897,"Madrid", 28500));
           alPro =  pp.listarProveedores();
            for (Proveedor proveedor : alPro) {
                System.out.println(proveedor.getApellidos_proveedor());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
