import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Test{
public static void imprimirTablero(String [][]tablero){
        for (int i=0;i<tablero.length;i++ ) {
        	for (int j=0;j<tablero[i].length;j++ ) {
        		System.out.print(String.format("%4s",tablero[i][j]+" "));
        	}
        	System.out.println("\n");
        }
	}

public static void dibujar(String [][]tablero,int opcion,String dibujo){

for(int i = 0; i < tablero.length; i++){
   for(int j = 0; j < tablero[i].length; j++){
      if(tablero[i][j].equals(String.valueOf(opcion))){
         tablero[i][j]=dibujo;
      }
   }
 }

}    

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

String [][]tablero=new String [8][8];

int numero=1;
int opcion=0;
int lose=0;
int puntuacion=0;

ArrayList<Integer> list = new ArrayList<>();
ArrayList<Integer> marcados=new ArrayList<>();

int [] explosivos=new Random().ints(1,64).distinct().limit(10).toArray();

for (int i=0;i<explosivos.length;i++ ) {
	list.add(explosivos[i]);	
	}	
 
 for (int i=0;i<tablero.length;i++ ) {
        	for (int j=0;j<tablero[i].length;j++ ) {
        		tablero[i][j]=String.valueOf(numero);
        		numero++;
        	}
        }


  while(lose!=8&&puntuacion!=540){
  System.out.println("JUEGO DE BUSCAMINAS\n");
  System.out.println("Buscaminas:   "+"Puntaje:  000"+puntuacion+"   Minas: 0"+lose+"\n");	
 
  imprimirTablero(tablero); 
 

  do{
  System.out.println("\nElije un numero\n");
  opcion=sc.nextInt();
  if(marcados.contains(opcion)){
    System.out.println("posicion ya ingresada");
    opcion=sc.nextInt();
  }
  }while(opcion==0||opcion>64);

  marcados.add(opcion);

  if(list.contains(opcion)){
  dibujar(tablero,opcion,"x");
  System.out.println("\nEncontraste una mina\n");
  lose++;
  if(lose==8){
  	System.out.println("Buscaminas:   "+"Puntaje:  000"+puntuacion+"   Minas: 0"+lose+"\n");	
    dibujar(tablero,opcion,"x");
    imprimirTablero(tablero);
  }
  System.out.println("\n");
  }else{
  dibujar(tablero,opcion,"o");
  puntuacion+=10;
  if(puntuacion==540){
  	System.out.println("Buscaminas:   "+"Puntaje:  000"+puntuacion+"   Minas: 0"+lose+"\n");	
    dibujar(tablero,opcion,"o");
    imprimirTablero(tablero);
  }
  System.out.println("\n");

}
}

if(lose==8){
  System.out.println("Has perdido!!!");
}else{
  System.out.println("Has Ganado!!");
}


}

}
