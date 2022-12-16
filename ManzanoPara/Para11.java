package manzanoPara;

public class Para11 {
	public static void main(String[] args) {
		int contadora = 0;
        int numero = 0;
        int fatorial = 0;
        int incremento = 0;

        for(numero = 1; numero < 11; numero++){
            incremento = 1;
            contadora = (numero-incremento);
            if ((contadora>1)&& (numero % 2 != 0)){
                fatorial = numero*(numero-incremento);
                for(incremento = 2; incremento < (numero-1); incremento++ ){
                    fatorial = fatorial*(numero-incremento);

                }
                System.out.println(numero+" fatorial é "+fatorial);
            }
            
        }
	}
}
