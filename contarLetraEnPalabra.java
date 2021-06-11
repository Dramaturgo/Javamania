import java.util.Scanner;

//cuantas veces se repite una letra en una sola palabra

public class contarLetraEnPalabra {
    public static void main(String[] args) {
        String word = "";
        Scanner read = new Scanner(System.in);
        int counter = 0;
        char letter;
        
        System.out.println("Escriba una palabra: ");
        word = read.next();
        
        System.out.println("Escriba una letra: ");
        letter = read.next().charAt(0);
        
        counter = getQuantityOfLettersInAWord(word,letter);
   
        System.out.println("La letra: "+letter+" Se repite: " +counter+ " veces");
    }
    
    public static int getQuantityOfLettersInAWord(String word, char letter)
    {
        int counter = 0;
          for (int i = 0; i < word.length(); i++) 
        {
            if(word.charAt(i) == letter)
            {
                counter++;
            }
        }
          return counter;
    }
}