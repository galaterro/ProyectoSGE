package erp.cinesaztec.modelo;

import java.sql.Date;

/**
 * Clase dedicada al modelo de Administrador. Hereda de Empleado.
 * 
 * @author Cine Aztec Team
 */
public class Administrador extends Empleado {

    
    /* Esta clase tiene 2 constructores distintos: uno con id_cine y otro sin él
    por ser clave foránea, y así poder manejarlo dependiendo de la necesidad. */
    
    public Administrador(int id_empleado, String dni_empleado, String nombre_empleado, String apellidos_empleado, int telefono_empleado, Date fecha_inicio, String cargo_empleado, int id_cine, String usuario_empleado, String password_empleado) {
        super(id_empleado, dni_empleado, nombre_empleado, apellidos_empleado, telefono_empleado, fecha_inicio, cargo_empleado, id_cine, usuario_empleado, password_empleado);
    }

    public Administrador(int id_empleado, String dni_empleado, String nombre_empleado, String apellidos_empleado, int telefono_empleado, Date fecha_inicio, String cargo_empleado, String usuario_empleado, String password_empleado) {
        super(id_empleado, dni_empleado, nombre_empleado, apellidos_empleado, telefono_empleado, fecha_inicio, cargo_empleado, usuario_empleado, password_empleado);
    }
    
    /* Getters y Setters. */
    

}
