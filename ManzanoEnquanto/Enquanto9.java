package manzanoEnquanto;

import java.util.Scanner;

public class Enquanto9 {

	public static void main(String[] args) {
		int contadora = 0;
        int soma = 0;
        int media = 0;
        int value = 0;
        Scanner sc = new Scanner(System.in);
        while (contadora<10){
        	System.out.println("Digite um número:");
            value = sc.nextInt();
            soma = soma + value;
            contadora++;
        }
        sc.close();
        media = soma/10;
        System.out.println("A soma é "+soma+"\n"+
        "A média é "+media);
	}

}
