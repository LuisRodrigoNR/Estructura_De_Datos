
package ADT_Colas;
//Estructura de Datos  
//Nieto Rios Luis Rodrigo   


import java.util.ArrayList;



public class Colas<T> {
    private int tamanio;
    private ArrayList<T> datos,aux;
    
    public Colas() {
         datos = new ArrayList<>();
        tamanio = -1;
    }

public boolean isEmpty(){
    return tamanio<=0;
}
public int length(){
    return datos.size();
} 
public void enqueue(T elem){
    datos.add(elem);
    tamanio++;
   
}
public T dequeue(){
    if(tamanio==0){
        return null;
    }
    tamanio--;
    int i;
   for( i=datos.size();i!=0;i--)
   {
      
   }
        return datos.remove(i);
      

}

    @Override
    public String toString() {
          String cola = "";
        for (int i = tamanio; i >= 0; i--) {
            cola += (datos.get(i)+" ,");
        }
        return cola;
    }


    
    
}
