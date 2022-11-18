
package ADT;


public class Main {
    public static void main(String[] args) {
        Stack <Integer> pila = new Stack <Integer>();
        System.out.println("Esta vacia "+pila.isEmpty());
        
         System.out.println("Longitud: " + pila.length());
         
        System.out.println("Agrega(1)");
        pila.push(1);
        
        System.out.println("Agrega(2)");
        pila.push(2);
        
        System.out.println("Agrega(3)");
        pila.push(3);
        
        System.out.println("Agrega(4)");
        pila.push(4);
        
        System.out.println("El dato de hasta arriba es: " + pila.peek());
        System.out.println("Se quito el dato: " + pila.pop());
        System.out.println(pila);
        
        
    }
   
    
        
    
}
