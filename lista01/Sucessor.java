package Exercicio;

import java.util.Scanner;

public class Sucessor {
	public static void main(String[]args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Digite um valor: ");
			int valor = sc.nextInt();
			int sucessor = valor+1;
			System.out.println("O sucessor de "+valor+" é "+sucessor);
		}
	}
}
