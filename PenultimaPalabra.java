
import java.util.Scanner;

//Definir una función para obtener la penúltima palabra de una frase.

public class PenultimaPalabra {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite una frase: ");
        String frase = entrada.nextLine();
        
        System.out.println();
        
        
        String[] palabras = frase.split("[ ]+");
        
        String penultimaPalabra = palabras[palabras.length - 2];
        System.out.println(penultimaPalabra);
    }
}
