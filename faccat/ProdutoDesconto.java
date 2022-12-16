package faccat;

import java.util.Scanner;

public class ProdutoDesconto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do produto.");
		String produto = sc.nextLine();
		System.out.println("Digite a quantidade comprada.");
		int quantidade = sc.nextInt();
		System.out.println("Por fim, digite o preço do produto.");
		int valor = sc.nextInt();
		sc.close();
		
		float total = quantidade*valor;
		if (total<=5) {
			total = total - (total*2/100);
		}else if (total>5 && total<=10) {
			total = total - (total*3/100);	
		}else {
			total = total - (total*5/100);
		}
		System.out.println("Produto:"+produto+"/nPreço total: R$"+total);
		
	}


}
