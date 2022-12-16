package manzanoRepita;

import java.util.Scanner;

public class Repita6 {
	public static void main(String[] args) {
		int total= 0;
        int soma = 0;
        int valor = 0;
        int media = 0;
        Scanner sc = new Scanner("Insira um valor iinteiro");
        	
        do {
            valor = sc.nextInt();
            
            
            total++;                
            soma = soma + valor;

        } while (valor >= 0);
        media = soma/total;
        sc.close();
        System.out.println("A soma é "+soma);
        System.out.println("A soma é "+soma+"\nA media é "+media+"\nO total é  "+total);

	}
}
