
// Definir una función para concatenar la palabra más corta y más extensa de una frase.
//split() divide una cadena en partes que el usuario decida 
public class CadenaCortaLargaSplit {

    public static void main(String[] args) {
        
        String frase = "Python es un lenguaje de programación multiparadigma";
        
        String resultado = concatenarCortaLargaCadena(frase);
        
        System.out.println(resultado);  // esmultiparadigma
    }
    
    public static String concatenarCortaLargaCadena(String frase) {
        String[] palabras = frase.split(" ");
        
        String corta = palabras[0];
        String extensa = palabras[0];
        
        for (int i = 1; i < palabras.length; i++) {
            String palabra = palabras[i];
            
            if (palabra.length() < corta.length()) {
                corta = palabra;
            }
            
            if (palabra.length() > extensa.length()) {
                extensa = palabra;
            }
        }
        
        return corta + extensa;
    }
}
