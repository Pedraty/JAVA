package faccat;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		float salario, total, vendas;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de vendas do mes:");
		vendas = sc.nextFloat();
		System.out.println("Digite o seu salario:");
		salario = sc.nextFloat();
		sc.close();
		if (vendas>1500) {
			total = (salario*5/100)+salario;
		}else {
			total = (salario*3/100)+salario;
		}
		System.out.println("O seu salario final corresponde a R$"+total);
		
	}

}
