package ejerciciofactura;

import java.util.Date;

public class Factura {
    private Integer nroFactura;
    private Date fechaFactura;
    private String cliente;
    private Integer cantProducto;
    private String descProducto;
    private Double precioProducto;

    public Factura() {
    }

    public Factura(Integer nroFactura, Date fechaFactura, String cliente, Integer cantProducto, String descProducto, Double precioProducto) {
        this.nroFactura = nroFactura;
        this.fechaFactura = fechaFactura;
        this.cliente = cliente;
        this.cantProducto = cantProducto;
        this.descProducto = descProducto;
        this.precioProducto = precioProducto;
    }

    public Integer getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(Integer nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(Integer cantProducto) {
        this.cantProducto = cantProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Double calcularMonto(){
        return this.cantProducto * this.precioProducto;
    }
}
