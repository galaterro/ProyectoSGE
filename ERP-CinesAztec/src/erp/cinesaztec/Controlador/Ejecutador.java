package erp.cinesaztec.Controlador;

import erp.cinesaztec.modelo.Proveedor;
import erp.cinesaztec.persistencia.EntradaPersistencia;
import erp.cinesaztec.persistencia.ProveedorPersistencia;
import erp.cinesaztec.persistencia.SalaPersistencia;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Galaterro on 23/01/2017.
 */
class Ejecutador {
    public static void main(String[] args) {
        SalaPersistencia sp = new SalaPersistencia();
        EntradaPersistencia ep = new EntradaPersistencia();
        ArrayList<Proveedor> alP = new ArrayList();
        Proveedor p;
        ProveedorPersistencia pp = new ProveedorPersistencia();
        try {
            
                
//             p = new Proveedor(3, "12344", "Tipo", "Puesto", 5487, "Madrid", 28500);
//             pp.ingresarProveedor(p);
             
             alP = pp.listarProveedores();
             
             for (Proveedor pro : alP) {
                
                 System.out.println(pro.getId_proveedor()+" "+ pro.getNombre_proveedor()+" "+ pro.getApellidos_proveedor());
            }
             
             
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
