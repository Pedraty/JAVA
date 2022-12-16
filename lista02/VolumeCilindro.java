package lista02;

import java.util.Scanner;

public class VolumeCilindro {

	public static void main(String[] args) {
		// Calcular e apresentar o valor do volume 
		// de uma lata de óleo, 
		// utilizando a fórmula: Volume = π*Raio^2*Altura
		float volume, altura, raio;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura da lata:");
		altura = sc.nextFloat();
		
		System.out.println("Digite o raio da tampa da lata:");
		raio = sc.nextFloat();
		sc.close();
		volume = (float) (raio*raio*altura*3.14);
		System.out.println("O volume da lata de óleo é de "+volume+"m³");
		
		
		
		
		

	}

}
