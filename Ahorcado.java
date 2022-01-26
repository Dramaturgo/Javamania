

import java.util.Scanner;
//Realiza el juego ahorcado 

public class Ahorcado{

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
    break;
    }
   }

public static void main(String[] args) {
	
        Scanner s = new Scanner(System.in);
        int vidas = 6;
        String palabra;
        int aciertos = 0;
        int tamaño;
        String opcion;
        int contador = 0;
        String[] palabras = new String[]{"lapiz", "goma", "libreta", "maestro", "examen", "matematicas"};
        char[] respuesta;
        palabra = palabras[(int) (Math.random() * 5)];
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
            if (palabra.contains(opcion)) {
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
            System.out.println("\nGanaste!!");
             
        }
    }
   
}