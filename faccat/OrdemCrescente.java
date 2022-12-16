package faccat;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		int valor1, valor2, valor3, maior, menor, meio;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor :");
		valor1 = sc.nextInt();
		System.out.println("Digite um valor diferente :");
		valor2 = sc.nextInt();
		System.out.println("Digite um valor mais diferente ainda :");
		valor3 = sc.nextInt();
		sc.close();
		
		if ((valor1>valor2)&&(valor1>valor3)) {
			maior = valor1;
			if(valor2<valor3){
				menor = valor2;
				meio = valor3;
			}else {
				menor = valor3;
				meio = valor2;
			}
			
		}else if((valor2>valor1)&&(valor2>valor3)){
			maior = valor2;
			if(valor1<valor3){
				menor = valor1;
				meio = valor3;
			}else {
				menor = valor3;
				meio = valor1;
			}
			
		}else {
			maior = valor3;
			if(valor1<valor2){
				menor = valor1;
				meio = valor2;
			}else {
				menor = valor2;
				meio = valor1;
			}
			
		}
		System.out.println(menor+", "+meio+", "+maior);
	}
	}
