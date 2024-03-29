package erp.cinesaztec.modelo;

/**
 * Clase dedicada al modelo de Reserva. Todos sus campos, a excepción de id_reserva,
 * son de clases ajenas a ésta (Película, Sesión, Butaca, Cliente y Sala).
 * 
 * @author Cine Aztec Team
 */
public class Reserva {
    
    private int id_reserva;
    private int id_pelicula;
    private int id_sesion;
    private int id_butaca;
    private int id_cliente;
    

    /* Constructor. */
    
    public Reserva(int id_reserva, int id_pelicula, int id_sesion, int id_butaca, int id_cliente) {
        this.id_reserva = id_reserva;
        this.id_pelicula = id_pelicula;
        this.id_sesion = id_sesion;
        this.id_butaca = id_butaca;
        this.id_cliente = id_cliente;
    }

    public Reserva(int id_pelicula, int id_sesion, int id_butaca, int id_cliente) {
        this.id_pelicula = id_pelicula;
        this.id_sesion = id_sesion;
        this.id_butaca = id_butaca;
        this.id_cliente = id_cliente;
    }
    
    

    /* Getters y Setters. */
    
    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public int getId_sesion() {
        return id_sesion;
    }

    public void setId_sesion(int id_sesion) {
        this.id_sesion = id_sesion;
    }

    public int getId_butaca() {
        return id_butaca;
    }

    public void setId_butaca(int id_butaca) {
        this.id_butaca = id_butaca;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

}
