package erp.cinesaztec.modelo;


/**
 * Clase dedicada al modelo de Cuerpo de Factura.
 * 
 * @author Cine Aztec Team
 */
public class CuerpoFactura {
    
    private int id_cuerpo_factura = 0;
    private int cantidad = 0;
    private int id_cabecera_factura = 0;
    private int id_producto = 0;

    /* Constructor. */
    public CuerpoFactura(int id_cuerpo_factura, int cantidad, int id_cabecera_factura, int id_producto) {
        this.id_cuerpo_factura = id_cuerpo_factura;
        this.cantidad = cantidad;
        this.id_cabecera_factura = id_cabecera_factura;
        this.id_producto = id_producto;
    }
    
    /* Getters y Setters. */
    public int getId_cuerpo_factura() {
        return id_cuerpo_factura;
    }

    public void setId_cuerpo_factura(int id_cuerpo_factura) {
        this.id_cuerpo_factura = id_cuerpo_factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_cabecera_factura() {
        return id_cabecera_factura;
    }

    public void setId_cabecera_factura(int id_cabecera_factura) {
        this.id_cabecera_factura = id_cabecera_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    
}
