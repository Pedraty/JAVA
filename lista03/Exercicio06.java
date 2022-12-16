package lista03;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor1 = sc.nextInt();

		System.out.println("Digite outro valor");
		int valor2 = sc.nextInt();
        
		System.out.println("Digite um valor totalmente diferente");
		int valor3 = sc.nextInt();

        int resultado = (valor1)*(valor1)+(valor2*valor2)+(valor3*valor3);
        sc.close();
        System.out.println(valor1+"² + "+valor2+"² + "+valor3+"² = "+resultado);

	}
}
