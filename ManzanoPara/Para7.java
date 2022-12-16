package manzanoPara;

public class Para7 {
	public static void main(String[] args) {
        int resultado = 0;
        for(int numero = 0; numero < 15; numero++){
            resultado = resultado*3;
            if(numero == 0){
                resultado = resultado+1;
                System.out.println("3 elevado a "+numero+" é "+1);
            }else{
            	System.out.println("3 elevado a "+numero+" é "+resultado);
            }
        }
	}
}
