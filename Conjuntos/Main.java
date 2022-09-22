
package Conjuntos;

 
public class Main {
    ConjuntosADT<Integer> conjunto = new ConjuntosADT();
    ConjuntosADT<Integer> otroConjunto = new ConjuntosADT();

    public  void main(String[] args) {
        
    
    
   conjunto.agregar(2);
   conjunto.agregar(8);
   conjunto.agregar(5);
   conjunto.agregar(7);
   otroConjunto.agregar(5);
   otroConjunto.agregar(9);
   otroConjunto.agregar(10);
   otroConjunto.agregar(8);

  
    System.out.println("longitud conjunto: " + conjunto.longitud());
    System.out.println("longitud otroConjunto: " + otroConjunto.longitud());

        System.out.println("Estos contienen");
    System.out.println("conjunto contiene 8: " + conjunto.contiene(8));
    System.out.println("otroConjunto contiene 5: " + otroConjunto.contiene(5));

   
    System.out.println("\nElimina 8 de conjunto");
    conjunto.quitar(8);
    System.out.println(conjunto);

    
    System.out.println("\nVerificamos si son iguales");
    System.out.println("conjunto == otroConjunto: " + conjunto.equals(otroConjunto));

    System.out.println("\n vemos si es un subconjunto");
    System.out.println("conjunto subconjunto otroConjunto: " + conjunto.subConjunto(otroConjunto));

    System.out.println("\nUnion");
    conjunto.union(otroConjunto);
    System.out.println(conjunto);

    System.out.println("\nInterseccion");
    ConjuntosADT<Integer> conjuntoIntersecta = conjunto.interseccion(otroConjunto);
    System.out.println("interseccion conjunto otroConjunto: " + conjuntoIntersecta);

  
    System.out.println("\nDiferencia");
    ConjuntosADT<Integer> conjuntoDiferencia = conjunto.diferencia(otroConjunto);
    System.out.println("diferencia de el conjunto y el otro " + conjuntoDiferencia);

    System.out.println("\nIterador");
    for (Integer elemento : conjunto) {
        System.out.println("elemento: " + elemento);
    }

    }

}
