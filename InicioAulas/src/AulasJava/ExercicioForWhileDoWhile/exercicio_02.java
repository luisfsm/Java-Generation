package AulasJava.ExercicioForWhileDoWhile;

import java.util.Scanner;

/*
 Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */


public class exercicio_02 {

	public static void main(String[] args) {
		int contPar = 0, contImpar = 0, entradaScanner;
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<10;i++) {
			System.out.println("Entre com "+(i+1)+"� numero :");
			entradaScanner = sc.nextInt();
			
			if(entradaScanner%2==0) {
				contPar++;
			}else {
				contImpar++;
			}
		}
		System.out.println("Qtde de impar : "+contImpar+"\nQtde de par :"+contPar);

	}

}
