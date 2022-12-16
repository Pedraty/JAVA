package manzanoEnquanto;

public class Enquanto8 {

	public static void main(String[] args) {
		int celsius= 0;
        int fahrenheit = 0;
        String frase = "";
        while (celsius<=100){
            celsius = celsius + 10;
            fahrenheit = (9*celsius+160)/5;
            frase = (celsius+"°C é igual à "+fahrenheit+"°F\n");
            System.out.println(frase);
            
        }
	}

}
