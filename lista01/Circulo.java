//Escreva um algoritmo para ler as dimens�es de um c�rculo 
//(raio), calcular e escrever a �rea do c�rculo. a=pi*r�

package Exercicio;

import java.util.Scanner;

public class Circulo {
	public static void main(String[]args){
		System.out.println("C�lculo da �rea do c�rculo. (Consedere pi como 3,14)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio:");
		double raio = sc.nextDouble();
		sc.close();
		double area = 3.14 *raio*raio;
		System.out.println("A �rea do c�rculo �: "+area+"m�");
		
		
		
		
	}
}
