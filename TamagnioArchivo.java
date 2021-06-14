
import java.io.File;

//Usar la clase File para obtener el tamaño en bytes de un archivo.

public class TamagnioArchivo {

    public static void main(String[] args) {
        String ruta = "C:\\DamagnioArchivo.java";
        
        File archivo = new File(ruta);
        
        System.out.println("El tamaño del archivo es " + archivo.length() + " bytes");
    }
}
