package manzanoRepita;

public class Repita2 {
	public static void main(String[] args) {
		int contadora= 1;
        int quadrado = 0;
        int soma = 0;
        do {
            if(contadora%2==0){
                quadrado = contadora*contadora;
                soma = soma+quadrado;
                
            }
            contadora++;

        } while (contadora < 500);
        System.out.println(soma);
	}
}
