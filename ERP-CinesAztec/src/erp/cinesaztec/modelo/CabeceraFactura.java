package erp.cinesaztec.modelo;

import java.sql.Date;

/**
 *  Clase dedicada al modelo de Cabecera de Pedido.
 * 
 * @author Cine Aztec Team
 */
public class CabeceraFactura {
    
    private int id_cabecera_factura = 0;
    private Date fecha_factura = null;
    private float importe_total_sin_iva = 0f;
    private float importe_total_con_iva = 0f;
    private final float IVA = 1.21f;
    private int id_cliente = 0;
    
    /* Constructor. */
    public CabeceraFactura(int id_cabecera_factura, Date fecha_factura, float importe_total_sin_iva, float importe_total_con_iva, int id_cliente) {
        this.id_cabecera_factura = id_cabecera_factura;
        this.fecha_factura = fecha_factura;
        this.importe_total_sin_iva = importe_total_sin_iva;
        this.importe_total_con_iva = importe_total_con_iva;
        this.id_cliente = id_cliente;
    }
    
    /* Getters y Setters. */

    public int getId_cabecera_factura() {
        return id_cabecera_factura;
    }

    public void setId_cabecera_factura(int id_cabecera_factura) {
        this.id_cabecera_factura = id_cabecera_factura;
    }

    public Date getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public float getImporte_total_sin_iva() {
        return importe_total_sin_iva;
    }

    public void setImporte_total_sin_iva(float importe_total_sin_iva) {
        this.importe_total_sin_iva = importe_total_sin_iva;
    }

    public float getImporte_total_con_iva() {
        return importe_total_con_iva;
    }

    public void setImporte_total_con_iva(float importe_total_con_iva) {
        this.importe_total_con_iva = importe_total_con_iva;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public float getIVA() {
        return IVA;
    }
}
