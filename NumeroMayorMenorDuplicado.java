public class NumeroMayorMenorDuplicado{

//mostrar datos duplicados,menor y mayor

public static String duplicado (int[]arreglo){
int cont=0;
String cadena="";
for(int i=1; i<arreglo.length; i++){
if(arreglo[i-1]==arreglo[i]){
cadena+=String.valueOf(arreglo[i])+" ";
}
}return cadena;
}

public static int menor(int []arreglo){
		int menor=1000;
   for(int i=0;i<arreglo.length;i++){
      if(arreglo[i]<menor){
      	menor=arreglo[i];
      }      
   }return menor;

	}

public static int mayor(int []arreglo){
int mayor=0;
for(int i=0;i<arreglo.length;i++){
if(arreglo[i]>mayor){
mayor=arreglo[i];
}
}return mayor;
}	

public static void main(String[] args){
int[] arreglo={18,18,12,9,9,6,21,2,2,1};


System.out.println(duplicado(arreglo));
System.out.println(menor(arreglo));
System.out.println(mayor(arreglo));

}}

          
   


      
    
