package Exercicios;

import java.util.Scanner;

public class exercicio_01_02 {

	public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				int idadeEmDias = 0;
				final int diasMes = 30;
				final int diasDoAno = 365;
				
				int mes , dia;
				System.out.printf("Qual a sua idade em dias ? ");
				 idadeEmDias = sc.nextInt();

				mes = (idadeEmDias%diasDoAno)/30;
				dia = (idadeEmDias%diasDoAno)%30;


				System.out.printf("Sua Idade Atual : %d",idadeEmDias/diasDoAno);
				System.out.printf("\nEm meses : %d",mes);
				System.out.printf("\nEm dias : %d", dia);
	}

}
