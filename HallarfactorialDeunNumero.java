
public class HallarfactorialDeunNumero{

// Metodo recursivo para hallar factorial de un numero

static double factoria (double numero) {

  if (numero==0)
    return 1;
  else
    return numero * factoria(numero-1);
}
public static void main(String[] args) {


	System.out.println(factoria(40));

	}
}