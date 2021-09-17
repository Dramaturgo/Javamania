public class DevaluacionSecuenciales{

//Desarrolle un metodo que aplique una devaluacion diferente por cada año que pase

static double devaluacionDeAutos(double precio,int tiempo){
Integer tiempoMaximo = Integer.MAX_VALUE;
for (int i=1;i<=tiempo;i++ ) {
    if (i>=0) {
		precio-=(precio*0.0);
		  }if (i>=1&&i<3) {
		     precio-=(precio*0.10);
	         } if (i>=3&&i<5) {
		        precio-=(precio*0.15);
	           }if(i>=5&&i<tiempoMaximo){
                  precio-=(precio*0.18);
	         }
}
return Math.round(precio*100)/100.0;
}

public static void main(String[] args) {
	
    System.out.println(devaluacionDeAutos(5000,4));

}}
