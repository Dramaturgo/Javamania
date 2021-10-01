import java.util.Scanner;
import java.util.Arrays;


public class VocalesEnComun{
 //Crear un metodo que devuelva las letras en comun de dos arreglos tipo String
public static String comun(String palabra1,String palabra2){
String comunes="";

for (int i = 0; i < palabra1.length(); i++) {
    for (int j = 0; j < palabra2.length(); j++) {
      if (palabra1.charAt(i)==palabra2.charAt(j)) {
           if (!comunes.isEmpty()) {
               comunes+=", ";
           }
           comunes +=palabra2.charAt(j);
        break;
   }
   }
  } return comunes;
}

   public static void main(String[] args) {
    

System.out.println(comun("naruto","puto"));

}}
