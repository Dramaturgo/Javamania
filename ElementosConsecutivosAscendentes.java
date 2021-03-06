
public class ElementosConsecutivosAscendentes {

    public static void main(String[] args) {
        // consideramos 3 nmeros consecutivos 
        // {2, 5, 11, 10, 17, 7, 23, 24, 25}
        
        int[] numeros = {2, 5, 11, 10, 17, 7, 23, 24, 25};
        
        System.out.println(hayElementosEnterosConsecutivosAdyacentes(numeros)); // true
        
        System.out.println();
        
        numeros = new int[]{2, 3, 4, 5, 11, 10, 17, 7, 23, 13, 25};
        
        System.out.println(hayElementosEnterosConsecutivosAdyacentes(numeros)); // true
        
        System.out.println();
        
        numeros = new int[]{2, 31, 4, 5, 11, 10, 17, 7, 23, 13, 25};
        
        System.out.println(hayElementosEnterosConsecutivosAdyacentes(numeros)); // true
    }
    
    public static boolean hayElementosEnterosConsecutivosAdyacentes(int[] numeros) {
        for (int i = 0; i <= numeros.length - 3; i++) {
            if (numeros[i] + 1 == numeros[i + 1] && numeros[i] + 2 == numeros[i + 2]) {
                return true;
            }
        }
        
        return false;
    }
}
