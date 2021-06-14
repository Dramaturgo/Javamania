// Definir una función para sumar los dígitos de un número entero positivo.

public class SumaDigitosEntero {

    public static void main(String[] args) {
        int numero = 12345;
        
        int suma = sumarDigitosEntero(numero);
        System.out.println(suma);   // 15
    }

    public static int sumarDigitosEntero(int numero) {
        String numeroTexto = "" + numero;// otra forma de convertir entero a String

        int suma = 0;

        for (int i = 0; i < numeroTexto.length(); ++i) {
            int digito = Integer.parseInt(String.valueOf(numeroTexto.charAt(i)));
            
            suma += digito;
        }
        
        return suma;
    }
}
