package Exercicio_if;

import java.util.Scanner;

/*
 Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
* 10-14 infantil
* 15-17 juvenil
* 18-25 adulto
*/

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Entre com a sua idade : ");
		idade = sc.nextInt();
		
		System.out.printf("Graças a sua idade : %d", idade);
		
		if(idade >=10 && idade <=14) {
			System.out.println(" - Infantil");
		}else if(idade>=15 && idade <= 17) {
			System.out.println(" - Juvenil");
		}else if(idade >=18 && idade <=25) {
			System.out.println(" - Adulto");
		}
		
		sc.close();

	}

}
