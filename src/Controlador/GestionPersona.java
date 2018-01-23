/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class GestionPersona implements OperacionCrudpersona {

    ArrayList<Persona> registroPersona;

    public GestionPersona() {
        registroPersona = new ArrayList<>();
        
    }

    @Override
    public Boolean registrarPersona(Persona p) {
     return registroPersona.add(p);
    
    }

    @Override
    public Boolean actualizarPersona(Persona p) {
        for (int i = 0; i<registroPersona.size();i++){
         if(registroPersona.get(i).getNumiden().equals(p.getNumiden())) {
             registroPersona.set(i, p);
             return true;
         }  
        }
       return false; 
    }

    @Override 
    public Boolean eliminarPersona(Integer numiden) {
        for (int i = 0 ; i<registroPersona.size();i++){
            if (Objects.equals(registroPersona.get(i).getNumiden(), numiden)){
                registroPersona.remove(i);
                return true;
            }
        }
       return false; 
    }

    @Override
    public Persona buscarPersona(Integer numiiden) {
        for (Persona P : registroPersona) {
         if(P.getNumiden().equals(numiiden)) {
             return P;
         }  
            
        }
       return null;  
    }

    @Override
    public ArrayList<Persona> mostrartodo() {
        return registroPersona;
         
    }
}
