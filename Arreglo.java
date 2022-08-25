import java.util.Arrays;
public class Arreglo {
	
private int tamanio;  //atributos
private int indice;
private String valor;

Arreglo (int tamanio) { //constructor

	this.tamanio=tamanio;
}

public int getLongitud() {   //obtiene el tamaño del arreglo
	return this.tamanio;
}
public void setElemento(int indice, String valor) {    //Establece un elemnto
	this.indice=indice;
	this.valor=valor;
}
public int getElemento(int indice){      
    if(indice>=this.tamanio || indice<0){
        System.out.println("Indice fuera del limite");
    }
		return this.indice;

	        
}
public void limpiar(String valor){  //limpia la pantalla con el valor proporcionado
    
}

   @Override
public String toString() {   //muestra el estado del objeto
	return "Arreglo [tamanio=" + tamanio + ", indice=" + indice + ", valor=" + valor + "]";
}


}



