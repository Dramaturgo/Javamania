
import java.util.Arrays;

// Poblar un arreglo con cadenas de caracteres que representen números enteros.

public class PoblarArreglo {

    public static void main(String[] args) {
        
        int n = 15;
        String[] numerosTexto = new String[n];
        
        for (int i = 0; i < numerosTexto.length; i++) {
            numerosTexto[i] = String.valueOf(i + 1);
        }
        
        System.out.println(Arrays.toString(numerosTexto));
    }
}
