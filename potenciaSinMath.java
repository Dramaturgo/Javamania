public class potenciaSinMath{

// desarrolle un metodo de potencia sin usar MathPow

public static int potencia(int base,int exponente){
int potencias=1;

for(int i =1;i<exponente+1;i++){
potencias=potencias*base;
}
return potencias;
	}
public static void main(String[] args) {

	System.out.println(potencia(2,5));
	
}
}