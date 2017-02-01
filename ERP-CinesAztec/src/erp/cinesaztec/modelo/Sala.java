package erp.cinesaztec.modelo;

/**
 * Clase dedicada al modelo de Sala.
 * 
 * @author Cine Aztec Team
 */
public class Sala {
    
    private int id_sala;
    private String nombre_sala;
    private int numero_butacas;
    private int id_cine;

    /* Constructor. */
    
    public Sala(int id_sala, String nombre_sala, int numero_butacas, int id_cine) {
        this.id_sala = id_sala;
        this.nombre_sala = nombre_sala;
        this.numero_butacas = numero_butacas;
        this.id_cine = id_cine;
    }

    /* Getters y Setters. */
    
    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    public String getNombre_sala() {
        return nombre_sala;
    }

    public void setNombre_sala(String nombre_sala) {
        this.nombre_sala = nombre_sala;
    }

    public int getNumero_butacas() {
        return numero_butacas;
    }

    public void setNumero_butacas(int numero_butacas) {
        this.numero_butacas = numero_butacas;
    }

    public int getId_cine() {
        return id_cine;
    }

    public void setId_cine(int id_cine) {
        this.id_cine = id_cine;
    }
}
