package lista03;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Comprimento");			
        int comprimento = sc.nextInt();

        System.out.println("largura");	
        int largura = sc.nextInt();

        System.out.println("altura");
        int altura = sc.nextInt();
       
        sc.close();
        int volume = altura*largura*comprimento;

        System.out.println("O volume da caixa é "+volume+"m³");
	}
}
