package faccat;

import java.util.Scanner;

public class PositivoNegativoZero {

	public static void main(String[] args) {
		float valor;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor :");
		valor = sc.nextFloat();
		sc.close();
		
		if (valor>0) {
			System.out.println("Positivo");
		}else if(valor == 0){
			System.out.println("Valor é zero");
			
		}else {
			System.out.println("Negativo");
		}
	}
	}
