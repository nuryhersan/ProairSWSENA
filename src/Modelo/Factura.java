/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Dalia
 */
public class Factura {
    private Integer idFactura;
    private Integer idCliente;
    private Date fechaFactura;
    private String tipoPago;

    public Factura() {
    }

    public Factura(Integer idFactura, Integer idCliente, Date fechaFactura, String tipoPago) {
        this.idFactura = idFactura;
        this.idCliente = idCliente;
        this.fechaFactura = fechaFactura;
        this.tipoPago = tipoPago;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", idCliente=" + idCliente + ", fechaFactura=" + fechaFactura + ", tipoPago=" + tipoPago + '}';
    }
    
    
    
    
    
    
    
}
