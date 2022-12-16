package faccat;

import java.util.Scanner;

public class QuadradoDiferenca {
	public static void main (String []args){
        float valor1, valor2, diferenca, quadrado;

         Scanner sc = new   Scanner(System.in);
         System.out.println("Digite um valor:");
           valor1 = sc.nextFloat();
          System.out.println("Digite ouro valor:");
   valor2 = sc.nextFloat();
   sc.close();
   diferenca = valor1-valor2;
   quadrado = diferenca * diferenca;
  
   System.out.println("O quadrado da diferença é "+quadrado);

}
}
