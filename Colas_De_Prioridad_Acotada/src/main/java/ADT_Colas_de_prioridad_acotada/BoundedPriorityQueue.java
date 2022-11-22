
package ADT_Colas_de_prioridad_acotada;

//Estructura de datos
//Nieto Rios Luis Rodrigo
import java.util.ArrayList;

//Nieto Rios Luis Rodrigo
public class BoundedPriorityQueue<T> {
private ArrayList<T>[] boundedQueue;
    private int size, tamanio;

    public BoundedPriorityQueue(int size) {
        boundedQueue = new ArrayList[size];
        this.size = size;
        tamanio = 0;
    }

    public boolean isEmpty() {
        return tamanio== 0;
    }

    public int length() {
        return tamanio;
    }

    public void enqueue(int niveles, T elem) {
        if(boundedQueue[niveles] == null) {
            boundedQueue[niveles] = new ArrayList<T>();
        }

        boundedQueue[niveles].add(elem);
        tamanio++;
    }

    public T dequeue() {
        if(isEmpty())
        {
            return null;
        }

        for(int i = 0; i < size; i++) 
        {
            if(boundedQueue[i] != null && !boundedQueue[i].isEmpty()) 
            {
                tamanio--;
                return boundedQueue[i].remove(i-1);
            }
        }

        return null;
    }

     

      
    @Override
    public String toString() {
        String cola = "";
        for(int i = 0; i < size; i++) {
            cola += i + ": ";
            if (boundedQueue[i] != null && !boundedQueue[i].isEmpty()) {
                cola += boundedQueue[i] + "\n";
            } else {
                cola += "null\n";
            }
        }
        return cola;
    }
}