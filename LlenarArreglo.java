
import java.util.Arrays;

/*Llenar un arreglo con un valor específico usando la función fill() de Arrays.

 El método fill() cambia todos los elementos en un arreglo por un valor estático,
 desde el índice start (por defecto 0)
 hasta el índice end (por defecto array. ... length ). Devuelve el arreglo modificado */
 
public class LlenarArreglo {

    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        System.out.println();
        System.out.println();
        
        Arrays.fill(numeros, 1000);
        
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
