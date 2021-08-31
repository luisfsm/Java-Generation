package Exercicios;

import java.util.Scanner;

public class exercicio_01_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1,y1,x2,y2, resultado;

		System.out.println("Entre com o valor do eixo x1 : ");
		x1 = sc.nextDouble();
		System.out.println("Entre com o valor do eixo y1 : ");
		y1 =  sc.nextDouble();
		System.out.println("Entre com o valor do eixo x2 : ");
		x2 = sc.nextDouble();
		System.out.println("Entre com o valor do eixo y2 : ");
		y2 = sc.nextDouble();
		resultado =  Math.sqrt((Math.pow((x2-x1), 2.0) + Math.pow((y2-y1),2.0)));

		System.out.printf("A distância entre eles é : %.2f",resultado);

	}

}
