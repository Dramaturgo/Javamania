
import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;


public class Random {
    static String palabra;
    static void dibujar(int i){
    switch(i){
       
    case 6:
    	System.out.println("        +-----+");
        System.out.println("        |     |"); 
        for (int k=0;k<5;k++) {
        System.out.println("              |");   	
           }   
        System.out.println("================");

    break;
    case 5:
    	System.out.println("        +-----+");
        System.out.println("        |     |"); 
        System.out.println("        O     |");
        for (int k=0;k<4;k++ ) {
        System.out.println("              |");	
        }
        System.out.println("================");
    break;
    case 4:
      	System.out.println("        +-----+");
        System.out.println("        |     |"); 
        System.out.println("        O     |");
        System.out.println("        |     |");
        for (int k=0;k<3;k++ ) {
        System.out.println("              |");	
        }
        System.out.println("================");
    break;
    case 3:
        System.out.println("        +-----+");
        System.out.println("        |     |"); 
        System.out.println("        O     |");
        System.out.println("       /|     |");
        for (int k=0;k<3;k++ ) {
        System.out.println("              |");	
        }
        System.out.println("================");
    break;
    case 2:
        System.out.println("        +-----+");
        System.out.println("        |     |"); 
        System.out.println("        O     |");
        System.out.println("       /|\\    |");
        for (int k=0;k<3;k++ ) {
        System.out.println("              |");	
        }
        System.out.println("================");
    break;
    case 1:
        System.out.println("        +-----+");
        System.out.println("        |     |"); 
        System.out.println("        O     |");
        System.out.println("       /|\\    |");
        System.out.println("       /      |");
        for (int k=0;k<2;k++ ) {
        System.out.println("              |");	
        }
        System.out.println("================");
    break;
    case 0:
        System.out.println("        +-----+");
        System.out.println("        |     |"); 
        System.out.println("        O     |");
        System.out.println("       /|\\    |");
        System.out.println("       / \\    |");
        for (int k=0;k<2;k++ ) {
        System.out.println("              |");	
        }
        System.out.println("================"); 
        System.out.println("---GAME OVER---");
        System.out.println("\nLa palabra era: "+palabra);    
    break;
   case -1:
        System.out.println("        +-----+");
        System.out.println("        |     |"); 
        System.out.println("  \\o/         |");
        System.out.println("   |          |");      
        System.out.println("  / \\         |");      
        System.out.println("================");
        System.out.println("  GANASTE!!   ");

    break;
    }
   }

   static String palabraRandom()throws IOException{
      
   StringBuilder result = new StringBuilder();
      URL url = new URL("https://palabras-aleatorias-public-api.herokuapp.com/random");
      HttpURLConnection conn = (HttpURLConnection) url.openConnection(); 
      conn.setRequestMethod("GET");
      try (var reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
      for (String line; (line = reader.readLine()) != null; ) {
        result.append(line);
       }
     }catch(Exception e){
         System.out.println("Error");
      }
      
     Pattern pattern=Pattern.compile("Word\":\\s\"(.*?)\",");
     Matcher matcher = pattern.matcher(result);

      String encontrar="";
    if (matcher.find()) {
   
      encontrar = matcher.group(1);
    
       }return encontrar;

   }

public static void main(String[] args) throws IOException{
        ArrayList<String>aux=new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int vidas = 6;
        int aciertos = 0;
        int tamaño;
        String opcion;
        int contador = 0;
        String[] palabras = new String[]{"lapiz", "goma", "libreta", "maestro", "examen", "matematicas"};
        char[] respuesta;
        palabra = palabraRandom();
        tamaño = palabra.length();
        respuesta = new char[tamaño];
         
         
        for (int i = 0; i<tamaño; i++) {
            respuesta[i] = 'X';
        }

 
        while (aciertos != tamaño && vidas != 0) {
            System.out.println("\nIntentos :"+vidas +"   Aciertos: "+aciertos);
            dibujar(vidas);
            System.out.println("");
            for (int i = 0; i<tamaño; i++) {
 
                System.out.print(" "+respuesta[i]);
            }
            System.out.println("");
            System.out.println("\nIngresa una letra: ");
            opcion = s.next();
            
            if (palabra.contains(opcion)&&!aux.contains(opcion)) {
                aux.add(opcion);
                for (int i = 0; i <tamaño; i++) {
                    if (palabra.charAt(i) == opcion.charAt(0)) {
                        respuesta[i] = opcion.charAt(0);
                        contador++;
                    }
                }
 
                aciertos = aciertos + contador;
            } else {
                vidas--;
            }
 
            contador = 0;
        }
        if(vidas==0){
            dibujar(vidas);
        }else
        {
            System.out.println("");
            for (int i = 0; i < tamaño; i++) {
 
                System.out.print(respuesta[i]);
            }
           System.out.println("\n"); 
           System.out.println("La palabra era : " + palabra);
           dibujar(-1);

           
             
        }

      
}     

    }

