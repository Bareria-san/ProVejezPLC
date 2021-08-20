/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;

import modelo.AdultoMayor;
/**
 *
 * @author alejo
 */
public class ListaSEAdulto {

    private NodoAdulto primerNodo;
    private NodoAdulto ultimoNodo;
    private int n;
   
    public ListaSEAdulto() {
        primerNodo = null;
        ultimoNodo = null;
        n = 0;
    }

    public void agregar(AdultoMayor dato) {
        NodoAdulto nuevoNodo = new NodoAdulto(dato);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            ultimoNodo.siguiente = nuevoNodo;
        }
        ultimoNodo = nuevoNodo;
        n++;
    }
    
    public AdultoMayor obtener (int indice){
        if (indice >= 0 && indice < n) {
            NodoAdulto actual = primerNodo;
            while (indice > 0) {                
                actual = actual.siguiente;
                indice--;
            }
            return actual.dato;
        } 
        throw new IndexOutOfBoundsException("" + indice);
        
    }
    
    public boolean esVacia(){
        return primerNodo != null;
    }
    
    public int tamanio(){
        return n;
    }
    
    public String toString(){
        String texto = "";
        if (primerNodo != null) {
            NodoAdulto actual = primerNodo;
            while (actual.siguiente != null) {                
                texto += actual.dato + "\n" + "\n";
                actual = actual.siguiente;
            }
            texto += actual.dato;
        }
        return texto;
    }
}
