// Definir una función para invertir una cadena de caracteres (texto).

public class InversionCadenaCaracteres {

    public static void main(String[] args) {
        
        String texto = "12345";
        System.out.println(texto);
        
        System.out.println();
        
        String textoInvertido = invertirTexto(texto);
        System.out.println(textoInvertido);
    }
    
    public static String invertirTexto(String texto) {
        char[] caracteres = texto.toCharArray();
        String resultado = "";
        
        for(int i = caracteres.length - 1; i >= 0; --i) {
            resultado += caracteres[i];
        }
        
        return resultado;
    }
}
