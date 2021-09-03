package Exercico_array;

import java.util.Scanner;

/*
 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
public class exercicio_03 {

	public static void main(String[] args) {
		final int linhas = 3, colunas = 3;
		int numeros[][] = new int[linhas][colunas];
		int qtdeValoresMaioresdeDez=0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < linhas;i++) {
			for(int j = 0; j < colunas;j++) {
				System.out.printf("Entre com os valores : ");
				numeros[i][j] = sc.nextInt();
				if(numeros[i][j] > 10) {
					qtdeValoresMaioresdeDez++;
				}
			}
		}
		
		System.out.println("Qtde de valores que passaram de dez : "+qtdeValoresMaioresdeDez);
		System.out.println("Siga os valores abaixo : ");
		for(int i = 0; i < linhas;i++) {
			for(int j = 0; j < colunas;j++) {
				if(numeros[i][j] > 10) {
					System.out.println("numeros["+i+"]["+j+"] ="+numeros[i][j]);
				}
			}
		}
		sc.close();
		
	}

}
