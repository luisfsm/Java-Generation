package Exercicios;

import java.util.Scanner;

public class exercicio_01_08 {

	public static void main(String[] args) {
		
		double custoConsumidor,custoFabrica,custoDistribuidor, resultado = 0.0;
		final double valorCustoDistribuidor = 0.28;
		final double valorCustoImposto = 0.45;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o custo de fabricação do carro ? ");
		custoFabrica = sc.nextDouble();

		resultado += custoFabrica;
		resultado += custoFabrica * valorCustoDistribuidor;
		resultado += custoFabrica * valorCustoImposto;

		System.out.printf("o Custo final ao consumidor é : %.2f",resultado,2);

	}

}
