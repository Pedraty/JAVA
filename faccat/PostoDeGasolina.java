package faccat;

import java.util.Scanner;

public class PostoDeGasolina {

	public static void main(String[] args) {
		byte litros;
		double valor;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("A = Alcool G = Gasolina :");
		char tipo = sc.next().charAt(0);
		
		System.out.println("Digite a quantidade de litros:");
		litros = sc.nextByte();
		
		sc.close();
		
		if ((tipo == 'A')&&(litros<=20)) {
			valor = litros*2.90;
			valor = valor-(valor*0.03);
			System.out.println("Para a quantidade de litros "+litros+" da opção "+tipo+"\nO valor total será"
					+ " de R$"+valor);
			
		}else if((tipo == 'A')&&(litros>20)) {
			valor = litros*2.90;
			valor = valor-(valor*0.05);
			System.out.println("Para a quantidade de litros "+litros+" da opção "+tipo+"\nO valor total será"
					+ " de R$"+valor);
			
		}
		if ((tipo == 'G')&&(litros<=20)) {
			valor = litros*3.30;
			valor = valor-(valor*0.04);
			System.out.println("Para a quantidade de litros "+litros+" da opção "+tipo+"\nO valor total será"
					+ " de R$"+valor);
			
		}else if((tipo == 'G')&&(litros>20)) {
			valor = litros*33/10;
			valor = valor-(valor*0.06);
			
			System.out.println("Para a quantidade de litros "+litros+" da opção "+tipo+"\nO valor total será"
					+ " de R$"+valor);
		}
		
	}
	}
