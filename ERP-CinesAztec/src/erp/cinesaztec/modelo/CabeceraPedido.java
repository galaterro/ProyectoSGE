package erp.cinesaztec.modelo;

import java.sql.Date;

/**
 * Clase dedicada al modelo de Cabecera de Pedido.
 *
 * @author Cine Aztec Team
 */
public class CabeceraPedido {

    private int id_cabecera_pedido = 0;
    private Date fecha_pedido = null;
    private float iva;
    private float importe_total_sin_iva = 0f;
    private float importe_total_con_iva = 0f;

    public CabeceraPedido(Date fecha_pedido, float importe_total_sin_iva, float iva, float importe_total_con_iva) {
        this.fecha_pedido = fecha_pedido;
        this.importe_total_sin_iva = importe_total_sin_iva;
        this.iva = iva;
        this.importe_total_con_iva = importe_total_con_iva;
    }

    /* Constructor. */
    public CabeceraPedido(int id_cabecera_pedido, Date fecha_pedido, float iva, float importe_total_sin_iva, float importe_total_con_iva) {
        this.id_cabecera_pedido = id_cabecera_pedido;
        this.fecha_pedido = fecha_pedido;
        this.iva = iva;
        this.importe_total_sin_iva = importe_total_sin_iva;
        this.importe_total_con_iva = importe_total_con_iva;
    }

    /* Getters y Setters. */
    public int getId_cabecera_pedido() {
        return id_cabecera_pedido;
    }

    public void setId_cabecera_pedido(int id_cabecera_pedido) {
        this.id_cabecera_pedido = id_cabecera_pedido;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
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

    public float getIVA() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

}
