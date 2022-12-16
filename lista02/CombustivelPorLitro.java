package lista02;

import java.util.Scanner;

public class CombustivelPorLitro {

	public static void main(String[] args) {
		// Efetuar o cálculo da quantidade de litros de combustível 
		// gasta em uma viagem, utilizando um automóvel que faz de 
		// 12 Km por litro. 
		
		float litros, tempo, velMedia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a velocidade média da viagem:");
		velMedia = sc.nextFloat();
		
		System.out.println("Digite tempo total da viagem:");
		tempo = sc.nextFloat();
		sc.close();
		litros = tempo*velMedia;
		litros = litros/12;
		System.out.println("A quantidade gasta de combustível é de "+litros+" litros");

	}

}
