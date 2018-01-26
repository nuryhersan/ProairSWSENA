/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Producto {
 private Integer codigoproducto;
 private String nombre;
 private Integer cantidad;
 private Integer valorunitario;
 private Integer subtotal;

    public Producto() {
    }

    public Producto(Integer codigoproducto, String nombre, Integer cantidad, Integer valorunitario, Integer subtotal) {
        this.codigoproducto = codigoproducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorunitario = valorunitario;
        this.subtotal = subtotal;
    }

    public Integer getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(Integer codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(Integer valorunitario) {
        this.valorunitario = valorunitario;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoproducto=" + codigoproducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", valorunitario=" + valorunitario + ", subtotal=" + subtotal + '}';
    }
 
 
}
