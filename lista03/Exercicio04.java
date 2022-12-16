package lista03;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("valor1");	
		 int valor1 = sc.nextInt();
		 
		 
		 System.out.println("valor2");	
		 int valor2 = sc.nextInt();

         int resultado = (valor1*valor2);
         sc.close();

         System.out.println("R$" + valor1 + " são $"+resultado);
	}
}	
