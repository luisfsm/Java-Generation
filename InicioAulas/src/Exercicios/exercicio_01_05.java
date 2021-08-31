package Exercicios;

import java.util.Scanner;

public class exercicio_01_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1,nota2,nota3 , media;
		
		System.out.println("Entre com o valor da nota 01 : ");
		nota1 =  sc.nextDouble();
		
		System.out.println("Entre com o valor da nota 02 : ");
		nota2 = sc.nextDouble();
		
		System.out.println("Entre com o valor da nota 03 : ");
		nota3 = sc.nextDouble();
		
		sc.close();
		media = (nota1*0.2) + (nota2*0.3) + (nota3*0.5);
		
		System.out.printf("O valor da sua média é : %.1f", media);
		

	}

}
