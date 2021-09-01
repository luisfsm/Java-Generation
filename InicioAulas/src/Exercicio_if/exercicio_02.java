package Exercicio_if;

import java.util.Scanner;

/*
 2- Faça um programa que entre com três números e coloque em ordem crescente.
 */

public class exercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1,valor2,valor3, aux;
		System.out.println("Entre com o primeiro valor : ");
		valor1 = sc.nextInt();
		System.out.println("Entre com o segundo valor : ");
		valor2 = sc.nextInt();
		System.out.println("Entre com o terceiro valor : ");
		valor3 = sc.nextInt();
		
		if(valor2<valor1) {
			aux = valor2;
			valor2 = valor1;
			valor1 = aux;
		}
		if(valor3<valor2) {
			aux = valor3;
			valor3 = valor2;
			valor2 = aux; 
			if(valor2<valor1) {
				aux = valor2;
				valor2 = valor1;
				valor1 = aux;
			}
		}
		
		System.out.println(valor1+" "+valor2+" "+valor3);
		sc.close();
	}

}
