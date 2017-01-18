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
public class Butaca {
    
    private int id_butaca;
    private int numero_fila;
    private int id_sala;

    public Butaca(int id_butaca, int numero_fila) {
        this.id_butaca = id_butaca;
        this.numero_fila = numero_fila;
    }

    public Butaca(int id_butaca, int numero_fila, int id_sala) {
        this.id_butaca = id_butaca;
        this.numero_fila = numero_fila;
        this.id_sala = id_sala;
    }

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
