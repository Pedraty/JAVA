package manzanoRepita;

import java.util.Scanner;

public class Repita5 {
	public static void main(String[] args) {
		int numero = 0;int antes = 0;int fatorial = 0;int contadora = 0;int soma = 0;
		Scanner sc = new Scanner(System.in);
		
        do {
        	System.out.println("Digite um valor inteiro");
            numero = sc.nextInt();
             
            antes = 1;
            // fator = numero-antes;
             fatorial = numero*(numero-antes);
            do {
                antes++;
                // fator = (numero-antes);
                fatorial = fatorial*(numero-antes);
            } while ((numero-antes) != 1);
             soma = soma+fatorial;
            contadora++;
            
        } while (contadora != 15);
        sc.close();
        System.out.println("O somatório dos fatorias dos valores lidos é: "+soma);
	}
}
