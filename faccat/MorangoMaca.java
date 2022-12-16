package faccat;

import java.util.Scanner;

public class MorangoMaca {
	public static void main(String[] args) {
		int maca, morango, totalFrutas;
		double totalMaca, totalMorango, valorTotal;

		System.out.println("Bancada da Dona C�lia:");
		System.out.println("Vende-se ma��s e morangos");

		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha a quantidade de quilos de ma��:");
		maca = sc.nextByte();
		System.out.println("Escolha a quantidade de quilos de morango:");
		morango = sc.nextByte();
		sc.close();
		totalFrutas = maca + morango;
		

//Por n�o existir vari�vel global, todas as vari�veis criadas precisam estar dentro do escopo.

		// esse � o meu primeiro grande escopo
		if (maca <= 5) {

			totalMaca = maca * 1.8;
			if (morango <= 5) {
				totalMorango = morango * 2.5;
				valorTotal = totalMorango + totalMaca;
				if ((valorTotal > 25) || (totalFrutas > 8)) {
					valorTotal = valorTotal - (valorTotal * 0.1);

					/*
					 * o valor total depende das variaveis anteriores. N�o � poss�vel retornar o
					 * valor de uma variavel que est� fora do escopo
					 */
					System.out.println("O total a pagar � R$" + valorTotal);
				} else {
					System.out.println("O total a pagar � R$" + valorTotal);
				}
			} else if (morango > 5) {
				totalMorango = morango * 2.2;
				valorTotal = totalMorango + totalMaca;
				if ((valorTotal > 25) || (totalFrutas > 8)) {
					valorTotal = valorTotal - (valorTotal * 0.1);
					System.out.println("O total a pagar � R$" + valorTotal);
				} else {
					System.out.println("O total a pagar � R$" + valorTotal);
				}
			}
		}

		// segundo grande escopo
		else {

			totalMaca = maca * 1.5;
			if (morango <= 5) {
				totalMorango = morango * 2.5;
				valorTotal = totalMorango + totalMaca;
				if ((valorTotal > 25) || (totalFrutas > 8)) {
					valorTotal = valorTotal - (valorTotal * 0.1);
					System.out.println("O total a pagar � R$" + valorTotal);
				} else {
					System.out.println("O total a pagar � R$" + valorTotal);
				}
			} else if (morango > 5) {
				totalMorango = morango * 2.2;
				valorTotal = totalMorango + totalMaca;
				if ((valorTotal > 25) || (totalFrutas > 8)) {
					valorTotal = valorTotal - (valorTotal * 0.1);
					System.out.println("O total a pagar � R$" + valorTotal);
				} else {
					System.out.println("O total a pagar � R$" + valorTotal);
				}
			}
		}

	}
}
