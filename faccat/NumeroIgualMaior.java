package faccat;

import java.util.Scanner;

public class NumeroIgualMaior {

	public static void main(String[] args) {
		float valor1, valor2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor :");
		valor1 = sc.nextFloat();
		
		System.out.println("Digite outro valor :");
		valor2 = sc.nextFloat();
		sc.close();
		
		if (valor1>valor2) {
			System.out.println("Primeiro é maior");
		}else if(valor1<valor2){
			System.out.println("Segundo é maior");
			
		}else {
			System.out.println("Numeros iguais");
		}
	}
	}
