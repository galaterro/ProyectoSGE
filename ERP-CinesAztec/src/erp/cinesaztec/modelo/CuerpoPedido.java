package erp.cinesaztec.modelo;

/**
 * Clase dedicada al modelo de Cuerpo de Pedido.
 * 
 * @author Cine Aztec Team
 */
public class CuerpoPedido {
    
    private int id_cuerpo_pedido = 0;
    private int id_producto = 0;
    private String descrip_producto = null;
    private int id_cabecera_pedido =0;
    private int cantidad = 0;
    
    /* Constructor. */
    public CuerpoPedido(int id_cuerpo_pedido, String descrip_producto, int cantidad, int id_producto, int id_cabecera_pedido) {
        this.id_cuerpo_pedido = id_cuerpo_pedido;
        this.descrip_producto = descrip_producto;
        this.cantidad = cantidad;
        this.id_producto = id_producto;
        this.id_cabecera_pedido = id_cabecera_pedido;
    }

    public CuerpoPedido( String descrip_producto, int cantidad, int id_producto, int id_cabecera_pedido) {
        this.descrip_producto = descrip_producto;
        this.cantidad = cantidad;
        this.id_producto = id_producto;
        this.id_cabecera_pedido = id_cabecera_pedido;
    }
    
    
    
    /* Getters y setters. */
    public int getId_cuerpo_pedido() {
        return id_cuerpo_pedido;
    }

    public void setId_cuerpo_pedido(int id_cuerpo_pedido) {
        this.id_cuerpo_pedido = id_cuerpo_pedido;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getDescrip_producto() {
        return descrip_producto;
    }

    public void setDescrip_producto(String descrip_producto) {
        this.descrip_producto = descrip_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_cabecera_pedido() {
        return id_cabecera_pedido;
    }

    public void setId_cabecera_pedido(int id_cabecera_pedido) {
        this.id_cabecera_pedido = id_cabecera_pedido;
    }
    
    
}
