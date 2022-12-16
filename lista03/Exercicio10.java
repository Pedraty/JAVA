package lista03;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("votosValidosA");
		int votosValidosA = sc.nextInt();

		System.out.println("votosValidosB");
		int votosValidosB = sc.nextInt();

		System.out.println("votosValidosC");
		int votosValidosC = sc.nextInt();

		System.out.println("votosBrancos");
		int votosBrancos = sc.nextInt();

		System.out.println("votosNulos");
		int votosNulos = sc.nextInt();

		int votosValidos = (votosValidosA + votosValidosB + votosValidosC);

		int totalEleitores = (votosValidos + votosNulos + votosBrancos);

		int totalPorcento = ((votosValidos * 100) / totalEleitores);
		int porcentoValidoA = ((votosValidosA * 100) / totalEleitores);
		int porcentoValidoB = ((votosValidosB * 100) / totalEleitores);
		int porcentoValidoC = ((votosValidosC * 100) / totalEleitores);
		int porcentoBranco = ((votosBrancos * 100) / totalEleitores);
		int porcentoNulo = ((votosNulos * 100) / totalEleitores);

		System.out.println("Total de Eleitores:  " + totalEleitores + "\n" + "Porcentagem total de votos válidos: " + totalPorcento
				+ "%" + "\n" + "Porcentagem de votos válidos do candidato A: " + porcentoValidoA + "%" + "\n"
				+ "Porcentagem de votos válidos do candidato B: " + porcentoValidoB + "%" + "\n"
				+ "Porcentagem de votos válidos do candidato C: " + porcentoValidoC + "%" + "\n"
				+ "Porcentagem de votos brancos: " + porcentoBranco + "%" + "\n" + "Porcentagem de votos nulos: "
				+ porcentoNulo + "%" + "\n");
	}
}
