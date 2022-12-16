package faccat;

//Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio
//da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA

import java.util.Scanner;

public class Caixa {
     public static void main (String []args){
          float comprimento, largura, altura, volume;

           Scanner sc = new   Scanner(System.in);
           System.out.println("Digite o comprimento da caixa:");
             comprimento = sc.nextFloat();
            System.out.println("Digite a largura da caixa:");
     largura = sc.nextFloat();
     System.out.println("Digite a altura da caixa:");
     altura = sc.nextFloat();  
     sc.close();
     volume = comprimento*largura*altura;
     System.out.println("O volume da caixa é de "+volume+"m³");
     




}




}
