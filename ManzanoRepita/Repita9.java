package manzanoRepita;

import java.util.Scanner;

public class Repita9 {
	public static void main(String[] args) {
		int menor = 0;
        int maior = 0;
        int valor = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor:");
        valor  = sc.nextInt();
        maior = valor;
        menor = valor;
        
        if (valor>0) {
            do {
            	System.out.println("Digite um valor:");
            	valor  = sc.nextInt();
                if (valor>maior) {
                    maior = valor;
                }else{
                    if (valor<menor) {
                        menor = valor;
                    }
                }
            } while (valor>0);
        }
        sc.close();
        
        System.out.println("Valor negativo. Finalizando execução\n\nO maior valor inscrito foi: "+maior+"\n\nO menor número inscrito foi: "+menor);
	}
}
