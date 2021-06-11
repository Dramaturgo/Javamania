
import java.util.Collections;

// Extraer los primeros n caracteres de una cadena y multiplicarlos según un valor específico.

public class ExtraccionMultiplicacionCaracteres {

    public static void main(String[] args) {

        System.out.println(extraerMultiplicarTexto("Java es tremendo", 4, 5));
        System.out.println(extraerMultiplicarTexto("Java es tremendo", 2, 5));
    }

    public static String extraerMultiplicarTexto(String texto, int n, int k) {
        if (n <= texto.length()) {
            String subcadena = texto.substring(0, n);

            return String.join("", Collections.nCopies(k, subcadena));
        } else {
            return texto;
        }
    }
}
