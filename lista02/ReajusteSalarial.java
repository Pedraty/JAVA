package lista02;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		float salarioMensal,  reajuste, salarioAtual;
		Scanner input =  new Scanner(System.in);
		System.out.println("Digite o seu sal�rio mensal:");
		salarioMensal = input.nextFloat();
		
		System.out.println("Digite o valor do reajuste:");
		reajuste = input.nextFloat();
		
		salarioAtual = (salarioMensal * (reajuste/100))+salarioMensal;
		
		System.out.println("O sal�rio reajustado ser� de R$"+salarioAtual);
		input.close();
	}

}
