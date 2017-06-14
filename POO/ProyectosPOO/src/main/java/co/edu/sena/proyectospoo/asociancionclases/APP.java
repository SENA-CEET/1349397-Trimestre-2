package co.edu.sena.proyectospoo.asociancionclases;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/**
 * Created by Enrique on 2/06/2017.
 */
public class APP {

    public static void main(String[] args) {
        Producto p1= new Producto();
        p1.setIdProducto("0001");
        Producto p2= new Producto();
        p2.setIdProducto("0002");
        Producto p3= new Producto();
        p3.setIdProducto("0003");
        Producto p4= new Producto();
        p4.setIdProducto("0004");
        Producto p5= new Producto();
        p5.setIdProducto("0005");

        Item i1 = new Item();
        Item i2 = new Item();
        Item i3 = new Item();
        Item i4 = new Item();
        Item i5 = new Item();

        i1.setProductos(p1);
        i2.setProductos(p2);
        i3.setProductos(p3);
        i4.setProductos(p4);
        i5.setProductos(p5);



        Cliente c1 = new Cliente();
        c1.setTipoDocumento("CC");
        c1.setNumeroDocumento("12345");
        c1.setNombre("Hernando Moreno");
        c1.setDireccion("avenida siempre viva 123");
        c1.setTelefono("123123123");


        Factura f1 = new Factura();
        f1.setIdFactura(1);
        f1.setFecha(new Date());
        f1.setCliente(c1);
        f1.setItems(new ArrayList<>());
        f1.getItems().add(i1);
        f1.getItems().add(i2);
        f1.getItems().add(i3);
        f1.getItems().add(i4);
        f1.getItems().add(i5);

        Factura f2 = new Factura();
        f2.setIdFactura(2);
        Factura f3 = new Factura();
        f3.setIdFactura(3);

        c1.setFacturas(new HashSet<>());
        c1.getFacturas().add(f1);
        c1.getFacturas().add(f2);
        c1.getFacturas().add(f3);


        System.out.println(c1);











    }


}
