package manzanoEnquanto;

import java.util.Scanner;

public class Enquanto11 {

	public static void main(String[] args) {
		String confirma = "";
		int largura, areaComodo, comprimento = 0;
		int areaTotal = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do c�modo:");
		String comodo = sc.nextLine();
		
		
		System.out.println("Largura do c�modo:");
		largura = sc.nextInt();
		
		System.out.println("Comprimento do c�modo:");
		comprimento = sc.nextInt();
		
		areaComodo = largura * comprimento;
		areaTotal = areaTotal + areaComodo;
		System.out.println("A �rea do c�modo � " + areaComodo + "\n" + "A �rea total � " + areaTotal);
		System.out.println("Deseja adicionar outro c�modo?(S/N)");
		confirma = sc.nextLine();
		while ((confirma != "N") && (confirma != "")) {
			System.out.println("Nome do c�modo:");
			comodo = sc.next();
			
			System.out.println("largura do c�modo:");
			largura = sc.nextInt();
			
			System.out.println("Comprimento do c�modo:");
			comprimento = sc.nextInt();
			areaComodo = largura * comprimento;
			areaTotal = areaTotal + areaComodo;
			System.out.println("A �rea do c�modo"+ comodo + " � " + areaComodo + "\n" + "A �rea total �" + areaTotal);
			System.out.println("Deseja adicionar outro c�modo?(S/N)");
			confirma = sc.nextLine();
		}
		sc.close();
	}

}
