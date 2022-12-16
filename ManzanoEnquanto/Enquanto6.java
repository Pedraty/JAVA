package manzanoEnquanto;

import java.util.Scanner;

public class Enquanto6 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para a base");
		int base = sc.nextInt();
		
		System.out.println("Digite um valor para o expoente");
        int expoente = sc.nextInt();
        sc.close();

        int contadora = 0;
        int resultado = 1;

        while (contadora < expoente) {
            resultado = base * resultado;
            contadora++;
        }
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
	}
}
