
import java.util.Scanner;

// Definir una función para colocar en mayuscula la primera letra de cada palabra en una frase.

public class CambioPrimeraLetraMayuscula {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        String frase=sc.nextLine();
        
        System.out.println();
        
        String resultado = capitalizarFrase(frase);
        System.out.println(resultado);
    }
    
    public static String capitalizarFrase(String frase) {
        
        String capitalizacion = "";
        Scanner contenido = new Scanner(frase);
        
        while(contenido.hasNext()) {
            String palabra = contenido.next();
            
            capitalizacion += Character.toUpperCase(palabra.charAt(0));
            capitalizacion += palabra.substring(1) + " ";
        }
        
        return capitalizacion;
    }
}
