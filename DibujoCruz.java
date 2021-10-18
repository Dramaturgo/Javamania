public class DibujoCruz{

// metodo que dibujer una cruz con arreglos bidimenional
public static void cruz(int vertical,int horizontal){
        System.out.println("Dibujando cruz\n");
        char array[][];
        array = new char[vertical][horizontal];
        System.out.println();
        if (array.length%2==0){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == array.length/2 || j == array[0].length/2 || j == (array[0].length/2)-1 || i == (array.length/2)-1){
                        array[i][j] = '*';
                    }else {
                        array[i][j] = ' ';
                    }
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
        }else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == array.length/2 || j == array[0].length/2){
                        array[i][j] = '*';
                    }else {
                        array[i][j] = ' ';
                    }
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
        }
    }


public static void main(String[] args) {
	
cruz(8,6);
}
}
