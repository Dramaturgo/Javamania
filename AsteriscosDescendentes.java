import java.util.Scanner;

public class AsteriscosDescendentes {

 // clase que imprime asteriscos de forma descendente
      
    public static void main(String args[]) { 

  Scanner sc=new Scanner(System.in);


System.out.println("Ingrese un numero");

int numero=sc.nextInt();
int aux=numero;

for (int i=0;i<numero;i++ ) {
    for (int j=aux;j>0;j-- ) {
        System.out.print("* ");
    }
    aux--;
    System.out.println("");
}

    }
}
