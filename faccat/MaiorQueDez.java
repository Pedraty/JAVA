package faccat;

import java.util.Scanner;

public class MaiorQueDez {
	public static void main (String []args){
        float valor1;

        Scanner sc = new   Scanner(System.in);
        System.out.println("Digite um valor:");
          valor1 = sc.nextFloat();
  sc.close();
   if (valor1>10){
      System.out.println("Valor � maior que 10.");
       }else{
      System.out.println("Valor n�o � maior que 10.");
   }
  




}
}
