
import java.util.Arrays;

// Contar los elementos de dos arreglos cuya diferencia es menor o igual a 1.
//Math.abs-Valor absoluto

public class ConteoDiferenciaElementos {

    public static void main(String[] args) {
        
        int[] numeros1 = {2, 3, 7, 1, 10, 5, 17};
        int[] numeros2 = {5, 2, 9, 0, 13, 12, 16};
        
        int contador = 0;
        
        System.out.println(Arrays.toString(numeros1));
        System.out.println(Arrays.toString(numeros2));
        
        System.out.println();
        
        for (int i = 0; i < numeros1.length; i++) {
            if (numeros1[i] != numeros2[i] && Math.abs(numeros1[i] - numeros2[i]) <= 1) ++contador;
        }
        
        System.out.println(contador);
    }
}
