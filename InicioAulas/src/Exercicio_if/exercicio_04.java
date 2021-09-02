package Exercicio_if;
import java.util.Scanner;

/*
 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

public class exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorDigitado;
		
		System.out.println("Entre com o valor  : ");
		valorDigitado = sc.nextInt();
		
		if(valorDigitado%2==0) {
			System.out.println("O valor digitado é : "+valorDigitado+"  é par.");
			System.out.printf("A raíz quadrada é : %.2f", Math.sqrt(valorDigitado));
		}else {
			System.out.println("O valor digitado é : "+valorDigitado+" é impar.");
			System.out.printf("O valor ao quadrado do valor é : %.2f",Math.pow(valorDigitado, 2));
		}
		
		sc.close();

	}

}
