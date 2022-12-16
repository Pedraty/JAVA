package lista03;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor");
		int valor1 = sc.nextInt();

		System.out.println("Digite outro valor");
		int valor2 = sc.nextInt();

		System.out.println("Digite um valor totalmente diferente");
		int valor3 = sc.nextInt();

		System.out.println("Digite um valor totalmente diferente");
		int valor4 = sc.nextInt();

		int resultado1 = (valor1 * valor3);

		int resultado2 = (valor2 + valor4);
		sc.close();
		System.out.println("O produto do primeiro valor pelo terceiro é " + resultado1 + "\n"
				+ "Já a soma do segundo valor com o quarto é " + resultado2);
	}
}
