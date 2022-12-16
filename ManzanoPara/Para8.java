package manzanoPara;

import java.util.Scanner;

public class Para8 {

	public static void main(String[] args) {
		 int contador = 0;
         int resultado = 1;
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Base");
         int base = sc.nextInt();
         
         sc.close();
         System.out.println("Expoente");
         int expoente = sc.nextInt();

         for(contador = 0; contador < expoente; contador++){
             resultado = resultado*base;
         }
         System.out.println(resultado);
	}

}
