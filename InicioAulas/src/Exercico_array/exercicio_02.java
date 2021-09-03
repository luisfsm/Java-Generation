package Exercico_array;
/*
2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

 */

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		
		final int TAMANHO = 6;
		int numeros[] = new int[TAMANHO];
		int somaPar = 0, qtdeImpar = 0;
		Scanner sc = new Scanner(System.in);
	
		for(int i = 0; i < TAMANHO ; i++) {
			System.out.print("Entre com um numero : ");
			numeros[i] = sc.nextInt();
			if(numeros[i]%2==0) {
				somaPar+=numeros[i];
			}else {
				qtdeImpar++;
			}
		}
		
		System.out.println("esse são os números pares : ");
		for(int i = 0 ; i < TAMANHO; i++) {
			if(numeros[i]%2==0) {
				System.out.println("numeros["+i+"]="+numeros[i]);
			}
		}
		System.out.println("A soma deles : "+somaPar );
		
		System.out.println("esse são os números impares : ");
		for(int i = 0 ; i < TAMANHO; i++) {
			if(numeros[i]%2==1) {
				System.out.println("numeros["+i+"]="+numeros[i]);
			}
		}
		System.out.println("A qtde deles é : "+qtdeImpar);
		
		sc.close();

	}
}
