import java.util.Arrays;
public class Arreglo {
	
private int tamanio;
private int indice;
private String valor;

Arreglo (int tamanio) { //constructor

	this.tamanio=tamanio;
}

public int getLongitud() {
	return this.tamanio;
}
public void setElemento(int indice, String valor) {
	this.indice=indice;
	this.valor=valor;
}
public int getElemento(int indice){
    if(indice>=this.tamanio || indice<0){
        System.out.println("Indice fuera del limite");
    }
		return this.indice;

	        
}
public void limpiar(String valor){
    
}

   @Override
public String toString() {
	return "Arreglo [tamanio=" + tamanio + ", indice=" + indice + ", valor=" + valor + "]";
}


}



