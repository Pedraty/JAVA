package faccat;

import java.util.Scanner;

public class SomaDosMaiores {

	public static void main(String[] args) {
		float valor1, valor2, valor3, maior, soma ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor :");
		valor1 = sc.nextFloat();
		System.out.println("Digite um valor diferente :");
		valor2 = sc.nextFloat();
		System.out.println("Digite um valor mais diferente ainda :");
		valor3 = sc.nextFloat();
		sc.close();
		
		if ((valor1>valor2)&&(valor1>valor3)) {
			maior = valor1;
			if(valor2>valor3){
				soma = maior+valor2;
			}else {
				soma = maior+valor3;
			}
			
		}else if((valor2>valor1)&&(valor2>valor3)){
			maior = valor2;
			if(valor2>valor3){
				soma = maior+valor1;
			}else {
				soma = maior+valor3;
			}
			
		}else {
			System.out.println(valor3+" é o maior");
			maior = valor3;
			if(valor2>valor3){
				soma = maior+valor1;
			}else {
				soma = maior+valor2;
				
			}
		}
		System.out.println("A soma dos maiores é: "+soma);
	}
	}
