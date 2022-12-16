package manzanoEnquanto;

public class Enquanto4 {
	public static void main(String[] args) {
		int contadora = 0;
		while (contadora < 20) {
			contadora++;
			if (contadora % 2 != 0) {
				System.out.println(contadora);
			}
		}
	}
}
