
import java.util.Arrays;

//Validar si dos arreglos son iguales con la función equals() de la clase Arrays.
//sort ordena de menor a mayor los numeros y en caso de cadena ordena las vocales y el albabeto er orden
 
public class ArreglosIgualesSort {

    public static void main(String[] args) {
        
        int[] numeros1 = {1, 2, 3};
        int[] numeros2 = {3, 2, 1};
    
        
        System.out.println(Arrays.equals(numeros1, numeros2));  // false
        
        System.out.println();
        
        Arrays.sort(numeros2);
        
        System.out.println(Arrays.equals(numeros1, numeros2));  // true
    }
}
