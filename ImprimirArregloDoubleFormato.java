public class ImprimirArregloDoubleFormato{

public static String imprimeArregloDouble(double []arreglo){
String cadena="";
for(int i=0;i<arreglo.length;i++){
    cadena+=String.format("%.2f",arreglo[i])+"% ";

}return cadena;
}

public static void main(String[] args) {
	
double[]arreglo={0.12456,0.13566,0.154566};

System.out.println("["+imprimeArregloDouble(arreglo)+"]");



}}
