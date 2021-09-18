import java.util.Scanner;

public class gatoAdivinator{
//Realize una variante del juego de 21 cartas por consola
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("ADIVINARE EL NUMERO QUE ELEGISTE xD!!? \n");

    int [] baraja1=new Random().ints(1, 7).distinct().limit(3).toArray();
    int [] baraja2=new Random().ints(8, 15).distinct().limit(3).toArray();
    int [] baraja3=new Random().ints(16, 23).distinct().limit(3).toArray();
    int [] baraja4=new Random().ints(24, 31).distinct().limit(3).toArray();
    int [] baraja5=new Random().ints(32, 39).distinct().limit(3).toArray();
    int [] baraja6=new Random().ints(40, 47).distinct().limit(3).toArray();
    int [] baraja7=new Random().ints(48, 52).distinct().limit(3).toArray();

   int baraja[][]={baraja1,baraja2,baraja3,baraja4,baraja5,baraja6,baraja7};
 
   int columnaSeleccionada = 0;
        int numeroDeSelecciones = 0;
        do {
            mostrarCartas(baraja);
            System.out.println("\nIndica la columna en la que se encuentra el elemento que has pensado(1,2,3):");
            columnaSeleccionada = sc.nextInt();
            numeroDeSelecciones++;
            System.out.println("Seleccionaste la columna " + columnaSeleccionada+"\n\n");
            //Cuando se haya seleccionado por tercera vez la columna entonces se
            //rombpe el ciclo porque no es necesario seguir revolviendo
            if (numeroDeSelecciones == 3) {
                break;
            }

            //Se declara un vector unidimensional para recoger todos los baraja
            int[] cartasRecogidas = new int[baraja.length * baraja[0].length];
            //Se declara un vector para especificar el orden para recorger las columnas
            //teniendo en cuenta que siempre la columna seleccionada debe recogerse de segunda
            //y no importa la columna que se elija para recoger de primera o tercera.
            int[] ordenParaRecorgerColumnas = new int[3];
            if (columnaSeleccionada == 1) {
                ordenParaRecorgerColumnas[0] = 2;
                ordenParaRecorgerColumnas[1] = columnaSeleccionada;
                ordenParaRecorgerColumnas[2] = 3;
            } else if (columnaSeleccionada == 2) {
                ordenParaRecorgerColumnas[0] = 1;
                ordenParaRecorgerColumnas[1] = columnaSeleccionada;
                ordenParaRecorgerColumnas[2] = 3;
            } else if (columnaSeleccionada == 3) {
                ordenParaRecorgerColumnas[0] = 1;
                ordenParaRecorgerColumnas[1] = columnaSeleccionada;
                ordenParaRecorgerColumnas[2] = 2;
            }
            //Se recogen todos los baraja y se añaden al vector unidimensional
            int posbarajaRecogidos = -1;
            for (int i = 0; i < ordenParaRecorgerColumnas.length; i++) {
                int columnaParaRecoger = ordenParaRecorgerColumnas[i];
                for (int itFila = 0; itFila < baraja.length; itFila++) {
                    posbarajaRecogidos++;
                    int numeroCarta = baraja[itFila][columnaParaRecoger - 1];
                    cartasRecogidas[posbarajaRecogidos] = numeroCarta;
                }
            }
            /////se vuelven a colocar las cartas en columnas
            posbarajaRecogidos = -1;
            for (int i = 0; i < baraja.length; i++) {
                for (int j = 0; j < baraja[i].length; j++) {
                    posbarajaRecogidos++;
                    baraja[i][j] = cartasRecogidas[posbarajaRecogidos];
                }
            }
        } while (true);
        //Siempre el elemento seleccionado se ubica en la cuarta fila(index 3) de la columna seleccionada
        System.out.println("\nTu numero es " + (baraja[3][columnaSeleccionada - 1])+"  chan chan chan!!!");

    }

    static void mostrarCartas(int[][] cartas) {
        for (int i = 0; i < cartas.length; i++) {
              System.out.print("|");
            for (int j = 0; j < cartas[i].length; j++) {
                System.out.print(cartas[i][j] + "\t"+"|");
            }
            System.out.println("");
        }
    }
}
