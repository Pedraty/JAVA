package manzanoEnquanto;

public class Enquanto2 {
	public static void main(String[] args) {

		int contadora= 0;
        int soma = 0;

        while (contadora<100){
            contadora++;
            soma = soma+contadora;
        }
        System.out.println("A soma é "+soma);
	}
}
