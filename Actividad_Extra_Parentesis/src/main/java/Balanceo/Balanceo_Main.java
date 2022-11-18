
package Balanceo;
  import java.io.BufferedReader;
import java.io.FileReader;
public class Balanceo_Main {
  
    public static void main(String[] args) {
        String archivo1 = "texto1.txt";
        String contenido1 = leerContenido(archivo1);
        boolean balanceo1 = corregirParentesis(contenido1);
        System.out.println("Archivo " + archivo1 +  " - Balanceo: " + balanceo1);

        String archivo2 = "texto2.txt";
        String contenido2 = leerContenido(archivo2);
        boolean balanceo2 = corregirParentesis(contenido2);
        System.out.println("Archivo " + archivo2 + " - Balanceo: " + balanceo2);
    }

    public static boolean corregirParentesis(String oracion) {
        Stack<Character>validacion  = new Stack<>();

        for (int i = 0; i < oracion.length(); i++) {
            char caracterActual = oracion.charAt(i);
            switch (caracterActual) {
                case '(':
                case '[':
                case '{':
                    validacion.push(caracterActual);
                    break;

                case ')':
                case ']':
                case '}':
                    if (validacion.isEmpty())
                        return false;
                    else {
                        char caracterPila = validacion.pop();
                        if (caracterActual == ')' && caracterPila != '(')
                            return false;
                        else if (caracterActual == ']' && caracterPila != '[')
                            return false;
                        else if (caracterActual == '}' && caracterPila != '{')
                            return false;
                    }
                    break;

                default:
                    break;
            }
        }

        return validacion.isEmpty();
    }

    public static String leerContenido(String   nombreArchivo) {
        String renglon;
        String fileContent = "";
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((renglon = bufferedReader.readLine()) != null) {
                fileContent += renglon;
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        return fileContent;
    }
}

