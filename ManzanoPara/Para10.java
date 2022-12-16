package manzanoPara;

public class Para10 {
	public static void main(String[] args) {
		int fahr = 0;
        int celsius = 0;

        for(celsius = 10; celsius < 101; celsius = celsius +10){
            fahr = (9*celsius+160)/5;
            System.out.println(celsius+"°C = "+fahr+"°F");
        }
	}
}
