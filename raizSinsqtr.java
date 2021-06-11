import java.util.Scanner;

// hallar la raiz cuadrada de un numero dado sin usar sqtr

public class raizSinsqtr{


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        double x = 1.0;
        System.out.println("Ingrese el valor de a: ");
        int a = sc.nextInt();
        int k;
        for(k = 1; k < 10; k++){
            x = (x + a/x) / 2;
        }
        System.out.println("La raiz de " + a + " después de " + (k - 1) + " iteraciones es de " + x);
    }
    
}
	
