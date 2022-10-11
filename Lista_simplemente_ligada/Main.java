
package Lista_simplemente_ligada;


public class Main {
    public static void main(String[] args) {
        
    ListaSimplementeLigada<Integer> lista = new ListaSimplementeLigada<>();    
        
     // Esta vacia
        System.out.println("\nEsta vacia");
        System.out.println(lista.estaVacio());
    
          // Tamanio
        System.out.println("\nTamanio");
        System.out.println(lista.getTamanio());

        // Agregar al inicio
        System.out.println("\nAgrega 5 al inicio");
        
        lista.agregarAlInicio(5);
        
        System.out.println(lista);
        
        System.out.println("Agrega 8 al inicio");
        
        lista.agregarAlInicio(8);
        
        System.out.println(lista);
        
     
        // Agregar al final
        System.out.println("\nAgrega 50 al final");
        lista.agregarAlFinal(50);
        System.out.println(lista);

         // Agregar despues de
        System.out.println("\nAgregar 7 despues de 8");
        lista.agregarDespuesDe(8, 7);
        System.out.println(lista);
        
         System.out.println("\nAgregar 9 despues de 7");
        lista.agregarDespuesDe(7, 9);
        System.out.println(lista);

        // Eliminar
        System.out.println("\nElimina en la posicion 3");
        lista.Eliminar(3);
        System.out.println(lista);

        // Eliminar primerp
        System.out.println("\nElimina primero");
        lista.Eliminarprimero();
        System.out.println(lista);

        // Elimina al final
        System.out.println("\nElimina al final");
        lista.Eliminarfinal();
        System.out.println(lista);

        // Busca
        System.out.println("\nBusca el 5");
        System.out.println("El numero es: " + lista.buscar(5));

        // Actualiza 
        System.out.println("\nActualiza el 7 a 60");
        lista.actualizar(7, 60);
        System.out.println(lista);
    
    }


    
}
