package Exercicios;

import java.util.Scanner;

public class exercicio_01_01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		final int diaMes = 30;
		final int diasDoAno = 365;
		int idade,meses,dias;
		
		System.out.println("Qual a sua idade : ");
		idade = sc.nextInt();
		System.out.println("Quantos meses : ");
		meses = sc.nextInt();
		System.out.println("Quantos dias  : ");
		dias = sc.nextInt();
		
		dias += (idade*diasDoAno) + (meses*diaMes);
		sc.close();
		
		System.out.printf("Sua idade em dias  %d:", dias);
		

	}

}
