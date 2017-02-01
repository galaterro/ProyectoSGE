package erp.cinesaztec.modelo;

/**
 * Clase dedicada al modelo de Entrada.
 * 
 * @author Cine Aztec Team
 */
public class Entrada {
    
    private int id_entrada;
    private double precio_entrada;
    private int id_pelicula;
    
    /* Constructor. */
    
    public Entrada(int id_entrada, double precio_entrada, int id_pelicula) {
        this.id_entrada = id_entrada;
        this.precio_entrada = precio_entrada;
        this.id_pelicula = id_pelicula;
    }
    
    /* Getters y Setters. */
    
    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public double getPrecio_entrada() {
        return precio_entrada;
    }

    public void setPrecio_entrada(double precio_entrada) {
        this.precio_entrada = precio_entrada;
    }
    
    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }
}
