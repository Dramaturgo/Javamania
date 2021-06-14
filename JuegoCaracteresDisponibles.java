

import java.nio.charset.Charset;

//Mostrar el listado de todos los juegos de caracteres disponibles en el sistema.

public class JuegoCaracteresDisponibles {

    public static void main(String[] args) {
        
        for(String juegoCaracteres : Charset.availableCharsets().keySet()) {
            System.out.println(juegoCaracteres);
        }
    }
}
