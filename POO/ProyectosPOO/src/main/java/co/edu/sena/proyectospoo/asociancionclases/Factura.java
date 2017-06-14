package co.edu.sena.proyectospoo.asociancionclases;

import org.omg.CORBA.DATA_CONVERSION;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Enrique on 2/06/2017.
 */
public class Factura {
    private int idFactura;
    private Date fecha;
    private float totalFactura;
    private float iva;

    private Cliente cliente;

    private Collection<Item> items ;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(float totalFactura) {
        this.totalFactura = totalFactura;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Collection<Item> getItems() {
        return items;
    }

    public void setItems(Collection<Item> items) {
        this.items = items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Factura factura = (Factura) o;

        return idFactura == factura.idFactura;
    }

    @Override
    public int hashCode() {
        return idFactura;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", fecha=" + fecha +
                ", totalFactura=" + totalFactura +
                ", iva=" + iva +
                //"cliente"+ this.cliente +
                ", items=" + items +
                '}';
    }
}
