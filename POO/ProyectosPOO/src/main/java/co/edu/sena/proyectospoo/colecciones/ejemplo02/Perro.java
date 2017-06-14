package co.edu.sena.proyectospoo.colecciones.ejemplo02;

import java.util.Objects;

/**
 * Created by Enrique on 31/05/2017.
 */
public class Perro {
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;

    public Perro(String tipoDocumento, String numeroDocumento, String nombre) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.tipoDocumento);
        hash = 71 * hash + Objects.hashCode(this.numeroDocumento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perro other = (Perro) obj;
        if (!Objects.equals(this.tipoDocumento, other.tipoDocumento)) {
            return false;
        }
        if (!Objects.equals(this.numeroDocumento, other.numeroDocumento)) {
            return false;
        }
        return true;
    }

    
}
