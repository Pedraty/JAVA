package faccat;

import java.util.Scanner;


public class Exercicio{
   public static void main(String []args){
           float valor1, valor2, auxiliar;
           Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero");
            valor1 = sc.nextFloat();
            System.out.println("Digite outro numero");
            valor2 = sc.nextFloat();
            sc.close();
            System.out.println("O primeiro e o segundo valor sao, respectivamente: "+valor1+", "+valor2);
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
           System.out.println("O primeiro e o segundo valor agora sao, respectivamente: "+valor1+", "+valor2);
}
}