package co.edu.sena.proyectospoo.asociancionclases;

import java.util.Collection;
import java.util.List;

/**
 * Created by Enrique on 2/06/2017.
 */
public class Cliente {
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String direccion;
    private String telefono;
    private Collection<Factura> facturas;

    public Collection<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(Collection<Factura> facturas) {
        this.facturas = facturas;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        if (tipoDocumento != null ? !tipoDocumento.equals(cliente.tipoDocumento) : cliente.tipoDocumento != null)
            return false;
        return numeroDocumento != null ? numeroDocumento.equals(cliente.numeroDocumento) : cliente.numeroDocumento == null;
    }

    @Override
    public int hashCode() {
        int result = tipoDocumento != null ? tipoDocumento.hashCode() : 0;
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", facturas=" + facturas +
                '}';
    }
}

