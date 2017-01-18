/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.modelo;

import java.sql.Date;

/**
 *
 * @author allen
 */
public class Sesion {
    
    private int id_sesion;
    private Date hora_sesion; // import DATE SQL
    private int id_pelicula;
    private int id_sala;

    public Sesion(int id_sesion, Date hora_sesion) {
        this.id_sesion = id_sesion;
        this.hora_sesion = hora_sesion;
    }

    public Sesion(int id_sesion, Date hora_sesion, int id_pelicula, int id_sala) {
        this.id_sesion = id_sesion;
        this.hora_sesion = hora_sesion;
        this.id_pelicula = id_pelicula;
        this.id_sala = id_sala;
    }

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
