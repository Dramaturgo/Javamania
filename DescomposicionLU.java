import java.util.Arrays;
import java.util.Scanner;


public class DescomposicionLU{

//codificar el metodo  de descomposicion LU

public static void main(String[] args) {

Scanner dc=new Scanner(System.in);

System.out.println("ESTA ES UNA MATRIZ DE 3 x 4");
System.out.println("Ingrese valores para la matriz");
//{2,-1,1,2},{-1,3,3,3},{2,1,4,1}
double [][]matriz=new double [3][4];

for (int x=0;x<3;x++ ) {
	for (int y=0;y<4;y++ ) {
        matriz[x][y]=dc.nextDouble();
	}
}
	int n=3;
	int i=0;
	int j=0;
	int k=0;
	int l=0;

// ADELANTE

	for (j=1;j<n+1;j++) 
		matriz[0][j]=matriz[0][j]/matriz[0][0];

     for (k=1;k<n;k++ ) 
        {
     	 for (i=k;i<n;i++ ) 
     	 	for (l=0;l<k;l++ ) 
     	 		matriz[i][k]=matriz[i][k]-matriz[i][l]*matriz[l][k];
                    
     	         for (j=k+1;j<n+1;j++ ) 
     	            {
     	              for (l=0;l<k;l++ )
     	    	        matriz[k][j]=matriz[k][n]-matriz[k][l]*matriz[l][j];			

                           matriz[k][j]=matriz[k][j]/matriz[k][k];

     	 	}
     	 }
     	
  
        //sustitucion para atras
        for (k=n-1;k>=0;--k) 
        {
          for (l=k+1;l<n;l++ )
            {
          	  matriz[k][n]=matriz[k][n]-matriz[k][l]*matriz[l][n];	
          	 }	 
        }
	   System.out.println("\n");
       System.out.println(Arrays.deepToString(matriz)+"\n");


       //imprime resultados
       
     for (i=0;i<n;i++ ) {
      	System.out.println("x["+i+"]= "+matriz[i][n]);
      } 


  }
 }

