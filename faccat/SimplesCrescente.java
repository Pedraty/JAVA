package faccat;

import java.util.Scanner;

public class SimplesCrescente {
	public static void main(String[] args) {
		
		float valor1, valor2;
		
		Scanner sc = new   Scanner(System.in);
		System.out.println("Digite  valor:");
		valor1 = sc.nextFloat();
		System.out.println("Digite um outro valor diferente :");
		valor2 = sc.nextFloat();
		sc.close();
		if (valor1>valor2){
			System.out.println(valor1+", "+valor2);
		}else{
			System.out.println(valor2+", "+valor1);
		}
	}
}
