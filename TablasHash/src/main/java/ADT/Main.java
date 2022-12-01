
package ADT;

//Nieto Rios Luis Rodrigo
public class Main {
    public static void main(String[] args) {
          HashTableADT<Integer, String> tabla = new HashTableADT<>(4);
        tabla.add(1, "yisus");
        tabla.add(2,"gertrudiz");
        
        System.out.println(tabla.valueOf(1));
         System.out.println(tabla.valueOf(2));
         
         tabla.remove(2);
         System.out.println("-----------");
          System.out.println(tabla.valueOf(1));
         System.out.println(tabla.valueOf(2));
         
         
    }
       
       
    
    
}
