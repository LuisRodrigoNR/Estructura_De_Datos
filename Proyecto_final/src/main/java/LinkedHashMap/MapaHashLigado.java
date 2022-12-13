package LinkedHashMap;

//Nieto Rios Luis Rodrigo

import java.util.LinkedHashMap;
import java.util.Map;


public class MapaHashLigado {
    public static void main(String[] args) {
        LinkedHashMap<String,String> mapa =new LinkedHashMap<>();// creamos el mapa
        
        //Metodos Principales
        //Con el put se agregan elementos al mapaligado
       mapa.put("Colores", "rojo");
       mapa.put("ropa", "hoodie");
       mapa.put("Comida", "huauzontles");
       
       //con el remove eliminamos el elemento
       mapa.remove("ropa");
       
       //con el size obtenemos el tamanio del mapa
       
        System.out.println("tamanio: "+mapa.size());
        
        //recorremos el mapa con el keyset y imprimimos el contenido
        for(String clave:mapa.keySet() ){
            System.out.println("clave " +clave+" contenido "+mapa.get(clave)); 
        }
       
        
    }
}
