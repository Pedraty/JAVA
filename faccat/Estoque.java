package faccat;

import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		float qtdAtual, qtdMax, qtdMin, qtdMed;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade  atual  em  estoque :");
		qtdAtual = sc.nextFloat();
		System.out.println("Quantidade  máxima  em  estoque :");
		qtdMax = sc.nextFloat();
		System.out.println("Quantidade  mínima  em  estoque :");
		qtdMin = sc.nextFloat();
		sc.close();
		qtdMed = (qtdMax + qtdMin)/2;
		
		if (qtdMed>qtdAtual) {
			System.out.println("Efetuar compra");
		}else {
			System.out.println("Não efetuar compra");
		}
		
	}

}
