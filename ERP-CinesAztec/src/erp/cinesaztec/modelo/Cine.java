package erp.cinesaztec.modelo;

/**
 * Clase dedicada al modelo de Cine.
 * 
 * @author Cine Aztec Team
 */
public class Cine {
    
    private int id_cine;
    private String nombre_cine;
    private String cif_cine;
    private String dir_cine;
    private String pob_cine;
    private int codPos_cine;

    /* Constructor. */
    
    public Cine(int id_cine, String nombre_cine, String cif_cine, String dir_cine, String pob_cine, int codPos_cine) {
        this.id_cine = id_cine;
        this.nombre_cine = nombre_cine;
        this.cif_cine = cif_cine;
        this.dir_cine = dir_cine;
        this.pob_cine = pob_cine;
        this.codPos_cine = codPos_cine;
    }

    public Cine(String nombre_cine, String cif_cine, String dir_cine, String pob_cine, int codPos_cine) {
        this.nombre_cine = nombre_cine;
        this.cif_cine = cif_cine;
        this.dir_cine = dir_cine;
        this.pob_cine = pob_cine;
        this.codPos_cine = codPos_cine;
    }

    
    /* Getters y Setters. */
    
    public int getId_cine() {
        return id_cine;
    }

    public void setId_cine(int id_cine) {
        this.id_cine = id_cine;
    }

    public String getNombre_cine() {
        return nombre_cine;
    }

    public void setNombre_cine(String nombre_cine) {
        this.nombre_cine = nombre_cine;
    }

    public String getCif_cine() {
        return cif_cine;
    }

    public void setCif_cine(String cif_cine) {
        this.cif_cine = cif_cine;
    }

    public String getDir_cine() {
        return dir_cine;
    }

    public void setDir_cine(String dir_cine) {
        this.dir_cine = dir_cine;
    }

    public String getPob_cine() {
        return pob_cine;
    }

    public void setPob_cine(String pob_cine) {
        this.pob_cine = pob_cine;
    }

    public int getCodPos_cine() {
        return codPos_cine;
    }

    public void setCodPos_cine(int codPos_cine) {
        this.codPos_cine = codPos_cine;
    }
}
