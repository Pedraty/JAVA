package lista02;

import java.util.Scanner;

public class CustoDoConsumidor {

	public static void main(String[] args) {
		//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a 
		//porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
		//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
		//escrever um algoritmo para ler o custo de fábrica de um carro, calcular e 
		//escrever o custo final ao consumidor
		
		//Declaração das variáveis
		float custoFab, imposto, custoFinal,  dist;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o custo de fábrica do carro:");
		
		custoFab = input.nextFloat();
		
		imposto = custoFab*45/100;
		
		dist = custoFab*28/100;

		
		custoFinal = custoFab+dist+imposto;
		
		System.out.println("O custo final do consumidor é: "+custoFinal);
		
		input.close();
	}

}
