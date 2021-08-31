package Exercicios;

import java.util.Scanner;

public class exercicio_01_04 {

	public static void main(String[] args) {
		int a,b,c ,R,S;
		double D;
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor de A : ");
		 a = sc.nextInt();
		System.out.println("Entre com o valor de B : ");
		 b= sc.nextInt(); 
		System.out.println("Entre com o valor de C : ");
		 c = sc.nextInt();

		R = (a+b)*2;
		S = (b+c)*2;

		D = (R + S)/2;
		sc.close();
		System.out.println(Math.pow(D, 2));

	}

}
