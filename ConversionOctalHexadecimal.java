// Definir una función para convertir un número octal en un número hexadecimal.
 
public class ConversionOctalHexadecimal {

    public static void main(String[] args) {
        
        System.out.println(convertirOctalhexadecimal("12"));    // A
        System.out.println(convertirOctalhexadecimal("17"));    // F
    }
    
    public static String convertirOctalhexadecimal(String octal) {
        int decimal = Integer.parseInt(octal, 8);
        
        return Integer.toHexString(decimal);
    }
}
