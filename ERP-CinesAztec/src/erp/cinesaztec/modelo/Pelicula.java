package erp.cinesaztec.modelo;

/**
 * Clase dedicada al modelo de Película.
 * 
 * @author Cine Aztec Team
 */
public class Pelicula {
    
    private int id_pelicula;
    private String nombre_pelicula;
    private int dur_pelicula;
    private int edad_acceso;
    private int id_sala;
    
    /* Esta clase tiene 2 constructores distintos: uno con id_sala y otro sin él
    por ser clave foránea, y así poder manejarlo dependiendo de la necesidad. */
    
    public Pelicula(int id_pelicula, String nombre_pelicula, int dur_pelicula, int edad_acceso) {
        this.id_pelicula = id_pelicula;
        this.nombre_pelicula = nombre_pelicula;
        this.dur_pelicula = dur_pelicula;
        this.edad_acceso = edad_acceso;
    }

    public Pelicula( String nombre_pelicula, int dur_pelicula, int edad_acceso) {
        this.nombre_pelicula = nombre_pelicula;
        this.dur_pelicula = dur_pelicula;
        this.edad_acceso = edad_acceso;
    }
    
    /* Getters y Setters. */
    
    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public int getDur_pelicula() {
        return dur_pelicula;
    }

    public void setDur_pelicula(int dur_pelicula) {
        this.dur_pelicula = dur_pelicula;
    }

    public int getEdad_acceso() {
        return edad_acceso;
    }

    public void setEdad_acceso(int edad_acceso) {
        this.edad_acceso = edad_acceso;
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }
}
