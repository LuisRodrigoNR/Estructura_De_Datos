
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Main {
     public static void main(String[] args)  {
        Nomina nomina = null;
         try {
             nomina = new Nomina("junio.dat", "Merequetengue");
         } catch (IOException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         }
        nomina.calcularSueldo();
      
        nomina.obtenerMaxMin();
    }
}
