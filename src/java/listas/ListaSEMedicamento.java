/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;

import modelo.Medicamento;
/**
 *
 * @author alejo
 */
public class ListaSEMedicamento {
    
    private NodoMedicamento primerNodo;
    private NodoMedicamento ultimoNodo;
    private int n;

    public ListaSEMedicamento() {
        primerNodo = null;
        ultimoNodo = null;
        n = 0;
    }

    public void agregar(Medicamento dato) {
        NodoMedicamento nuevoNodo = new NodoMedicamento(dato);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            ultimoNodo.siguiente = nuevoNodo;
        }
        ultimoNodo = nuevoNodo;
        n++;
    }
    
    public Medicamento obtener (int indice){
        if (indice >= 0 && indice < n) {
            NodoMedicamento actual = primerNodo;
            while (indice > 0) {                
                actual = actual.siguiente;
                indice--;
            }
            return actual.dato;
        } 
        throw new IndexOutOfBoundsException("" + indice);
        
    }
    
    public String toString(){
        String texto = "";
        if (primerNodo != null) {
            NodoMedicamento actual = primerNodo;
            while (actual.siguiente != null) {                
                texto += actual.dato + "\n" + "\n";
                actual = actual.siguiente;
            }
            texto += actual.dato;
        }
        return texto;
    }
    
}
