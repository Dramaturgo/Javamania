
// Definir una función para calcular el área de un polígono regular.
 
public class ComputoAreaPoligono {

    public static void main(String[] args) {
        
        int lados = 7;
        double longitud = 6;
        
        double area = calcularAreaPoligonoRegular(lados, longitud);
        System.out.println(area);   // ~130.82
    }
    
    public static double calcularAreaPoligonoRegular(int lados, double longitud) {
        double area = (lados * (longitud * longitud)) / (4.0 * Math.tan(Math.PI / lados));
        
        return area;
    }
}
