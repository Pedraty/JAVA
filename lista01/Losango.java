package Exercicio;

import java.util.Scanner;

public class Losango {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Digite o valor da base maior");
			float baseMaior = sc.nextFloat();
			try (Scanner scn = new Scanner(System.in)) {
				System.out.println("Digite o valor da base menor");
				float baseMenor = scn.nextFloat();
				float area = (baseMenor*baseMaior)/2;
				
				System.out.println("Area do losango é "+area);
			}
			
			
			
		}
	}
}
