package manzanoRepita;

public class Repita7 {
	public static void main(String[] args) {
		 int incremento = 0;
         int fatorial = 0;
         int contadora = 2;
         do {
             if (contadora % 2 != 0) {
                 incremento = 1;
                 fatorial = contadora * (contadora - incremento);
                 do {
                     incremento++;
                     fatorial = fatorial * (contadora - incremento);
                 } while ((contadora - incremento) != 1);
                System.out.println("O fatorial de " + contadora + " é " + fatorial);
                 

             }
             contadora++;
         } while (contadora < 10);
	}
}
