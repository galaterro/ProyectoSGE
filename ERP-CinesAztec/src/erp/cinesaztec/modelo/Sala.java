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
public class Sala {
    
    private int id_sala;
    private String nombre_sala;
    private int numero_butacas;

    public Sala(int id_sala, String nombre_sala, int numero_butacas) {
        this.id_sala = id_sala;
        this.nombre_sala = nombre_sala;
        this.numero_butacas = numero_butacas;
    }

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
    
    
}
