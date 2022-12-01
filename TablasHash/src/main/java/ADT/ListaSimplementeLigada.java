
package ADT;

//Nieto Rios Luis Rodrigo
public class ListaSimplementeLigada <T>{
     private Nodo<T> head;
   private int tamanio;
    
public ListaSimplementeLigada(){
head=null;    
}   
public boolean estaVacio(){
    return head==null;
}

public int getTamanio(){
    return this.tamanio;
}

 public T ObtenerValor(T valor) {
        Nodo<T> aux = head;
        while(aux != null){
            if(valor.equals(aux.obtenerDato())) {
                return aux.obtenerDato();
            }
            aux = aux.getsiguiente();
        }
        return null;
    }

public void agregarAlFinal(T valor){
    if(this.head==null){
        head=new Nodo<>(valor);
    }
    else{
        Nodo<T> nuevo=new Nodo(valor);
        Nodo<T> aux=this.head;
        while(aux.getsiguiente()!=null){
            aux=aux.getsiguiente();
        }
        aux.setSiguiente(nuevo);
    }
    
}

public void agregarAlInicio(T valor){
    if(this.head==null)
    {
        head=new Nodo(valor);
    }
    else
    {
      Nodo<T> nuevo =new Nodo(valor);
      nuevo.setSiguiente(head);
      head=nuevo;
    }
}

public int buscar(T valor){
    int posicion = 0;
        Nodo<T> nodoActual = head;
        while(nodoActual != null){
            if(nodoActual.obtenerDato()== valor) {
                return posicion;
            }
            nodoActual = nodoActual.getsiguiente();
            posicion++;
        }
        return posicion;
    
}


public void agregarDespuesDe(T referencia,T valor){

  if(buscar(referencia) < 0) return;
  {
        Nodo<T> nodoActual = head;
        while(nodoActual.getsiguiente() != null && nodoActual.obtenerDato() != referencia)
        {
            nodoActual = nodoActual.getsiguiente();
        }
        Nodo<T> nuevo = new Nodo<>(valor, nodoActual.getsiguiente());
        nodoActual.setSiguiente(nuevo);
  }
}

public void Eliminar( int posicion){
      if(this.getTamanio() <= posicion)
      {
          return;
      }
        if(posicion == 0) 
        {
            head = head.getsiguiente();
            return;
        }

        int posIndice = 0;
        Nodo<T> nodoAnterior = null;
        Nodo<T> nodoActual = head;

        while(nodoActual.getsiguiente() != null && posIndice < posicion)
        {
            nodoAnterior = nodoActual;
            nodoActual=nodoActual.getsiguiente();
            posIndice++;
        }
        nodoAnterior.setSiguiente(nodoActual.getsiguiente());
}

public void Eliminarprimero()
{
    if(estaVacio())//si la lista esta vacia no hace nada
    {
        return;
    }
    else//si no el nodo cabeza apunta al siguiente haciendo que el primero se pierda
    {      //por lo tanto se elimina        
        head = head.getsiguiente();
    }
            
}

public void Eliminarfinal()
{
    if(estaVacio()){
        return;
    }
    //recorrer toda la lista
  Nodo<T> nodoAnterior=null;   
  Nodo<T> nodoActual=head;
  
  while(nodoActual.getsiguiente()!=null)
  {
    nodoAnterior=nodoActual;  
    nodoActual=nodoActual.getsiguiente();
  
   }
  nodoAnterior.setSiguiente(null);
}

 public void eliminarValor(T valor_eliminar) {
        if(estaVacio()) return;
        Nodo<T> nodoAnterior = null;
        Nodo<T> aux = head;
        while(aux.getsiguiente() != null && !valor_eliminar.equals(aux.obtenerDato())){
            nodoAnterior = aux;
            aux = aux.getsiguiente();
        }

        if(nodoAnterior != null) {
            nodoAnterior.setSiguiente(aux.getsiguiente());
        } else {
            Eliminarprimero();
        }
    }
 
 public void actualizar(T a_buscar, T valor){
        if(buscar(a_buscar) < 0)
        {
            return;// por que no existen negativos
        }
head=new Nodo<>(valor);
        Nodo<T> nodoActual = head;
        
        
        while(nodoActual != null && !a_buscar.equals(nodoActual.obtenerDato())){
            nodoActual = nodoActual.getsiguiente();
        }
        
        if(nodoActual.obtenerDato() != a_buscar) 
        {
            return;
        }
        nodoActual.setDato(valor);
    }

public void transversal(){
    Nodo<T> nodoActual=head;
    while(nodoActual!=null){
        System.out.print(nodoActual);
        nodoActual=nodoActual.getsiguiente();
    }
}
}
