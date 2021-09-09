package Poo_01.ex_002;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		String modeloAviao;
		int capacidadeAviao;
		String linhaArea;
		double pesoBagagem;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o modelo do avião ? ");
		modeloAviao = sc.nextLine();
		
		System.out.printf("Qual a capacidade maxima : ");
		capacidadeAviao = sc.nextInt();
		
		System.out.printf("Qual o valor maximo para as bagagens : ");
		pesoBagagem = sc.nextDouble();
		
		System.out.printf("Qual a companhia area : ");
		linhaArea = sc.next();
		Aviao aviao = new Aviao(modeloAviao,capacidadeAviao,linhaArea,pesoBagagem);

		aviao.imprimir();
		
		
		sc.close();
	}

}
