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
public class Proveedor {
    
    private int id_proveedor;
    private String cif_proveedor;
    private String nombre_proveedor;
    private String apellidos_proveedor;
    private int telefono_proveedor;
    private String pob_proveedor;
    private int codPos_proveedor;

    public Proveedor(int id_proveedor, String cif_proveedor, String nombre_proveedor, String apellidos_proveedor, int telefono_proveedor, String pob_proveedor, int codPos_proveedor) {
        this.id_proveedor = id_proveedor;
        this.cif_proveedor = cif_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.apellidos_proveedor = apellidos_proveedor;
        this.telefono_proveedor = telefono_proveedor;
        this.pob_proveedor = pob_proveedor;
        this.codPos_proveedor = codPos_proveedor;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getCif_proveedor() {
        return cif_proveedor;
    }

    public void setCif_proveedor(String cif_proveedor) {
        this.cif_proveedor = cif_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getApellidos_proveedor() {
        return apellidos_proveedor;
    }

    public void setApellidos_proveedor(String apellidos_proveedor) {
        this.apellidos_proveedor = apellidos_proveedor;
    }

    public int getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setTelefono_proveedor(int telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }

    public String getPob_proveedor() {
        return pob_proveedor;
    }

    public void setPob_proveedor(String pob_proveedor) {
        this.pob_proveedor = pob_proveedor;
    }

    public int getCodPos_proveedor() {
        return codPos_proveedor;
    }

    public void setCodPos_proveedor(int codPos_proveedor) {
        this.codPos_proveedor = codPos_proveedor;
    }
    
    
}
