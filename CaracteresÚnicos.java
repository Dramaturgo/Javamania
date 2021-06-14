
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Usar un conjunto para obtener los caracteres únicos de un texto.

public class CaracteresÚnicos {

    public static void main(String[] args) {
        
        String texto = "matemáticas";
        System.out.println(texto);
        
        System.out.println();
        
        String[] caracteres = texto.split("");
        System.out.println(caracteres.length);
        
        System.out.println();
        
        Set<String> caracteresUnicos = new HashSet<>(Arrays.asList(caracteres));
        System.out.println(caracteresUnicos.size());
        
        System.out.println();
        
        for (String caracteresUnico : caracteresUnicos) {
            System.out.println(caracteresUnico);
        }
    }
}
