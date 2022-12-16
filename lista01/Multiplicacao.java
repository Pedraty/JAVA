package Exercicio;

import java.util.Scanner;

public class Multiplicacao {
	public static void main(String[]args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite um valor :");
			int valor=sc.nextInt();
			System.out.println("Digite outro valor :");
			int valor2 =sc.nextInt();
			int resultado = (valor * valor2);
			System.out.println(valor+" * "+valor2+" = "+resultado);
			}
	}
}