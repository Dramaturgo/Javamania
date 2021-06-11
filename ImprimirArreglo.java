
import java.util.Arrays;

// Mostrar la representación en texto de un arreglo con toString() de la clase Arrays.
 
public class RepresentacionTextoArreglo {
    public static String Imprime_arreglo(String []arreglo){
String cadena="";
for(int i=0;i<arreglo.length;i++){
    cadena+=String.valueOf(arreglo[i])+" ";
}return cadena;
}
    public static void main(String[] args) {
        
        String[] lenguajes = {"Java", "Go", "JavaScript", "Python", "C++", "C", "C#", "F#"};
        //Metodo 1 usando for
        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }
        //Metodo 2 con metodo
        System.out.println(Imprime_arreglo(lenguajes));
        System.out.println("");
        //Metodo 3 para usar debes importar libreria arrays
        System.out.println(Arrays.toString(lenguajes));
    }
}
