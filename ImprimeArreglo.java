import java.util.Arrays;

// Implementar formas de imprimir un arreglo.
 
public class ImprimeArreglo {

//Metodo 1: usando metodos metodo (imprime de forma horizontal,se puede añadir formato a la cadena)

public static String imprimeArregloInt(int []arreglo){
String cadena="";
for(int i=0;i<arreglo.length;i++){
    cadena+=String.valueOf(arreglo[i])+" ";
}return cadena;
}

public static String imprimeArregloString(String[]arreglo){
String cadena="";
for(int i=0;i<arreglo.length;i++){
cadena+=arreglo[i];
}return cadena;
}

public static String imprimeArregloDouble(double []arreglo){
String cadena="";
for(int i=0;i<arreglo.length;i++){
    cadena+=String.format("%.2f",arreglo[i])+" ";

}return cadena;
}
    public static void main(String[] args) {
        
        String[] lenguajes = {"Java", "Go", "JavaScript", "Python", "C++", "C", "C#", "F#"};
        //Metodo 2 usando for(imprime cadena de forma vertical)

        for (String lenguaje : lenguajes) {
        System.out.println(lenguaje);
        }

        //Metodo 3 usando toString,para usar debes importar libreria Arrays(imprime de forma horizontal
        System.out.println(Arrays.toString(lenguajes));

        //Metodo 4 usando bucle con print(imprime de forma vertical)

        for(int i=0;i<lenguajes.length;i++){
        System.out.println(lenguajes[i]);
        }

        //Metodo 4 usando stream y forEach,para usar debes importar libreria Arrays (imprime de manera vertical)
        Arrays.stream(lenguajes).forEach(System.out::println);

        //Metodo 5 usando asList(),para usar debes importar libreria Arrays(imprime de manera horizontal,solo para arreglos de tipo String)
        System.out.println(Arrays.asList(lenguajes)); 

        //Metodo 6 imprime arreglo multidimensional de manera horizontal,para usar debes importar libreria Arrays
        int Array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(Array)); 

    }
}




