package lista02;

import java.util.Scanner;

public class Eleitores {
	public static void main(String []args) {
		//Inicia Scanner
		Scanner sc = new Scanner(System.in);
		
		//Votos v�lidos recebe input
		System.out.println("Digite o n�mero de votos v�lidos:");
		float validos = sc.nextFloat();
		
		//Votos nulos recebe input
		System.out.println("Digite o n�mero de votos nulos:");
		float nulos = sc.nextFloat();
		
		//Votos brancos recebe input
		System.out.println("Digite o n�mero de votos brancos:");
		float brancos = sc.nextFloat();
		
		//C�lculo dos votos totais
		float votosTotais = validos + nulos + brancos;
		
		//C�lculo das porcentagens
		float validosPcnt =  (validos * votosTotais)/100;
		float nulosPcnt =  (nulos * votosTotais)/100;
		float brancosPcnt =  (brancos * votosTotais)/100;
		
		//Mostrar na tela as porcentagens
		System.out.println("A quantidade de votos validos � "+validos);
		System.out.println("A quantidade de votos nulos � "+nulos);
		System.out.println("A quantidade de votos brancos � "+brancos);
		System.out.printf("A porcentagem de votos validos � %.2f",validosPcnt);
		System.out.println("%");
		System.out.printf("A porcentagem de votos nulos � %.2f",nulosPcnt);
		System.out.println("%");
		System.out.printf("A porcentagem de votos brancos � %.2f",brancosPcnt);
		System.out.println("%");
		//Fecha o Scanner
		sc.close();
	}

}
