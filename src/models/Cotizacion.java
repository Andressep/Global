package models;

import java.util.Date;

public class Cotizacion {
    private int id;
    private Vendedor vendedor;
    private Cliente cliente;
    private Date fecha;
    private DetalleCotizacion detalle;

    public Cotizacion() {
        this.fecha = new Date();
    }

    public Cotizacion(int id, Vendedor vendedor, Cliente cliente, DetalleCotizacion detalle) {
        this.id = id;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.detalle = detalle;
        this.fecha = new Date();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public DetalleCotizacion getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleCotizacion detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cotizacion ").append("\n")
                .append("ID: ").append(id).append("\n")
                .append("Vendedor: ").append(vendedor.getNombre()).append("\n")
                .append("Cliente: ").append(cliente.getNombre()).append("\n")
                .append("Fecha: ").append(fecha).append("\n")
                .append("Productos: ").append("\n");

        for (Producto producto : detalle.getProductos()) {
            sb.append(producto.toString()).append("\n");
        }

        return sb.toString();
    }
}
