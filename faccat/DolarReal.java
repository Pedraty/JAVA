package faccat;

import java.util.Scanner;

public class DolarReal {
	     public static void main (String []args){
	          float real, dolar, cotacao;

	           Scanner sc = new   Scanner(System.in);
	           System.out.println("Digite um valor em  dólares:");
	             dolar = sc.nextFloat();
	            System.out.println("Digite a cotação do dólar atual");
	     cotacao = sc.nextFloat();
	     sc.close();
	     real = dolar*cotacao;
	    
	     System.out.println("R$"+real+" = $"+dolar);
	     




	}
}
