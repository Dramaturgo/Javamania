import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class SumayRestaRegex{
public static void main(String[] args) { 
Scanner sc=new Scanner (System.in);
System.out.println("Ingrese su operacion");
String operacion = sc.next();
Pattern pattern = Pattern.compile("[+-]?[0-9]+");
Matcher matcher = pattern.matcher(operacion);
Integer suma = 0;
while (matcher.find()) {
    suma += Integer.valueOf(matcher.group());
}
System.out.println(suma);
}}
