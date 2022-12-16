package faccat;

import java.util.Scanner;

public class MaiorValor3 {

	public static void main(String[] args) {
		float valor1, valor2, valor3 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor :");
		valor1 = sc.nextFloat();
		System.out.println("Digite um valor diferente :");
		valor2 = sc.nextFloat();
		System.out.println("Digite um valor mais diferente ainda :");
		valor3 = sc.nextFloat();
		sc.close();
		
		if ((valor1>valor2)&&(valor1>valor3)) {
			System.out.println(valor1+" é o maior");
		}else if((valor2>valor1)&&(valor2>valor3)){
			System.out.println(valor2+" é o maior");
			
		}else {
			System.out.println(valor3+" é o maior");
		}
	}
	}
