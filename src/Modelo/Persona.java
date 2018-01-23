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
public class Persona {
  private Integer numiden;
  private String nombre;
  private String primer_apellido;
  private String segundo_apellido;
  private Integer edad;
  private String direccion;
  private Integer telefono;
  private String ciudad;

    public Persona() {
    }

    public Persona(Integer numiden, String nombre, String primer_apellido, String segundo_apellido, Integer edad, String direccion, Integer telefono, String ciudad) {
        this.numiden = numiden;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public Integer getNumiden() {
        return numiden;
    }

    public void setNumiden(Integer numiden) {
        this.numiden = numiden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "numiden=" + numiden + ", nombre=" + nombre + ", primer_apellido=" + primer_apellido + ", segundo_apellido=" + segundo_apellido + ", edad=" + edad + ", direccion=" + direccion + ", telefono=" + telefono + ", ciudad=" + ciudad + '}';
    }
  
  
  
  
}
