package Exercicio_if;
import java.util.Scanner;

/*
 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 */

public class exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorDigitado;
		
		System.out.println("Entre com o valor  : ");
		valorDigitado = sc.nextInt();
		
		if(valorDigitado%2==0) {
			System.out.println("O valor digitado � : "+valorDigitado+"  � par.");
			System.out.printf("A ra�z quadrada � : %.2f", Math.sqrt(valorDigitado));
		}else {
			System.out.println("O valor digitado � : "+valorDigitado+" � impar.");
			System.out.printf("O valor ao quadrado do valor � : %.2f",Math.pow(valorDigitado, 2));
		}
		
		sc.close();

	}

}
