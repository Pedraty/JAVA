package manzanoRepita;

import java.util.Scanner;

public class Repita10 {
	public static void main(String[] args) {
		int quociente = 0;
        int divisor = 0;
        int valor2 = 0;
        int dividendo = 0;
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite um valor:");
        dividendo  = sc.nextInt();
        
        
        System.out.println("Digite um valor para dividir o primeiro :");
        valor2  = sc.nextInt();
        

            do {
                divisor  = divisor + valor2;
                quociente++;
            } while (divisor<dividendo);


        sc.close();
        System.out.println("Quociente é "+quociente);
	}
}
