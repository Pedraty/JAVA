package lista03;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um valor");
		
		int valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor");
		
		int valor2 = sc.nextInt();
		
		
		int resultado = (valor1-valor2)*(valor1-valor2);
		sc.close();
		
		System.out.println("O quadrado de " + valor1 + " menos "+valor2+" é "+resultado);
	}

}
