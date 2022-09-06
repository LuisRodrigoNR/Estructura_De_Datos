import java.util.Arrays;
public class Arreglo<T> {
	
private int tamanio;
private T datos[];
 Arreglo(int tamanio) { //constructor

	this.tamanio=tamanio;
        datos=(T[]) new Object [tamanio];
}

public int getLongitud() {
	return this.tamanio;
}

public void setElemento(int indice, T valor) {
	datos[indice]=valor;
}

    /**
     *
     * @param indice
     * @return
     */
    public T getElemento(int indice){
    if(indice>=this.tamanio || indice<0){
        System.out.println("Indice fuera del limite");
    }
		return this.datos[indice];

	        
}
public void limpiar(T valor){
    for(int i=0;i< tamanio;i++)
    {
    datos[i]=valor;
    }
}

   @Override
public String toString() {
	return Arrays.toString(datos);
}


}


