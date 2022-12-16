package faccat;

import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		float conta, saldo, debito, credito;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero da sua conta:");
		conta = sc.nextFloat();
		System.out.println("Digite o seu saldo:");
		saldo = sc.nextFloat();
		System.out.println("Digite o seu debito:");
		debito = sc.nextFloat();
		System.out.println("Digite o seu credito:");
		credito = sc.nextFloat();
		sc.close();
		saldo = (saldo - debito)+credito;
		
		if (saldo<0) {
			System.out.println("A conta "+conta+"\nPossui saldo negativo: R$"+saldo);
		}else {
			System.out.println("A conta "+conta+"\nPossui saldo positivo: R$"+saldo);
		}
		
	}

}
