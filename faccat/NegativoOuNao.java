package faccat;

import java.util.Scanner;

public class NegativoOuNao {
	public static void main (String []args){
        float valor1;

        Scanner sc = new   Scanner(System.in);
        System.out.println("Digite um valor:");
          valor1 = sc.nextFloat();
  sc.close();
   if (valor1<0){
      System.out.println("Valor é negativo");
       }else{
      System.out.println("Valor é positivo");
   }
  




}

}
