
package TreeMap;

//Nieto Rios Luis Rodrigo

import java.util.TreeMap;


public class MapaArbol {
     public static void main(String[] args) {
         TreeMap<String,String> mapa= new TreeMap<>();//creamos el treemap
         //Metodos principales
         //Metodo put nos ayuda a agregar un elemento al treemap con clave
         mapa.put("Jugador1", "Marco");
         mapa.put("Jugador2", "Mono");
         mapa.put("Jugador3", "Martha");
         mapa.put("Jugador4", "yisus");
         
         //metodo remove elimina un elemnto segun su clave
         mapa.remove("Jugador1");
         //metodo get obtiene el valor segun la clave
         
         System.out.println("El nombre del jugador 2 es: "+mapa.get("Jugador2"));
         //metodo .size da el tamanio del treemap
         
         System.out.println("El tamaño del treemap es "+mapa.size());
         
         //el metodo para recorrer el treempap y imprimir el contenido es
         
         for(String clave:mapa.keySet()){
             System.out.println("Jugador: "+clave+" Nombre: "+mapa.get(clave));
         }
         
    }
     
      
}
