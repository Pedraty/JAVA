package lista02;

import java.util.Scanner;

public class CustoDoConsumidor {

	public static void main(String[] args) {
		//O custo de um carro novo ao consumidor � a soma do custo de f�brica com a 
		//porcentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
		//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
		//escrever um algoritmo para ler o custo de f�brica de um carro, calcular e 
		//escrever o custo final ao consumidor
		
		//Declara��o das vari�veis
		float custoFab, imposto, custoFinal,  dist;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o custo de f�brica do carro:");
		
		custoFab = input.nextFloat();
		
		imposto = custoFab*45/100;
		
		dist = custoFab*28/100;

		
		custoFinal = custoFab+dist+imposto;
		
		System.out.println("O custo final do consumidor �: "+custoFinal);
		
		input.close();
	}

}
