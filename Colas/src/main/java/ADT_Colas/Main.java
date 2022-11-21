
package ADT_Colas;
//Estructura de Dtos   
//Nieto Rios Luis Rodrigo

public class Main {

    public static void main(String[] args) {
        
   Colas <Integer> cola = new Colas<Integer>();
    //comprobando si esta vacia
        System.out.println("Esta vacia?");
        System.out.println(cola.isEmpty());
        //agregando elementos a la cola
        System.out.println("Agregar 5 al final");
        cola.enqueue(5);
        System.out.println("Agregar 3 al final");
        cola.enqueue(3);
         System.out.println("Agregar 6 al final");
        cola.enqueue(6);
          System.out.println("Agregar 8 al final");
        cola.enqueue(8);
        //imprimiendo la cola actual y su longitud
        System.out.println("La cola actual es: "+cola.toString());
        System.out.println("El tamanio de la cola es: "+cola.length());
        //saca el primer elemento que ingreso haciendo caso a fifo(first in first out)
        System.out.println("Sacar el elemento de enfrente");
        cola.dequeue();
        //vuelve a imprimir la cola actual pero sin primer elemento
        System.out.println("La cola es: "+cola.toString());
         System.out.println("El tamanio de la cola es: "+cola.length());
         
         System.out.println("Sacar el elemento de enfrente");
        cola.dequeue();
         System.out.println("La cola es: "+cola.toString());
         System.out.println("El tamanio de la cola es: "+cola.length());
    }
}
