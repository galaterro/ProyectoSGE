/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.modelo;

/**
 *
 * @author allen
 */
public class Reserva {
    
    private int id_reserva;
    private int id_pelicula;
    private int id_sesion;
    private int id_butaca;
    private int id_cliente;
    private int id_sala;

    public Reserva(int id_reserva, int id_pelicula, int id_sesion, int id_butaca, int id_cliente, int id_sala) {
        this.id_reserva = id_reserva;
        this.id_pelicula = id_pelicula;
        this.id_sesion = id_sesion;
        this.id_butaca = id_butaca;
        this.id_cliente = id_cliente;
        this.id_sala = id_sala;
    }

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

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }
    
    
}
