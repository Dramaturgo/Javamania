import java.util.Arrays;

public class LlenasAsteriscos{

    //Algoritmo que reciba un arreglo de 3 numeros entre el 1-10 cada numero del arreglo
    //ingrese (*) en el arreglo y luego lo imprima 

	public static String [][] dibujo(int [] arreglo){           
           String[][]matriz=new String[3][10];

          for (int i=0;i<matriz.length;i++ ) {
          	   for (int j=0;j<matriz[i].length;j++ ) {
          	   	  for (int k=0;k<arreglo[i];k++ ) {
          	   	  	  matriz[i][k]="*";
          	   	  }
          	   	   
          	   }
          } return matriz;

		}   
	public static void main(String[] args) {
    int [] arreglo=new int[3];
       for (int i=0;i<arreglo.length;i++ ) {
       	   arreglo[i]=(int)(Math.random()*10+1);
       }        
        System.out.println(Arrays.toString(arreglo)+"\n");
        for (int x=0; x < dibujo(arreglo).length; x++){
        for (int y=0; y < dibujo(arreglo)[x].length; y++){          
             if(dibujo(arreglo)[x][y]!=null){
              System.out.print("  " + dibujo(arreglo)[x][y]+ "  ");   
        }
    }
        System.out.println("\n");
   }
}
}