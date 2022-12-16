package Exercicio;

import java.util.Scanner;

public class Quadrado {
	public static void main(String[]args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o valor para altura:");
			float altura = sc.nextFloat();
			
			float area = (altura * altura);
			System.out.println("A área é igual a "+area+"m²");

		}		
	}
}