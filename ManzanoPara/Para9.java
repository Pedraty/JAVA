package manzanoPara;

public class Para9 {
	public static void main(String[] args) {
		int contador = 0;
        int valor1 = 1;
        int valor2 = 1;
        int valor3 = 0;
        
        for(contador = 0; contador < 15; contador++){
            valor3 = valor1+valor2;
            valor1 = valor2;
            valor2 = valor3;
            System.out.println(valor3);
        }
	}
}
