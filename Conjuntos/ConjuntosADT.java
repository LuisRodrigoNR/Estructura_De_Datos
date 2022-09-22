package Conjuntos;
import java.util.ArrayList;


public class ConjuntosADT<T> implements Iterable<T>{
    ArrayList<T> conjunto;

    public ConjuntosADT() {
        this.conjunto = new ArrayList<>();
    }

    public int longitud() {   //obtiene el tamaño del conjunto
        return this.conjunto.size();
    }

    public boolean contiene(T elemento) {
        return this.conjunto.indexOf(elemento) != -1;
        
    }

    public void agregar(T elemento) {
        if(!contiene(elemento)) {
            this.conjunto.add(elemento);
        }
    }

    public void quitar(T elemento) {
        this.conjunto.remove(elemento);
    }

    public boolean equals(ConjuntosADT<T> otroConjunto) {
        if(this.longitud() != otroConjunto.longitud()) {
            return false;
        }
        for(T elemento : this.conjunto) {
            if(!otroConjunto.contiene(elemento)) {
                return false;
            }
        }
        return true;
    }

    public boolean subConjunto(ConjuntosADT<T> otroConjunto) {
        if(longitud() > otroConjunto.longitud()){
            return false;
        }
        for(int i=0;i<this.conjunto.size();i++){
            T elemento = null;
            if(!otroConjunto.contiene(elemento)) {
                return false;
            } 
        }
       
        return true;
    }

    public void union(ConjuntosADT<T> Conjunto2) {
        for(T elemento : Conjunto2.conjunto) {
            this.agregar(elemento);
        }
    }

    public ConjuntosADT<T> interseccion(ConjuntosADT<T> Conjunto2) {
        ConjuntosADT<T> result = new ConjuntosADT<>();
        for(T elemento : this.conjunto) {
            if(Conjunto2.contiene(elemento)) {
                result.agregar(elemento);
            }
        }
        return result;
    }

    public ConjuntosADT<T> diferencia(ConjuntosADT<T> Conjunto2) {
        ConjuntosADT<T> resultado = new ConjuntosADT<>();
        for(T elemento : this.conjunto) {
            if(!Conjunto2.contiene(elemento)) {
                resultado.agregar(elemento);
            }
        }
        for(T elemento : Conjunto2.conjunto) {
            if(!contiene(elemento)) {
                resultado.agregar(elemento);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return conjunto.toString();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < conjunto.size();
            }

            @Override
            public T next() {
                return conjunto.get(index++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
