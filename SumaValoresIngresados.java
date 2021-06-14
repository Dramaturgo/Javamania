
import java.util.Scanner;

// Sumar dos números ingresados por el usuario a través de la entrada estándar (teclado).
 
public class SumaValoresIngresados {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el primer número: ");
        int numero1 = Integer.parseInt(entrada.nextLine());
        
        System.out.println();
        
        System.out.print("Digite el segundo número: ");
        int numero2 = Integer.parseInt(entrada.nextLine());
        
        System.out.println();
        
        int suma = numero1 + numero2;
        
        System.out.printf("La suma de %d más %d es igual a %d.", numero1, numero2, suma);
        
        System.out.println();
    }
}
