import java.util.Scanner;
import java.util.ArrayList;

public class Michi{

static void dibuja(String [][] tablero){

    for (int i=0;i<tablero.length;i++) {
    for (int j=0;j<tablero[i].length;j++ ) {
    System.out.print(tablero[i][j]);
   
    }
    System.out.println("");
       
   }

}

static String winCondition(String[][]tablero){

String validar=null;

if(tablero[0][1].equals(tablero[0][3])&&tablero[0][1].equals(tablero[0][5])){
       validar="Ganador: "+tablero[0][1];
}else if(tablero[2][1].equals(tablero[2][3])&&tablero[2][1].equals(tablero[2][5])){
       validar="Ganador: "+tablero[2][1];
}else if(tablero[4][1].equals(tablero[4][3])&&tablero[4][1].equals(tablero[4][5])){
       validar="Ganador: "+tablero[4][1];       
}else if(tablero[0][1].equals(tablero[2][1])&&tablero[0][1].equals(tablero[4][1])){
       validar="Ganador: "+tablero[0][1]; 
}else if(tablero[0][3].equals(tablero[2][3])&&tablero[0][3].equals(tablero[4][3])){
       validar="Ganador: "+tablero[0][3];
}else if(tablero[0][5].equals(tablero[2][5])&&tablero[0][5].equals(tablero[4][5])){
       validar="Ganador: "+tablero[0][5];
}else if(tablero[0][1].equals(tablero[2][3])&&tablero[0][1].equals(tablero[4][5])){
       validar="Ganador: "+tablero[0][1];
}else if(tablero[0][5].equals(tablero[2][3])&&tablero[0][5].equals(tablero[4][1])){
       validar="Ganador: "+tablero[0][5];                     
}
return validar;

}
public static void main(String[] args) {

ArrayList<Integer>lista=new ArrayList<>();
int opcion=0;     

Scanner sc=new Scanner(System.in);
 
   String [] arre1={"  ","1"," | ","2"," | ","3"};
   String [] arre2={"  ","-- ","---"," --"};
   String [] arre3={"  ","4"," | ","5"," | ","6"};
   String [] arre4={"  ","-- ","---"," --"};
   String [] arre5={"  ","7"," | ","8"," | ","9"};
   
   String [][] tablero={arre1,arre2,arre3,arre4,arre5};

   System.out.println("MICHI");
   System.out.println("=====\n\n");

   dibuja(tablero);
   int turno=1;
   boolean winner=false;

   while(turno<=9&&winCondition(tablero)==null){
   System.out.println("\n\nEmpezo su turno,seleccione una casilla");

   try{

   opcion=sc.nextInt();

  }catch(Exception e){
     System.out.println("\nOpcion invalida\n");
     sc.nextLine();
   }


   if(!lista.contains(opcion)){
   lista.add(opcion);
   switch(opcion){
    case 1:
    if(turno%2==0){
         tablero[0][1]="X";
         }else{
         tablero[0][1]="O";
         }
         turno++;
    break;
    case 2:
    if(turno%2==0){
         tablero[0][3]="X";
         }else{
         tablero[0][3]="O";
         }
         turno++;
    break;
    case 3:
    if(turno%2==0){
         tablero[0][5]="X";
         }else{
         tablero[0][5]="O";
         }
         turno++;        
    break;
    case 4:
    if(turno%2==0){
         tablero[2][1]="X";
         }else{
         tablero[2][1]="O";
         }
         turno++;
    break;
    case 5:
    if(turno%2==0){
         tablero[2][3]="X";
         }else{
         tablero[2][3]="O";
         }
         turno++;
    break;
    case 6:
    if(turno%2==0){
         tablero[2][5]="X";
         }else{
         tablero[2][5]="O";
         }
         turno++;
    break;
    case 7:
    if(turno%2==0){
         tablero[4][1]="X";
         }else{
         tablero[4][1]="O";
         }
         turno++;
    break;
    case 8:
    if(turno%2==0){
         tablero[4][3]="X";
         }else{
         tablero[4][3]="O";
         }
         turno++;
    break;
    case 9:
    if(turno%2==0){
         tablero[4][5]="X";
         }else{
         tablero[4][5]="O";
         }
         turno++;
    break;
                  

   }
}else{
     System.out.println("\nPosicion ya tomada\n");
}

   dibuja(tablero);

 }
if(winCondition(tablero)!=null){
System.out.println("\n\nResultados del juego:\n" +winCondition(tablero));
}else{
System.out.println("Empate");
}
}

}
