package faccat;

import java.util.*;  

public class IdadesMulher {

	public static void main(String[] args) {
		int mulher1, mulher2, homem1, homem2, maisVelho, maisNovo, maisVelha, maisNova, soma, produto;

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Idade da primeira mulher");
		mulher1 = sc.nextInt();
		

		maisVelha = mulher1;
		maisNova = mulher1;
				
		System.out.println("Idade da segunda mulher");
		mulher2 = sc.nextInt();
		if (mulher2>maisVelha) {
			maisVelha = mulher2;
		}else {
			maisNova = mulher2;
		}
		
		System.out.println("Idade do primeiro homem");
		homem1= sc.nextInt();
		
		System.out.println("Idade do segundo homem");
		homem2 = sc.nextInt();
		maisVelho = homem1;
		maisNovo = homem1;
		sc.close();
		if (homem2>maisVelho) {
			maisVelho = homem2;
		}else {
			maisNovo = homem2;
		}
		
		sc.close();
		soma = maisVelho+maisNova;
		produto = maisVelha*maisNovo;
		System.out.println("A soma das idades do homem mais velho com a mulher mais nova é "+soma+"\n"
				+ "Já o produto das idades da mulher mais velha com o homem mais novo é"
				+ " "+produto);
		
		
		
		
		
		
	}
	}
