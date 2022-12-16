package manzanoRepita;

import java.util.Scanner;

public class Repita8 {
	public static void main(String[] args) {
		String comodo = "";
        int areaTotal = 0;
        int areaComodo = 0;
        String resposta = "";
        int comprimento = 0;
        int largura = 0;

        Scanner sc = new Scanner(System.in);
        
        do {
        	System.out.println("Nome do cômodo: ");
            comodo = sc.nextLine();
            
            
            System.out.println("Largura: ");
            largura = sc.nextInt();
            
            
            System.out.println("Comprimento: ");
            comprimento = sc.nextInt();
            
            
            areaComodo = largura*comprimento;
            areaTotal = areaTotal+areaComodo;
            System.out.println("Area do "+comodo+" é "+areaComodo+"\nÁrea total é "+areaTotal);
            
            System.out.println("Deseja continuar adicionando cômdos?(S/N)");
            resposta = sc.nextLine();

            
        } while (resposta != "N");
        sc.close();
        System.out.println("Finalizando execução");
	}
}
