package faccat;

import java.util.Scanner;

public class TesteTriangulo {

	public static void main(String[] args) {
		int valor1, valor2, valor3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor do lado:");
		valor1 = sc.nextInt();
		System.out.println("Digite um valor do outro lado:");
		valor2 = sc.nextInt();
		System.out.println("Digite um valor da base:");
		valor3 = sc.nextInt();
		sc.close();
		
		if ((valor1<(valor2+valor3))&&(valor2<(valor1+valor3))&&(valor1<(valor2+valor3))) {
			System.out.println("É um triângulo");
			}else {
				System.out.println("Não é um triângulo");
			}
			
		}
	}

