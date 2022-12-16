package manzanoRepita;

public class Repita4 {
	public static void main(String[] args) {
		long graos= 1;
        long soma = 0;
        long quadro = 1;
        do {
            
            graos = graos*2;
            
            soma = soma + graos;

            quadro++;


        } while (quadro != 63);
        System.out.println(soma);
	}
}
