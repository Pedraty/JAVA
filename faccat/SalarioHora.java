package faccat;

import java.util.Scanner;

public class SalarioHora {
	 public static void main (String []args){
         float salarioHora, horaExtra, salarioFinal, horaMes;

         Scanner sc = new   Scanner(System.in);
         System.out.println("Digite as horas trabalhadas no m�s :");
         horaMes = sc.nextFloat();
         System.out.println("Digite o sal�rio por hora :");
           salarioHora = sc.nextFloat();
    sc.close();
    horaExtra = horaMes - 160;
    if (horaExtra>0){
       salarioFinal = horaExtra*salarioHora;
       salarioFinal = (float) ((float) salarioFinal*1.5);
       horaMes = 160*salarioHora;
       salarioFinal = horaMes+salarioFinal;
        }else{
       salarioFinal = horaMes*salarioHora;
}
   System.out.println("O seu sal�rio final � de R$"+salarioFinal);




}
}
