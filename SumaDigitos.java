
import java.util.Arrays;
import java.util.List;

// Sumar los dígitos de un número usando un objeto tipo Stream.
 
public class SumaDigitos {

    public static void main(String[] args) {
        
        int numero = 12345;
        
        List<String> digitos = Arrays.asList(String.valueOf(numero).split(""));
        
        int suma = digitos.stream().map(Integer::valueOf).reduce(0, Integer::sum);
        
        System.out.println(suma);
    }
}
