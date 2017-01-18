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
public class Producto {
    
    private int id_producto;
    private String desc_producto;
    private float precio_producto;
    private float precio_venta;
    private String nombre_producto;

    public Producto(int id_producto, String desc_producto, float precio_producto, float precio_venta, String nombre_producto) {
        this.id_producto = id_producto;
        this.desc_producto = desc_producto;
        this.precio_producto = precio_producto;
        this.precio_venta = precio_venta;
        this.nombre_producto = nombre_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getDesc_producto() {
        return desc_producto;
    }

    public void setDesc_producto(String desc_producto) {
        this.desc_producto = desc_producto;
    }

    public float getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(float precio_producto) {
        this.precio_producto = precio_producto;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    
    
}
