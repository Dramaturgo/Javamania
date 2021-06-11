
import java.util.ArrayList;
import java.util.List;

// Usar la función toArray() para convertir un objeto ArrayList en un arreglo.
 
public class ConversionListaArreglo {

    public static void main(String[] args) {
        
        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C#");
        lenguajes.add("C++");
        lenguajes.add("JavaScript");
        
        System.out.println("Cantidad de elementos en la lista: " + lenguajes.size());
        
        System.out.println();
        
        String[] lenguajesArreglo = new String[lenguajes.size()];
        
        lenguajes.toArray(lenguajesArreglo);
        
        for (String lenguaje : lenguajesArreglo) {
            System.out.println(lenguaje);
        }
    }
}
