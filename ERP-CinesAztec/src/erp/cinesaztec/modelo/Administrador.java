/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.modelo;

import java.sql.Date;

/**
 *
 * @author allen
 */
public class Administrador extends Empleado {

    private String usuario_admin;
    private String contraseña_admin;

    public Administrador(String usuario_admin, String contraseña_admin, int id_empleado, String dni_empleado, String nombre_empleado, String apellidos_empleado, int telefono_empleado, Date fecha_inicio, String cargo_empleado, int id_cine) {
        super(id_empleado, dni_empleado, nombre_empleado, apellidos_empleado, telefono_empleado, fecha_inicio, cargo_empleado, id_cine);
        this.usuario_admin = usuario_admin;
        this.contraseña_admin = contraseña_admin;
    }

    

    public Administrador(String usuario_admin, String contraseña_admin, int id_empleado, String dni_empleado, String nombre_empleado, String apellidos_empleado, int telefono_empleado, Date fecha_inicio, String cargo_empleado) {
        super(id_empleado, dni_empleado, nombre_empleado, apellidos_empleado, telefono_empleado, fecha_inicio, cargo_empleado);
        this.usuario_admin = usuario_admin;
        this.contraseña_admin = contraseña_admin;
    }
    
    

    
}
