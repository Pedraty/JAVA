package Exercicio;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[]args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o valor para altura:");
			float altura = sc.nextFloat();
			System.out.println("Digite o valor para base:");
			float base = sc.nextFloat();
			sc.close();
			float area = (base * altura)/2;
			System.out.println("A área é igual a "+area+"m²");

		}
		
				
	}

}
