public class sumaDeDigitos{

// Sumar los digitos de un numero dado
static int sum(int numero){
int sumas=0;
String sumita=String.valueOf(numero);
for (int i=0;i<sumita.length();i++ ) {
	sumas+=Integer.parseInt(String.valueOf(sumita.charAt(i)));
}

return sumas;

}

 public static int sumaDeNumeros(int n){
        if (n <= 9) {
            return n;
        }
        else
        {
            return ((n % 10) + sumaDeNumeros(n/10));
        }
    }
public static void main(String[] args) {
	
   int numero=1234;


   System.out.println(sum(1234));
   System.out.println(sumaDeNumeros(1234));


}
}
