package lista02;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Escreva um valor de 1 a 7");
		input.close();
		byte valor = input.nextByte();
		switch (valor) {
		case 1:
			System.out.println("Domingo");
			
			break;
		case 2:
			System.out.println("Segunda");
			
			break;
		case 3:
			System.out.println("Ter�a-Feira");
			
			break;
		case 4:
			System.out.println("Quarta-Feira");
			
			break;
		case 5:
			System.out.println("Quinta-Feira");
			
			break;
		case 6:
			System.out.println("Sexta-Feira");
			
			break;
		case 7:
			System.out.println("S�bado");
			
			break;

		default:
			System.out.println("Valor inv�lido");
			break;
		}
	}

}
