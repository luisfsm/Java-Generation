package Exercicio_if;
import java.util.Scanner;
/*
 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */


public class exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor1,valor2,valor3;
		System.out.println("Entre com o primeiro valor : ");
		valor1 = sc.nextInt();
		System.out.println("Entre com o segundo valor : ");
		valor2 = sc.nextInt();
		System.out.println("Entre com o terceiro valor : ");
		valor3 = sc.nextInt();
		
		sc.close();
		if(valor1>valor2 && valor1>valor3) {
			System.out.printf("O primeiro valor � o maior : %d", valor1);
		}else if(valor2>valor1 && valor2>valor3) {
			System.out.printf("O Segundo valor � o maior : %d",valor2);
		}else {
			System.out.printf("O terceiro valor � o maior : %d", valor3);
		}

	}

}
