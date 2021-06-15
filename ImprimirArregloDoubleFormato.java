public class ImprimirArregloDoubleFormato{

public static String Imprime_arreglo(double []arreglo){
String cadena="";
for(int i=0;i<arreglo.length;i++){
    cadena+=String.format("%.4s",String.valueOf(arreglo[i]))+" ";

}return cadena;
}


public static String Imprime_arregloV2(double[]arreglo){
String cadenas="";

for(int i =0;i<arreglo.length;i++){
cadenas+=String.format("%.2f",arreglo[i])+" ";

}return cadenas;

}



public static void main(String[] args) {
	
double[]arreglo={0.12456,0.13566,0.154566};
System.out.println(arreglo[0]);

String mona="";
mona=String.format("%.4s",arreglo[0]);
System.out.println(mona);

//System.out.println(Imprime_arreglo(arreglo));

System.out.println(Imprime_arregloV2(arreglo));



}}