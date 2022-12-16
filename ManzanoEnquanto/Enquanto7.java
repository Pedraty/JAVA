package manzanoEnquanto;

public class Enquanto7 {

	public static void main(String[] args) {
		int valor1= 1;
        int valor2 = 2;
        int valor3, contadora = 0;
        System.out.println(" 1 \n 1\n 2 ");
        while (contadora<15){
            valor3 = valor1+valor2;
            valor1 = valor2;
            valor2 = valor3;
            System.out.println(" "+valor3);
            contadora++;
        }
		

	}

}
