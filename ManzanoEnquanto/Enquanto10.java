package manzanoEnquanto;

public class Enquanto10 {
	public static void main(String[] args) {
		int contadora = 50;
        int soma = 0;
        int media = 0;
        while (contadora<70){
            if( contadora%2 == 0){
                soma = soma + contadora;
            }
            contadora++;
        }
        media = soma/10;
        System.out.println("A soma é "+soma+"\n"+
        "A média é "+media);
	}
}
