package manzanoEnquanto;

public class Enquanto5 {
	public static void main(String[] args) {
		int contadora= 1;
        int resultado = 1;
        String frase = "";

        
        while (contadora<16){
            resultado = 3*resultado;
            frase = ("3 elevado a "+contadora+" = "+resultado+"\n");
            System.out.println(frase);
            contadora++;
        }
 
	}
}
