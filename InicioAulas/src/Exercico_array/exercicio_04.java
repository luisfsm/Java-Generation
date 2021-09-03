package Exercico_array;
/*
 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
 */

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0 ;
		final int linhas = 2, colunas = 2;
		double M1[][] = new double[linhas][colunas];
		double M2[][] = new double[linhas][colunas];
		double M3[][] = new double[linhas][colunas];
		
		for(int i = 0 ; i < linhas ; i++) {
			for(int j = 0; j<colunas;j++) {
				System.out.printf("Entre com os valores de M1 : ");
				M1[i][j] = sc.nextDouble();
				System.out.printf("Entre com os valores de M2 : ");
				M2[i][j] = sc.nextDouble();
				
			}
		}
	
		
		System.out.print("Menu de opções : \n1-Somar as matrizes\n2-Subtrair as matrizes\n3-Adicionar constantes \n4-Exibir as duas matrizes");
		System.out.print("Entre com o numero : ");
		op = sc.nextInt();
		switch(op) {
		
		case 1 : 
			for(int i = 0 ; i < linhas ; i++) {
			  for(int j = 0; j<colunas;j++) {
				  M3[i][j] = M1[i][j]+M2[i][j];
				  System.out.println("A soma da M1["+i+"]["+j+"] "+M1[i][j] + " + M2["+i+"]["+j+"] "+M2[i][j]+" = "+M3[i][j]);
			  }
			}
		break;
		case 2 : 
			for(int i = 0 ; i < linhas ; i++) {
				  for(int j = 0; j<colunas;j++) {
					  M3[i][j] = M1[i][j]-M2[i][j];
					  System.out.println("A subtração de M1["+i+"]["+j+"] "+M1[i][j] + " - M2["+i+"]["+j+"] "+M2[i][j]+" = "+M3[i][j]);
				  }
				}
		break;
		
		case 3 : 
			
		break;
		
		case 4 :
			System.out.println("Matriz M1 : ");
			for(int i = 0 ; i < linhas ; i++) {
				for(int j = 0; j<colunas;j++) {
					System.out.print("["+M1[i][j]+"]");
				}
			}
			System.out.println("\nMatriz M2 : ");
			for(int i = 0 ; i < linhas ; i++) {
				for(int j = 0; j<colunas;j++) {
					System.out.print("["+M2[i][j]+"]");
				}
			}
			break;
		}
		
		
		sc.close();
	}

}
