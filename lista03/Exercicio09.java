package lista03;

import java.util.Scanner;

public class Exercicio09 {
	 public static void main(String[] args) {
		 
		 
		 
		 
		 Scanner sc = new Scanner(System.in);

			System.out.println("Digite um valor para o sal�rio");
			int salario = sc.nextInt();

			System.out.println("Digite um valor para o reajuste");
			int reajuste = sc.nextInt();

         

         int resultado = ((salario*reajuste)/100)+salario;
         sc.close();
         System.out.println("O sal�rio com reajuste � R$"+resultado);
	}
}
