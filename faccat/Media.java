package faccat;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		float nota1, nota2, media;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota da primeira avalia��o:");
		nota1 = sc.nextFloat();
		System.out.println("Digite a nota da primeira avalia��o:");
		nota2 = sc.nextFloat();
		sc.close();
		
		media = nota1 + nota2;
		media = media / 2;
		if (media < 6) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
		System.out.println("Sua m�dia final foi " + media);

	}
}
