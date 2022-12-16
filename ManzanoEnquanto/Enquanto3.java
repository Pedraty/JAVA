package manzanoEnquanto;

public class Enquanto3 {
	public static void main(String[] args) {
		int contadora= 0;
        int soma = 0;

        while (contadora<100){
            contadora++;
            if (contadora % 2 == 0) {
                soma = soma+contadora;
            }
        }
        System.out.println("A soma é "+soma);
	}
}
