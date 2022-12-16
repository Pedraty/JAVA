package manzanoEnquanto;

import java.util.Scanner;

public class Enquanto1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um valor");
	int codigo = sc.nextInt();
	sc.close();

            
            int contadora= 0;
            int result = 0;
            String phrase = "";

            while (contadora<10){
                contadora++;
                result = contadora*codigo;
                phrase = (contadora+" x "+codigo+" = "+result+"\n");
                System.out.println(phrase);
            }
}
}
