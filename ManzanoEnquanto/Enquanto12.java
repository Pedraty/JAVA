package manzanoEnquanto;

import java.util.Scanner;

public class Enquanto12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro");
		
		int valor = sc.nextInt();
        int maior = valor;
        int menor = valor;
        while (valor>0) {
        	
        	System.out.println("Digite um valor inteiro");
            valor = sc.nextInt();
            if (valor>maior) {
                maior = valor;
            } else {
                if (valor<menor){
                    menor = valor;
                }
                
            }
        }
        sc.close();
        System.out.println("Programa interrompido, pois valor é negativo \n \nO maior valor é "+maior+"\nJá o menor é "+menor);
    }
}
