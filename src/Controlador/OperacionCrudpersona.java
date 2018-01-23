/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface OperacionCrudpersona {
   
     public  Boolean registrarPersona(Persona p);
    public Boolean actualizarPersona( Persona P);
    public Boolean eliminarPersona(Integer numiden);
    public Persona buscarPersona(Integer numiiden);
    public ArrayList<Persona> mostrartodo();

}
