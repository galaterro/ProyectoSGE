package erp.cinesaztec.Controlador;

import erp.cinesaztec.modelo.Entrada;
import erp.cinesaztec.modelo.Proveedor;
import erp.cinesaztec.modelo.Sala;
import erp.cinesaztec.persistencia.EntradaPersistencia;
import erp.cinesaztec.persistencia.ProveedorPersistencia;
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
        ArrayList<Proveedor> alP = new ArrayList();
        Proveedor p;
        ProveedorPersistencia pp = new ProveedorPersistencia();
        try {
            
                
             p = new Proveedor(3, "12344", "Tipo", "Puesto", 5487, "Madrid", 28500);
             pp.ingresarProveedor(p);
             
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
