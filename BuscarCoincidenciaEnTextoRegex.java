import java.util.regex.Matcher;
import java.util.regex.Pattern;

//busqueda de coincidencia de un dato String en una cadena de texto

public class BuscarCoincidenciaEnTextoRegex{

	public static void main(String[] args) {
Pattern pat = Pattern.compile("ola");
String input = "la caracola dice hola a la paloma";
Matcher mat = pat.matcher(input);
if (mat.find()) {
    System.out.println("regex encontrada");
} else {
    System.err.println("regex NO encontrada");

	}

}

}