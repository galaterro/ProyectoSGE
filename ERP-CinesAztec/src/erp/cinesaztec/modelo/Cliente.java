/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.modelo;

/**
 *
 * @author allen
 */
public class Cliente {
    private int id_cliente;
    private String dni_cliente;
    private String nombre_cliente;
    private String apellidos_cliente;
    private int telefono_cliente;
    private int codpos_cliente;
    private int puntos;
    private String usuario_cliente;
    private String contraseña_cliente;

    public Cliente(int id_cliente, String dni_cliente, String nombre_cliente, String apellidos_cliente, int telefono_cliente, int codpos_cliente, int puntos, String usuario_cliente, String contraseña_cliente) {
        this.id_cliente = id_cliente;
        this.dni_cliente = dni_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellidos_cliente = apellidos_cliente;
        this.telefono_cliente = telefono_cliente;
        this.codpos_cliente = codpos_cliente;
        this.puntos = puntos;
        this.usuario_cliente = usuario_cliente;
        this.contraseña_cliente = contraseña_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellidos_cliente() {
        return apellidos_cliente;
    }

    public void setApellidos_cliente(String apellidos_cliente) {
        this.apellidos_cliente = apellidos_cliente;
    }

    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public int getCodpos_cliente() {
        return codpos_cliente;
    }

    public void setCodpos_cliente(int codpos_cliente) {
        this.codpos_cliente = codpos_cliente;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getUsuario_cliente() {
        return usuario_cliente;
    }

    public void setUsuario_cliente(String usuario_cliente) {
        this.usuario_cliente = usuario_cliente;
    }

    public String getContraseña_cliente() {
        return contraseña_cliente;
    }

    public void setContraseña_cliente(String contraseña_cliente) {
        this.contraseña_cliente = contraseña_cliente;
    }
   
    
    
}
