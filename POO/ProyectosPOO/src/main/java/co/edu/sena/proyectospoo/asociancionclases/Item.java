package co.edu.sena.proyectospoo.asociancionclases;

/**
 * Created by Enrique on 2/06/2017.
 */
public class Item {
    private int cantidad;
    private float precioVenta;
    private float valorTotal;
    private Factura factura;
    private Producto productos;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProductos() {
        return productos;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return productos != null ? productos.equals(item.productos) : item.productos == null;
    }

    @Override
    public int hashCode() {
        return productos != null ? productos.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Item{" +
                "cantidad=" + cantidad +
                ", precioVenta=" + precioVenta +
                ", valorTotal=" + valorTotal +

                ", productos=" + productos +
                '}';
    }
}
