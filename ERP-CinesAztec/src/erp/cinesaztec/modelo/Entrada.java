/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.modelo;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 *
 * @author allen
 */
public class Entrada {
    
    private int id_entrada;
    private double precio_entrada;

    public Entrada(int id_entrada, double precio_entrada) {
        this.id_entrada = id_entrada;
        this.precio_entrada = precio_entrada;
    }

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
    
    
    
}
