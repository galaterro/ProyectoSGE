package erp.cinesaztec.modelo;

import java.sql.Date;



/**
 * Clase dedicada al modelo de Sesión.
 * 
 * @author Cine Aztec Team
 */
public class Sesion {
    
    private int id_sesion;
    private Date hora_sesion; /* Para recoger el tipo Date de SQL. */
    private int id_pelicula;
    private int id_sala;

    /* Esta clase tiene 2 constructores distintos: uno con id_pelicula e id_sala,
    y otro sin ellos por ser claves foráneas, y así poder manejarlo dependiendo 
    de la necesidad. */
    
    public Sesion(int id_sesion, Date hora_sesion) {
        this.id_sesion = id_sesion;
        this.hora_sesion = hora_sesion;
    }

    public Sesion(Date hora_sesion, int id_pelicula, int id_sala) {

        this.hora_sesion = hora_sesion;
        this.id_pelicula = id_pelicula;
        this.id_sala = id_sala;
    }
    
    /* Getters y Setters. */
    
    public int getId_sesion() {
        return id_sesion;
    }

    public void setId_sesion(int id_sesion) {
        this.id_sesion = id_sesion;
    }

    public Date getHora_sesion() {
        return hora_sesion;
    }

    public void setHora_sesion(Date hora_sesion) {
        this.hora_sesion = hora_sesion;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }
}
