package ejerciciofactura;

import java.util.Date;

public class FacturaA extends Factura{

    public FacturaA() {
    }

    public FacturaA(Integer nroFactura, Date fechaFactura, String cliente, Integer cantProducto, String descProducto, Double precioProducto) {
        super(nroFactura, fechaFactura, cliente, cantProducto, descProducto, precioProducto);
    }

    @Override
    public Double calcularMonto() {
        return super.calcularMonto()*1.21;
    }
    
    
}
