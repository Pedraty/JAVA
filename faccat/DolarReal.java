package faccat;

import java.util.Scanner;

public class DolarReal {
	     public static void main (String []args){
	          float real, dolar, cotacao;

	           Scanner sc = new   Scanner(System.in);
	           System.out.println("Digite um valor em  d�lares:");
	             dolar = sc.nextFloat();
	            System.out.println("Digite a cota��o do d�lar atual");
	     cotacao = sc.nextFloat();
	     sc.close();
	     real = dolar*cotacao;
	    
	     System.out.println("R$"+real+" = $"+dolar);
	     




	}
}
