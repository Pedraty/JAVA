package faccat;

import java.util.*;  

public class Placar {

	public static void main(String[] args) {
		int golsA, golsB;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome de uma das seleções que jogaram:");
		String timeA = sc.nextLine();
		
		System.out.println("Digite o nome da outra seleção:");
		String timeB = sc.nextLine();
		
		System.out.println(timeA+" gols marcados:");
		golsA = sc.nextInt();
				
		System.out.println(timeB+" gols marcados:");
		golsB = sc.nextInt();
		sc.close();
		
		if (golsA>golsB) {
			System.out.println(timeA+" venceu de "+golsA+" a "+golsB);
		}else if(golsA<golsB){
			System.out.println(timeB+" venceu de "+golsB+" a "+golsA);
			
		}else {
			System.out.println("Empate");
		}
	}
	}
