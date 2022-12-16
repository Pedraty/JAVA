package faccat;

import java.util.Scanner;

public class Xadrez {
	public static void main (String []args){
        float valor1, valor2, horas;

        Scanner sc = new   Scanner(System.in);
        System.out.println("Digite o horário de início da partida:");
          valor1 = sc.nextFloat();
        System.out.println("Digite o horário de término da partida :");
          valor2 = sc.nextFloat();
  sc.close();
 horas = valor2 - valor1;
   if (horas<0){
      horas = horas+24;
       }
  System.out.println("A partida durou"+horas+" horas");




}

}
