package lista02;

import java.util.Scanner;

public class FahrEmCelsius {

	public static void main(String[] args) {
		// Ler uma temperatura em graus Fahrenheit 
		// e apresentá-la convertida em graus Celsius. 
		// A fórmula de conversão é C=(F-32) *(5/9), 
		// sendo F a temperatura em 
		// Fahrenheit e C a temperatura em Celsius.
		float fahr, celsius;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em fahrenheit: ");
		fahr = sc.nextFloat();
		sc.close();
		celsius = fahr-32;
		celsius = (celsius*5)/9;
		System.out.println(fahr+"°F é igual a "+celsius+"°C");
		

	}

}
