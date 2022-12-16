package lista02;

import java.util.Scanner;

public class Eleitores {
	public static void main(String []args) {
		//Inicia Scanner
		Scanner sc = new Scanner(System.in);
		
		//Votos válidos recebe input
		System.out.println("Digite o número de votos válidos:");
		float validos = sc.nextFloat();
		
		//Votos nulos recebe input
		System.out.println("Digite o número de votos nulos:");
		float nulos = sc.nextFloat();
		
		//Votos brancos recebe input
		System.out.println("Digite o número de votos brancos:");
		float brancos = sc.nextFloat();
		
		//Cálculo dos votos totais
		float votosTotais = validos + nulos + brancos;
		
		//Cálculo das porcentagens
		float validosPcnt =  (validos * votosTotais)/100;
		float nulosPcnt =  (nulos * votosTotais)/100;
		float brancosPcnt =  (brancos * votosTotais)/100;
		
		//Mostrar na tela as porcentagens
		System.out.println("A quantidade de votos validos é "+validos);
		System.out.println("A quantidade de votos nulos é "+nulos);
		System.out.println("A quantidade de votos brancos é "+brancos);
		System.out.printf("A porcentagem de votos validos é %.2f",validosPcnt);
		System.out.println("%");
		System.out.printf("A porcentagem de votos nulos é %.2f",nulosPcnt);
		System.out.println("%");
		System.out.printf("A porcentagem de votos brancos é %.2f",brancosPcnt);
		System.out.println("%");
		//Fecha o Scanner
		sc.close();
	}

}
