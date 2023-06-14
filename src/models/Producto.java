package models;

public class Producto {
    private int id;
    private String nombre;
    private String medidas;
    private Proveedor proveedor;
    private int precio;
    private double peso;
    private int cantidad;

    public Producto(int id, String nombre, String medidas, Proveedor proveedor, int precio, double peso, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.medidas = medidas;
        this.proveedor = proveedor;
        this.precio = precio;
        this.peso = peso;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto " +
                "ID: " + id +
                ", nombre: " + nombre +
                ", medidas: " + medidas +
                ", proveedor: " + proveedor.getNombre() +
                ", precio: " + precio +
                ", peso: " + peso +
                ", cantidad: " + cantidad;
    }
}
