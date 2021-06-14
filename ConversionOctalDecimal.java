// Definir una función para convertir un número octal en un número decimal.

public class ConversionOctalDecimal {

    public static void main(String[] args) {
        
        long octal = 12;
        
        System.out.println(convertirOctalDecimal(octal));   // 10
    }
    
    public static long convertirOctalDecimal(long octal) {
        int i = 0;
        long decimal = 0;
        
        while (octal != 0) {
            decimal = (long) (decimal + (octal % 10) * Math.pow(8, i));
            
            octal /= 10;
            
            ++i;
        }
        
        return decimal;
    }
}
