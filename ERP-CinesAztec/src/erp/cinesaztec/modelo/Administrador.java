package erp.cinesaztec.modelo;

import java.sql.Date;

/**
 * Clase dedicada al modelo de Administrador. Hereda de Empleado.
 * 
 * @author Cine Aztec Team
 */
public class Administrador extends Empleado {

    private String usuario_admin;
    private String contraseña_admin;
    
    /* Esta clase tiene 2 constructores distintos: uno con id_cine y otro sin él
    por ser clave foránea, y así poder manejarlo dependiendo de la necesidad. */
    
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
    
    /* Getters y Setters. */
    
    public String getUsuario_admin() {
        return usuario_admin;
    }

    public void setUsuario_admin(String usuario_admin) {
        this.usuario_admin = usuario_admin;
    }

    public String getContraseña_admin() {
        return contraseña_admin;
    }

    public void setContraseña_admin(String contraseña_admin) {
        this.contraseña_admin = contraseña_admin;
    }
}
