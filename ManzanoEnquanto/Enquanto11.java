package manzanoEnquanto;

import java.util.Scanner;

public class Enquanto11 {

	public static void main(String[] args) {
		String confirma = "";
		int largura, areaComodo, comprimento = 0;
		int areaTotal = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do cômodo:");
		String comodo = sc.nextLine();
		
		
		System.out.println("Largura do cômodo:");
		largura = sc.nextInt();
		
		System.out.println("Comprimento do cômodo:");
		comprimento = sc.nextInt();
		
		areaComodo = largura * comprimento;
		areaTotal = areaTotal + areaComodo;
		System.out.println("A área do cômodo é " + areaComodo + "\n" + "A área total é " + areaTotal);
		System.out.println("Deseja adicionar outro cômodo?(S/N)");
		confirma = sc.nextLine();
		while ((confirma != "N") && (confirma != "")) {
			System.out.println("Nome do cômodo:");
			comodo = sc.next();
			
			System.out.println("largura do cômodo:");
			largura = sc.nextInt();
			
			System.out.println("Comprimento do cômodo:");
			comprimento = sc.nextInt();
			areaComodo = largura * comprimento;
			areaTotal = areaTotal + areaComodo;
			System.out.println("A área do cômodo"+ comodo + " é " + areaComodo + "\n" + "A área total é" + areaTotal);
			System.out.println("Deseja adicionar outro cômodo?(S/N)");
			confirma = sc.nextLine();
		}
		sc.close();
	}

}
