import java.util.Arrays;
public class unidad5{
//ejercicio1
  public static int venta_total(int []arreglo){
  int totalventas=0;
  for(int i=0;i<arreglo.length;i++){
  totalventas+=arreglo[i];
  }return totalventas;
	}

  public static double cuota_superada(int[]arreglo){
  double cont=0;
  double porcentaje_superado=0;
  int cuota=5;
  for(int i=0;i<arreglo.length;i++){
  if(arreglo[i]>cuota){
  cont++;
  }porcentaje_superado=(cont*100)/arreglo.length;

  }return porcentaje_superado;
	}
  public static String vendedores_cuota_superada(int[]ventas,String vendedores[]){
  int cuota=5;
  String cadena="";
  for(int i=0;i<ventas.length;i++){
  if(ventas[i]>cuota){
  cadena+=vendedores[i]+" ";
  }
  }return cadena;
  }
  public static int comision_total(int[]arreglo){
  int comision=venta_total(arreglo)*300;
  return comision;
  }
//ejercicio2
  public static int[]total_de_platos(int []nacional,int[]extranjero){
  int[]platos_acumulados=new int[nacional.length];

  for(int i=0;i<nacional.length;i++){
  platos_acumulados[i]=nacional[i]+extranjero[i];
  }return platos_acumulados;
  } 
  public static double[]porcentaje(int [] nacional,int [] extranjero){
  double totalDePlatos=176000; 	
  double[]porcentaje=new double[total_de_platos(nacional,extranjero).length];

  for(int i=0;i<total_de_platos(nacional,extranjero).length;i++){
  porcentaje[i]=(total_de_platos(nacional,extranjero)[i])*100/totalDePlatos;

  }return porcentaje;

  }
  public static String imprime_arreglo(double[]arreglo){
  String cadena="";
  for(int i=0;i<arreglo.length;i++){
    cadena+=String.format("%.2f",arreglo[i])+"% ";
  }return cadena;
  }
  public static String platoMasVendido(int[]nacional,int[]extranjero,String[]platos){
   int mayor=0;
   String plato="";
   for(int i=0;i<nacional.length;i++){
      if(total_de_platos(nacional,extranjero)[i]>mayor){
         mayor=total_de_platos(nacional,extranjero)[i];
         plato=platos[i];
      }
   }return plato;

  }
//ejercicio3

 public static double costoTotalCarrera(String[]carreras,double[]costoTotal,String carrera){
 double costo=0;
 for(int i=0;i<carreras.length;i++){
 if(carreras[i].equals(carrera)){
 costo=costoTotal[i];
 }
 }return costo;
 }
 public static double descuentoPorCarrera(String[]carreras,double[]descuento,String carrera){
 double descuentos=0;
 for(int i=0;i<carreras.length;i++){
 if(carreras[i].equals(carrera)){
 descuentos=descuento[i];
 }
 }return descuentos;
 }
 public static double cuotaMensual(String codigo){
  String[]carreras={"Sistemas","Industrial","Administracion","Negocios"};
  double[]costoTotal={45000,48000,39000,41000};
  double[]descuento={10,15,12,8};
  String[]codigos={"p067","p026","p054","p039"};
  double cuotaMes=0;
  for(int i=0;i<carreras.length;i++){
  if(codigos[i].equals(codigo)){
   cuotaMes=(costoTotalCarrera(carreras,costoTotal,carreras[i])-costoTotalCarrera(carreras,costoTotal,carreras[i])*0.10)/48;
  } 
  }return cuotaMes;
 }
 public static String postulanteCuotaMayor(double[]costoTotal,double[]descuento,String[]nombres,String[]apellidos){
 String postulante="";
 double mayor=0;
 double[]cuotaMayor=new double [descuento.length];
 for(int i=0;i<descuento.length;i++){
 cuotaMayor[i]=costoTotal[i]-(costoTotal[i]*(descuento[i]*0.01));
 if(cuotaMayor[i]>mayor){
 mayor=cuotaMayor[i];
 postulante=nombres[i]+" "+ apellidos[i];
 }

 }return postulante;

 } 
//ejercicio4
  static double puntajePromedio(String nombreRestaurtante){
double[]calificacionPromedio={3.6,1.4,4.5,2.2,5};
String[]restaurante={"El escondinte","Pintamar","Fuerza Mancora","Jorge 2","Embarcadero"};

double puntaje=0;
for (int i=0;i<calificacionPromedio.length ;i++ ) {
  if(restaurante[i].equals(nombreRestaurtante)){
     puntaje=calificacionPromedio[i]; 
  }
}return puntaje;
  } 
 /* static double porcentajeExcelente(double[]calificacionPromedio){
int [] calificacion={5,4,3,2,1};
String[]definicion={"Excelente","Buena","Regular","Mala","Pesima"};



  }*/

  public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
}

public static void main(String[] args) {
//Resultado1
   /*int [] ventas={15,16,1,0,4,15,13};
	String [] vendedores={"hugo","mariana","luis","jenifer","jorge","valeria","manuel"};
	System.out.println("El total de unidades vendidas durante el presente mes es: "+venta_total(ventas));
	System.out.println(String.format("El porcentaje de vendedores que superaron la cuota de venta fue de: "+"%.2f",cuota_superada(ventas))+" %");
	System.out.println("Los vendedores que superaron la cuota son: "+vendedores_cuota_superada(ventas,vendedores));
	System.out.println("La comision total a pagar este mes es :"+comision_total(ventas)+" soles ");*/
//Resultado2
    /*String [] platos={"Lomo saltado","Aji de gallina","Papa rellena","Seco de fijoles",
    "Pollo a la brasa"};
    int[]nacional={25000,18600,14400,12000,30000};
    int[]extranjero={10000,5000,200,800,60000};
    System.out.println(Arrays.toString(total_de_platos(nacional,extranjero)));
    System.out.println("[ "+imprime_arreglo(porcentaje(nacional,extranjero))+"]");
    System.out.println("El plato mas vendido fue el "+ platoMasVendido(nacional,extranjero,platos));*/
//Resultado3
  /*String[]carreras={"Sistemas","Industrial","Administracion","Negocios"};
  double[]costoTotal={45000,48000,39000,41000};
  double[]descuento={10,15,12,8};
  String[]codigos={"p067","p026","p054","p039"};
  String[]nombres={"Carlos","Gisella","Jose","Sofia"};
  String[]apellidos={"Torres","Jimenez","Garcia","Gamboa"};
  System.out.println(costoTotalCarrera(carreras,costoTotal,"Negocios"));
  System.out.println(descuentoPorCarrera(carreras,descuento,"Negocios"));
  System.out.println(cuotaMensual("p067"));
  System.out.println(postulanteCuotaMayor(costoTotal,descuento,nombres,apellidos));*/
//Resultado4
System.out.println(puntajePromedio("Pintamar"));

double data= 1.6;
int value=(int)data;
System.out.println(formatearDecimales(3.6,0));

double mivalor=3.6;


    

}}