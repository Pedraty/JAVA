package lista02;

import java.util.Scanner;

public class DiasVividos {
	public static void main(String[]args) {
		System.out.println("Cálculo dos dias vividos.");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Para começar, digite o dia do seu aniversário");
		int diaAniv = sc.nextInt();
		System.out.println("");
		System.out.println("Agora, digite sua idade:");
		byte idade = sc.nextByte();
		System.out.println("");
		System.out.println("Quantos meses se passaram desde o último dia do seu aniversário?");
		int meses = sc.nextInt();
		System.out.println("");
		System.out.println("Por último, digite o dia de hoje:");
		int hoje = sc.nextInt();
		int diaAnos = idade*365;
		int diaMeses = meses*30;
		int dias = (30 - diaAniv) + hoje;
		int diasVividos = diaAnos+diaMeses+dias;
		System.out.println("Você está qui há "+diasVividos+". Continue assim!");
		sc.close();
		
	}
}
