
//Definir una función para calcular el área de un hexágono.

public class CalculoAreaHexagono {

    public static void main(String[] args) {
        
        double longitud = 5;
        System.out.println(calcularAreaHexagono(longitud));
    }
    
    public static double calcularAreaHexagono(double longitud) {
        double area = (6*(longitud * longitud)) / (4 * Math.tan(Math.PI / 6));
        
        return area;
    }
}
