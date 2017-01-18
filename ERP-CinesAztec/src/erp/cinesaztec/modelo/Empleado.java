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
public class Empleado {
    
    private int id_empleado;
    private String dni_empleado;
    private String nombre_empleado;
    private String apellidos_empleado;
    private int telefono_empleado;
    private Date fecha_inicio;  //se importa Date SQL
    private String cargo_empleado;
    private int id_cine; //clave foranea

    public Empleado(int id_empleado, String dni_empleado, String nombre_empleado, String apellidos_empleado, int telefono_empleado, Date fecha_inicio, String cargo_empleado, int id_cine) {
        this.id_empleado = id_empleado;
        this.dni_empleado = dni_empleado;
        this.nombre_empleado = nombre_empleado;
        this.apellidos_empleado = apellidos_empleado;
        this.telefono_empleado = telefono_empleado;
        this.fecha_inicio = fecha_inicio;
        this.cargo_empleado = cargo_empleado;
        this.id_cine = id_cine;
    }

    

    public Empleado(int id_empleado, String dni_empleado, String nombre_empleado, String apellidos_empleado, int telefono_empleado, Date fecha_inicio, String cargo_empleado) {
        this.id_empleado = id_empleado;
        this.dni_empleado = dni_empleado;
        this.nombre_empleado = nombre_empleado;
        this.apellidos_empleado = apellidos_empleado;
        this.telefono_empleado = telefono_empleado;
        this.fecha_inicio = fecha_inicio;
        this.cargo_empleado = cargo_empleado;
    }

    
    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getDni_empleado() {
        return dni_empleado;
    }

    public void setDni_empleado(String dni_empleado) {
        this.dni_empleado = dni_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellidos_empleado() {
        return apellidos_empleado;
    }

    public void setApellidos_empleado(String apellidos_empleado) {
        this.apellidos_empleado = apellidos_empleado;
    }

    public int getTelefono_empleado() {
        return telefono_empleado;
    }

    public void setTelefono_empleado(int telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getCargo_empleado() {
        return cargo_empleado;
    }

    public void setCargo_empleado(String cargo_empleado) {
        this.cargo_empleado = cargo_empleado;
    }

    public int getId_cine() {
        return id_cine;
    }

    public void setId_cine(int id_cine) {
        this.id_cine = id_cine;
    }
    
    
    
    
}
