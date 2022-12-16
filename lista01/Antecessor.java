package Exercicio;

import java.util.Scanner;

public class Antecessor {
	public static void main(String[]args) {
		try (Scanner sc= new Scanner(System.in)){
			System.out.println("Digite um número:");
			int valor = sc.nextInt();
			int antecessor = valor-1;
			System.out.println("O antecessor de "+valor+" é "+antecessor);
					
			
		}
	}
}
