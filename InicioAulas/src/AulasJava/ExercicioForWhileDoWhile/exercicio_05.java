package AulasJava.ExercicioForWhileDoWhile;

import java.util.Scanner;

/*
 Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
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
		System.out.println("Essa � a soma dos valores de entrada :"+somaEntrada);
	}

}
