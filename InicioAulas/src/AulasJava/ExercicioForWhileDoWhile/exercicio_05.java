package AulasJava.ExercicioForWhileDoWhile;

import java.util.Scanner;

/*
 Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */


public class exercicio_05 {

	public static void main(String[] args) {
		int entradaValor = 0, somaEntrada = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Entre com o valor numerico : ");
			entradaValor = sc.nextInt();
			
			somaEntrada += entradaValor;
			
			
		}while(entradaValor !=0);
		sc.close();
		System.out.println("Essa é a soma dos valores de entrada :"+somaEntrada);
	}

}
