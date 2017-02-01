package erp.cinesaztec.modelo;

/**
 * Clase dedicada al modelo de Butaca.
 * 
 * @author Cine Aztec Team
 */
public class Butaca {
    
    private int id_butaca;
    private int numero_fila;
    private int id_sala;
    
    /* Esta clase tiene 2 constructores distintos: uno con id_sala y otro sin él
    por ser clave foránea, y así poder manejarlo dependiendo de la necesidad. */
    
    public Butaca(int id_butaca, int numero_fila) {
        this.id_butaca = id_butaca;
        this.numero_fila = numero_fila;
    }

    public Butaca(int id_butaca, int numero_fila, int id_sala) {
        this.id_butaca = id_butaca;
        this.numero_fila = numero_fila;
        this.id_sala = id_sala;
    }
    
    /* Getters y Setters. */
    
    public int getId_butaca() {
        return id_butaca;
    }

    public void setId_butaca(int id_butaca) {
        this.id_butaca = id_butaca;
    }

    public int getNumero_fila() {
        return numero_fila;
    }

    public void setNumero_fila(int numero_fila) {
        this.numero_fila = numero_fila;
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }
}
