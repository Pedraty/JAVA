package Exercicio;

import java.util.Scanner;

public class Retangulo {
	public static void main(String[]args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o valor para altura:");
			float altura = sc.nextFloat();
		try(Scanner scn = new Scanner(System.in)){
			System.out.println("Digite o valor para largura:");
			float largura = sc.nextFloat();
			
			float area = largura * altura;
			System.out.println("A área é igual a "+area+"m²");

		
		}
		}
		
				
	}

}
