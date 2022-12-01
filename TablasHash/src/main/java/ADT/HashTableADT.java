
package ADT;
//Nieto Rios Luis Rodrigo   

public class HashTableADT<K, T> {
 private class Entrada {
        public K key;
        public T value;
        public int hash;

        public Entrada(K key, T value) {
            this.key = key;
            this.value = value;
            this.hash = key.hashCode();
        }

        @Override
        public boolean equals(Object otherEntry) {
            Entrada otra = (Entrada) otherEntry;
            if(this.hash != otra.hash) return false;
            return this.key.equals(otra.key);
        }
    }

    private int tableSize;
    private ListaSimplementeLigada<Entrada>[] entradas;

    public HashTableADT(int tableSize) {
        this.tableSize = tableSize;
        this.entradas = new ListaSimplementeLigada[tableSize];
        for(int i = 0; i < tableSize; i++) {
            entradas[i] = new ListaSimplementeLigada<>();
        }
    }

    private int normalizar(int hashKey) {
        return (hashKey & 0x7FFFFFFF) % tableSize;
    }

    public void add(K key, T value) {
        Entrada entrada = new Entrada(key, value);
        int indice = normalizar(entrada.hash);
        if (entradas[indice] == null) {
            entradas[indice] = new ListaSimplementeLigada<>();
            entradas[indice].agregarAlInicio(entrada);
        } else {
            if (entradas[indice].buscar(entrada) >= 0) {
                
                entradas[indice].actualizar(entrada, entrada);
            } else {
                entradas[indice].agregarAlInicio(entrada);
            }
        }
    }

    public T valueOf(K key) {
        int indice = normalizar(key.hashCode());
        if (entradas[indice] == null || entradas[indice].estaVacio()) {
            return null;
        }
        Entrada entrada = new Entrada(key, null);
        Entrada index = entradas[indice].ObtenerValor(entrada);
        if (index == null) return null;
        return index.value;
    }

    public void remove(K key) {
        Entrada aux = new Entrada(key, null);
        int indice = normalizar(key.hashCode());
        entradas[indice].eliminarValor(aux);
    }
    
}
