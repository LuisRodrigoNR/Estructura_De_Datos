/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;

/**
 *
 * @author COMSYS
 */
public class Nodo <T>{
    private T dato;
private Nodo<T> siguiente;

public Nodo(){
    
}
public Nodo(T valor){   //head
    this.dato=valor;
}
public Nodo(T valor,Nodo<T> siguiente){
    this.dato=valor;
    this.siguiente=siguiente;
}
public T obtenerDato(){
    return dato;
}

public void setDato(T valor){
    this.dato=valor;
}

public void setSiguiente(Nodo<T> siguiente){
    this.siguiente=siguiente;
}

public Nodo<T> getsiguiente(){
    return siguiente;
}

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }

    
}
