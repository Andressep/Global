import models.*;

public class Main {
    public static void main(String[] args) {
        Proveedor perfimet = new Proveedor(1, "Perfimet", "No me acuerdo");
        Proveedor pizarreno = new Proveedor(2, "Pizarreño", "No me acuerdo");
        Proveedor romeral = new Proveedor(3, "Romeral", "No me acuerdo");
        Proveedor tx = new Proveedor(4, "Tx", "No me acuerdo");

        Producto acero = new Producto(1, "Acero", "2x2x0,85", perfimet, 7560, 3.54, 100 );
        Producto gyplac = new Producto(2, "Gyplac", "1200x2400", romeral, 6590, 23, 100 );
        Producto cedral = new Producto(3, "Cedral Nogal", "3600x019", pizarreno, 6500, 6.3, 100 );
        Producto transex = new Producto(4, "Hormigon Predosificado", "", tx, 2650, 25, 100 );

        DetalleCotizacion detalle = new DetalleCotizacion(1);
        detalle.addProductos(acero);
        detalle.addProductos(gyplac);
        detalle.addProductos(cedral);
        detalle.addProductos(transex);

        detalle.mostrarProductos();
        System.out.println(" ");

        Cliente cliente1 = new Cliente(1, "Andres", "26.931.652-7", "La Cisterna", "9 3707 8878", "Bodyweightforce@gmail.com");
        Vendedor yeily = new Vendedor(1, "Yeily");

        Cotizacion cot1 = new Cotizacion(1, yeily, cliente1, detalle);
        /*
        cot1.setId(1);
        cot1.setCliente(cliente1);
        cot1.setVendedor(yeily);
        cot1.setDetalle(detalle);
        */
        System.out.println(cot1);

    }
}
