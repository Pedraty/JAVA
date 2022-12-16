package manzanoRepita;

public class Repita1 {
	public static void main(String[] args) {
		 int contadora= 15;
         int quadrado= 0;
         String resultado = "";
         
         do {
             quadrado = contadora*contadora;
             System.out.println(quadrado);
             resultado = ("\n"+quadrado);
             contadora++;

             System.out.println(resultado);
         } while (contadora < 200);
	}
}
