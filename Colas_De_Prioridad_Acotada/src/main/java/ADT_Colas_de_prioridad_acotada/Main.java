
package ADT_Colas_de_prioridad_acotada;
//Estructura de Datos
    //Nieto Rios Luis Rodrigo

public class Main {
    public static void main(String[] args) {
         BoundedPriorityQueue<String> colaAcotada = new BoundedPriorityQueue<String>(7);
        colaAcotada.enqueue(4, "Maestro");
        
        colaAcotada.enqueue(2, "Niños");
        
      
        colaAcotada.enqueue(5, "Capitan");
        
        colaAcotada.enqueue(4, "Timonel");
        
        colaAcotada.enqueue(3, "Mujeres");
        
        colaAcotada.enqueue(2, "3ra edad");
          colaAcotada.enqueue(4, "Mecanico");
        
        colaAcotada.enqueue(3, "Hombres");
        
        colaAcotada.enqueue(4, "Vigia");
        
        
        colaAcotada.enqueue(1, "Niñas");
        
        System.out.println("La cola es: "+colaAcotada.toString());
        
      
    }
}
