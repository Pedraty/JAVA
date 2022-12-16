package manzanoPara;

import java.util.Scanner;

public class Para2 {
	public static void main(String[] args) {
        int resultado = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int input = sc.nextInt();
        
        for(int numero = 1; numero < 10; numero++){
            resultado = numero*input;
            System.out.println(input+" x "+numero+" = "+resultado);
        }
        sc.close();
	}
}
