package lista02;

import java.util.Scanner;

public class CelsiusEmFahrenheit {

	public static void main(String[] args) {
		// Ler uma temperatura em graus Celsius e apresent�-la 
		//convertida em graus Fahrenheit. A f�rmula de convers�o � F = (9*C + 160) /5, 
		//sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		float celsius, fahr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a temperatura em Celsius:");
		celsius = sc.nextFloat();
		sc.close();
		fahr = (9*celsius + 160)/5;
		System.out.println("A temperatura em fahrenheit � igual a: "+fahr+"�F");
	}

}
