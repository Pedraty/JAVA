//Escreva um algoritmo para ler as dimensões de um círculo 
//(raio), calcular e escrever a área do círculo. a=pi*r²

package Exercicio;

import java.util.Scanner;

public class Circulo {
	public static void main(String[]args){
		System.out.println("Cálculo da área do círculo. (Consedere pi como 3,14)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio:");
		double raio = sc.nextDouble();
		sc.close();
		double area = 3.14 *raio*raio;
		System.out.println("A área do círculo é: "+area+"m²");
		
		
		
		
	}
}
