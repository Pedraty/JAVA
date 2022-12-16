package manzanoPara;

public class Para4 {
	public static void main(String[] args) {
        int soma = 0;
        for(int numero = 1; numero < 501; numero++){
            if(numero % 2 == 0){
                soma = soma + numero;
            }
        }
        System.out.println(soma);
	}
}
