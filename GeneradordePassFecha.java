import java.security.SecureRandom;

import java.time.LocalDate;

public class GeneradordePassFecha {

    //genera un password de 24 caracteres de manera random partiendo de la fecha

public static String generadorDePasword() {
        String fecha=String.valueOf(LocalDate.now()).replaceAll("-", "");
        int diferecial=24-fecha.length();//diferencia de los 24 caracteres con la cantidad de dgitios  
        String alfaMin = "abcdefghijklmnopqrstuvwxyz";
        String alfaMay = alfaMin.toUpperCase();
        String numeros = "0123456789";

        String datosToString = alfaMin + alfaMay + numeros;
        SecureRandom random = new SecureRandom();
    
        if (diferecial < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < diferecial; i++) {
            // 0-62 (exclusivo), retorno aleatorio 0-61
            int rndCharAt = random.nextInt(datosToString.length());
            char rndChar = datosToString.charAt(rndCharAt);

            sb.append(rndChar);
        }

        return fecha+sb.toString();
    }


    public static void main(String args[]) { 

    for (int i = 0; i < 5; i++) {
            System.out.println("Id de 24 carcateres Aleatorio: " + generadorDePasword());
            System.out.println("\n");
        }




    }
}


