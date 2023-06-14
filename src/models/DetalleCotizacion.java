package models;

import java.util.ArrayList;
import java.util.List;

public class DetalleCotizacion {
    private int id;
    private List<Producto> productos;

    public DetalleCotizacion(int id) {
        this.id = id;
        productos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Producto> getProductos() { return productos; }

    public void addProductos(Producto producto) {
        productos.add(producto);
    }
    public void mostrarProductos() {
        for (Producto producto : getProductos()) {
            System.out.println(producto);
        }
    }
}
