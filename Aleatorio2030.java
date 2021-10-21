/*Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 20 y 30, indica cuál es el mayor de todos
Me queda saber como hacer que sean numeros aleatorios que entre 20 y 30 y saber cual es el mayor de todos, se poner que el ultimo sea 30 pero no que el primero.*/

import java.util.*;

public class random{

public static void main(String[] args) {
	Random numAleatorio = new Random();
	Scanner teclado =new Scanner(System.in);

 System.out.println("Inserte el numero de posiciones del array: ");
 int posicion = teclado.nextInt();
 int num[]= new int [posicion];
 int mayor=0;


 for (int i=0;i<num.length;i++ ) {
 	//num[i]=numAleatorio.nextInt(30-20+1) + 20;
 	num[i]= (int) (Math.random() * (30-20+1)+20);
 }
 
 for (int j=0;j<num.length;j++ ) {
		if(num[j]>mayor){
          mayor=num[j];
		}
	}	

	System.out.println(Arrays.toString(num));
	System.out.println("El mayor de todo es :"+ mayor);
}
}
