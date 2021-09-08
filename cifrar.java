import java.util.Scanner;
public class cifrar{


static int descifrar(int numeroCifrado){

String cifrado="";
String descifrarOrden="";

if(String.valueOf(numeroCifrado).length()==3){
    cifrado="0"+String.valueOf(numeroCifrado);

}else
   cifrado=String.valueOf(numeroCifrado);


descifrarOrden=String.valueOf(String.valueOf(cifrado).charAt(2))+String.valueOf(String.valueOf(cifrado).charAt(3))+String.valueOf(String.valueOf(cifrado).charAt(0))+String.valueOf(String.valueOf(cifrado).charAt(1));

int digi1=(Character.getNumericValue(descifrarOrden.charAt(0)));
int digi2=(Character.getNumericValue(descifrarOrden.charAt(1)));
int digi3=(Character.getNumericValue(descifrarOrden.charAt(2)));
int digi4=(Character.getNumericValue(descifrarOrden.charAt(3)));

int [] digitos={digi1,digi2,digi3,digi4};


for (int i=0;i<digitos.length;i++ ) {
	if (digitos[i]<7) {
		
		digitos[i]+=10;
	}
}


int numeroDescifrado=Integer.parseInt(String.valueOf(digitos[0]-7)+String.valueOf(digitos[1]-7)+String.valueOf(digitos[2]-7)+String.valueOf(digitos[3]-7));



return numeroDescifrado;

}
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);

System.out.println("Digite numero de 4 cifras");
int numeroAcifrar=sc.nextInt();

while (String.valueOf(numeroAcifrar).length()!=4) {
	System.out.println("\nNumero no valido,Ingrese Nuevamente\n");
	numeroAcifrar=sc.nextInt();
}

int dig1=(Character.getNumericValue(String.valueOf(numeroAcifrar).charAt(0))+7)%10;
int dig2=(Character.getNumericValue(String.valueOf(numeroAcifrar).charAt(1))+7)%10;
int dig3=(Character.getNumericValue(String.valueOf(numeroAcifrar).charAt(2))+7)%10;
int dig4=(Character.getNumericValue(String.valueOf(numeroAcifrar).charAt(3))+7)%10;
int numeroCifrado=(dig3*1000)+(dig4*100)+(dig1*10)+dig2;


System.out.println("El Numero Cifrado es: "+numeroCifrado);

System.out.println("El Numero Descifrado es: "+descifrar(numeroCifrado));




	
}

}