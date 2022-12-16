package faccat;

import java.util.Scanner;

public class QuadradoSoma {
	public static void main (String []args){
        float valor1, valor2, valor3, quadrados;

         Scanner sc = new   Scanner(System.in);
         System.out.println("Digite o primeiro valor:");
           valor1 = sc.nextFloat();
          System.out.println("Digite o segundo valor:");

   valor2 = sc.nextFloat();
         System.out.println("Digite um terceiro valor");
   valor3 = sc.nextFloat();
   sc.close();
   quadrados = valor1+valor2+valor3;
   quadrados = quadrados*quadrados;
  
   System.out.println("O quadrado da soma dos valores é igual a "+quadrados);
   




}

}
