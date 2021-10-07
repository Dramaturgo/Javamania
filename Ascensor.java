import java.util.Scanner;

public class Ascensor{

//Metodo que imite la actividad de un ascensor donde 0 termina la operacion 
public static void main(String[] args)throws InterruptedException {

Scanner ic=new Scanner(System.in);	
	
String []pisos={"PISO 1","PISO 2","PISO 3","PISO 4","PISO 5","PISO 6","PISO 7","PISO 8","PISO 9","PISO 10"};

int pisoActual=1;
int pisoSolicitado=1;
while(pisoActual!=0&&pisoSolicitado!=0){
System.out.println("\nEn que piso se encuentra?");
 pisoActual=ic.nextInt();

System.out.println("A que piso quiere ir?");
 pisoSolicitado=ic.nextInt();

if (pisoSolicitado==pisoActual&&pisoSolicitado!=0&&pisoActual!=0){
	System.out.println("Usted ya encuentra en encuentra en ese piso\n");
	System.out.println("A que piso quiere ir?");
    pisoSolicitado=ic.nextInt();
}

 if (pisoSolicitado>pisoActual) {
 	 System.out.println("\nEstamos en el "+pisos[pisoActual-1]);
 	 System.out.println("Cerrando Puertas");
      for (int i=0;i<pisoSolicitado-pisoActual;i++ ) {
  	   System.out.println("Subiendo......\n");
  	   Thread.sleep(3000);
       System.out.println("\nLLegamos al " +pisos[pisoActual+i]);
	     
     }
      System.out.println("\nHemos LLegado al Piso Solicitado");
      System.out.println("Abriendo Puertas");
}

 if (pisoSolicitado<pisoActual) {
 	 System.out.println("\nEstamos en el "+pisos[pisoActual-1]);
 	 System.out.println("Cerrando Puertas");
      for (int j=0;j<pisoActual-pisoSolicitado;j++ ) {
      	System.out.println("Bajando....\n");
      	Thread.sleep(3000);
      	System.out.println("\nLlegamos al "+pisos[(pisoActual-j)-2]);
      }
      System.out.println("\nHemos LLegado al piso solicitado");
      System.out.println("Abriendo Puertas");
 }
}
System.out.println("ERROR EN EL SISTEMA");

}

}

