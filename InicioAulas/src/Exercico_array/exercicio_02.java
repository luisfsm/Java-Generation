package Exercico_array;
/*
2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

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
		
		System.out.println("esse s�o os n�meros pares : ");
		for(int i = 0 ; i < TAMANHO; i++) {
			if(numeros[i]%2==0) {
				System.out.println("numeros["+i+"]="+numeros[i]);
			}
		}
		System.out.println("A soma deles : "+somaPar );
		
		System.out.println("esse s�o os n�meros impares : ");
		for(int i = 0 ; i < TAMANHO; i++) {
			if(numeros[i]%2==1) {
				System.out.println("numeros["+i+"]="+numeros[i]);
			}
		}
		System.out.println("A qtde deles � : "+qtdeImpar);
		
		sc.close();

	}
}
