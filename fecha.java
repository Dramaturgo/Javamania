//Definir el dia en base a la fecha usando el calendario gregoriano

import java.util.Scanner;

public class QueDiaES {

           public static void main(String[] args){

           Scanner datoa = new Scanner(System.in);
           System.out.print("Digite el año:");
           int año = datoa.nextInt();

           Scanner datob = new Scanner(System.in);
           System.out.print("Digite el mes:");
           int mes = datoa.nextInt();

           Scanner datoc = new Scanner(System.in);
           System.out.print("Digite el dia:");
           int dia = datoa.nextInt();

           System.out.println("");
           System.out.println("");


        //hallamos datos necesarios para el calendario Gregoriano
      	 int a =(14-mes) /12;
      	 int y = año-a;
         int m = mes+12*a-2;
         int c = dia+y;
         int d = año/4;
         int e = año/100;
         int f = año/400;
         int g = (31*m)/12;
         int h = c+d-e+f+g;
         int sol = h%7;

         if (sol==1)
         	System.out.printf("EL %d de %d de %d fue LUNES",dia,mes,año);
         else if (sol ==2)
         	System.out.printf("EL %d de %d de %d fue MARTES",dia,mes,año);
         else if (sol ==3)
         	System.out.printf("EL %d de %d de %d fue MIERCOLES",dia,mes,año);
         else if (sol ==4)
         	System.out.printf("EL %d de %d de %d fue JUEVES",dia,mes,año);
         else if (sol ==5)
         	System.out.printf("EL %d de %d de %d fue VIERNES",dia,mes,año);
         else if (sol ==6)
         	System.out.printf("EL %d de %d de %d fue SÁBADO",dia,mes,año);
         else
         	System.out.printf("EL %d de %d de %d fue DOMINGO",dia,mes,año);
      	 
      }}