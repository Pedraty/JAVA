//Escreva um algoritmo para ler as dimensões de um
//trapézio (base maior, base menor e altura), calcular 
//e escrever a área do trapézio. a=(B+b).h/2 

package Exercicio;

import java.util.Scanner;

public class Trapezio {
	
	public static void main(String[]args) {
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Digite um valor para a base maior");
			float baseMaior = sc.nextFloat();
			try (Scanner scn = new Scanner(System.in)){
				System.out.println("Digite um valor para a base menor");
				float baseMenor = scn.nextFloat();
				try (Scanner scnr = new Scanner(System.in)){
					System.out.println("Digite um valor para a base menor");
					float altura = scnr.nextFloat();
					float area = (baseMaior+baseMenor)*altura/2;
					System.out.println("A área da base é "+area);
				}
				
			}
			
			
		}
	}
}
