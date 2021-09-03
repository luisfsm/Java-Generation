package Exercico_array;
/*
 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
 O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.

 */

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		int A[] = { 1, 0, 5, -2, -5, 7};
		int somaVetor=0;
		Scanner sc = new Scanner(System.in);
		
		A[4] = 100;
		System.out.println("Os valores dentro da Matriz :  ");
		for(int i = 0 ; i < A.length;i++) {
			System.out.println("A["+i+"] = "+A[i]);
			if(i==0 || i==1 || i==5) {
				somaVetor += A[i];
			}
		}
		
		System.out.println("A soma dos vetores A[0], A[1] e A[5] = "+somaVetor);
		sc.close();
	}

}
