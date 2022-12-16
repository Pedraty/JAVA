package faccat;

import java.util.Scanner;

public class RealDollar {
	public static void main (String []args){
        float real, dolar, cotacao;

         Scanner sc = new   Scanner(System.in);
         System.out.println("Digite um valor em reais:");
           real = sc.nextFloat();
          System.out.println("Digite a cotação do dólar atual");
   cotacao = sc.nextFloat();
   sc.close();
   dolar = real/cotacao;
  
   System.out.println("R$"+real+" = $"+dolar);
   




}
}
