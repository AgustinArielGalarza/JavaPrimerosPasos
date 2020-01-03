package ejerciciofactura;

import java.util.Date;

public class FacturaB extends Factura{

    public FacturaB() {
    }

    public FacturaB(Integer nroFactura, Date fechaFactura, String cliente, Integer cantProducto, String descProducto, Double precioProducto) {
        super(nroFactura, fechaFactura, cliente, cantProducto, descProducto, precioProducto);
    }
    
}
