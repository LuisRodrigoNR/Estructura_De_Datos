package HashMap;

import java.util.HashMap;//importa la libreria Hashmap

//Nieto Rios Luis Rodrigo
public class MapaHash {

    public static void main(String[] args) {

        HashMap<String, String> mapa = new HashMap<>(); //creamos el objeto

        //Metodos principales
        mapa.isEmpty();//nos dice si esta vacio 

        mapa.put("colores", "verde");//con el metodo put agregamos elementos a la    
        mapa.put("Artistas", "Dua Lipa");//tabla
        mapa.put("Videojuegos", "Halo");

        //Aqui utilizaremos el metodo que da el tamanio del mapa
        System.out.println("Tamanio");
        System.out.println(mapa.size());

        //El metodo get para obtener el contenido de una clave del mapa
        System.out.println(mapa.get("Artistas"));

        //El metodo remove para eliminar un valor del hashmap segun la clave
        mapa.remove("colores");

        //Verificar si esta en el mapa un valor
        System.out.println("Esta el videojuego Halo? " + mapa.containsValue("Halo"));

        //recorrer el mapa entero
        for (String clave : mapa.keySet()) {
            System.out.println("clave " + clave + " contenido " + mapa.get(clave));
        }

    }

}
