package faccat;

import java.util.Scanner;

public class Macas {
	public static void main(String[] args) {
		float macas, total;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantia de maçãs para comprar:");
		macas = sc.nextFloat();
		sc.close();
		if (macas < 12) {
			total = (float) (macas * 1.3);
			System.out.println("Valor total a pagar é :" + total);
		} else {
			System.out.println("Desconto aplicado. Valor total a pagar é :" + macas);
		}
	}
}
