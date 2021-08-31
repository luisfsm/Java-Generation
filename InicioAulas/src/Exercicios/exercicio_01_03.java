package Exercicios;

import java.util.Scanner;

public class exercicio_01_03 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int segundos,horas,minutos;
		final int segundosPorHoras  = 3600;
		final int minutosPorHoras = 60;
		System.out.printf("Qual o valor em segundos do evento ? ");
		segundos = sc.nextInt();
		horas = segundos/segundosPorHoras;
		minutos = segundos/minutosPorHoras;
		segundos = (segundos%segundosPorHoras)%minutosPorHoras;
		sc.close();
		System.out.println("O evento possui : "+horas+" hrs \nEm Minutos : "+minutos+" min \nEm segundos : "+segundos+" s");

	}

}
