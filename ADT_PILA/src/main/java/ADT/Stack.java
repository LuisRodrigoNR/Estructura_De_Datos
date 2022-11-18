
package ADT;

import java.util.ArrayList;


public class Stack <T>{
    
    private ArrayList<T> datos;
    private int top;

    public Stack() {
        datos = new ArrayList<>();
        top = -1;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public int length() {
        return datos.size();
    }

    public T pop() {
        if (top < 0) {
            return null;
        }
        top--;
        return datos.remove(datos.size() - 1);
    }

    public T peek() {
        if (top < 0) {
            return null;
        }
        return datos.get(top);
    }

    public void push(T value) {
        datos.add(value);
        top++;
    }
    
    
    @Override
    public String toString() {
        String stack = "";
        for (int i = top; i >= 0; i--) {
            stack += (datos.get(i) + "\n");
        }
        return stack;
    }


}
