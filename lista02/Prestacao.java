package lista02;

import java.util.Scanner;

public class Prestacao {

	public static void main(String[] args) {
		// Efetuar o c�lculo e a apresenta��o do 
		// valor de uma presta��o em atraso, utilizando a 
		// f�rmula PRESTACAO=VALOR+(VALOR*TAXA/100) *TEMPO).
		float valor, taxa, prestacao, tempo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da presta��o inicial:");
		valor = sc.nextFloat();
		
		System.out.println("Digite o valor da taxa de atraso:");
		taxa = sc.nextFloat();
		
		System.out.println("Por �ltimo, insira o tempo em meses de atrasos:");
		tempo = sc.nextFloat();
		sc.close();
		
		prestacao = valor+(valor*taxa/100)*tempo;
		
		System.out.println("O valor da presta��o em atraso � "+prestacao);
	}
}
