package lista02;

import java.util.Scanner;

public class Exemplo04Jailson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a sua idade:");
		int idade = sc.nextInt();

		if (idade < 16) {
			System.out.println("Não pode votar");
		} else if (idade < 18 || idade > 65) {
			System.out.println("Voto opcional");
		} else {
			System.out.println("Voto obrigatório");
		}

		sc.close();
	}

}
