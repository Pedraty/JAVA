package lista02;

import java.util.Scanner;

public class CombustivelPorLitro {

	public static void main(String[] args) {
		// Efetuar o c�lculo da quantidade de litros de combust�vel 
		// gasta em uma viagem, utilizando um autom�vel que faz de 
		// 12 Km por litro. 
		
		float litros, tempo, velMedia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a velocidade m�dia da viagem:");
		velMedia = sc.nextFloat();
		
		System.out.println("Digite tempo total da viagem:");
		tempo = sc.nextFloat();
		sc.close();
		litros = tempo*velMedia;
		litros = litros/12;
		System.out.println("A quantidade gasta de combust�vel � de "+litros+" litros");

	}

}
