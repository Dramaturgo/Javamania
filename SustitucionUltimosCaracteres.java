
import java.util.Collections;
// Sustituir los últimos n caracteres de un texto por un carácter específico.

public class SustitucionUltimosCaracteres {

    public static void main(String[] args) {
        
        // Programación
        // #
        // 3
        // => Programac###
        
        System.out.println(sustuirUltimosCaracteres("Programación", "#", 3)); // Programac###
        
        System.out.println();
        
        System.out.println(sustuirUltimosCaracteres("Programación", "#", 12)); // ############
    }
    
    public static String sustuirUltimosCaracteres(String texto, String caracter, int n) {
        if (n > texto.length()) {
            n = texto.length();
        }
        
        return texto.substring(0, texto.length() - n) + String.join("", Collections.nCopies(n, caracter));
    }
}
