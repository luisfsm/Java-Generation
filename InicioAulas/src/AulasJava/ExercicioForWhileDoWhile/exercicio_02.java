package AulasJava.ExercicioForWhileDoWhile;

import java.util.Scanner;

/*
 Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */


public class exercicio_02 {

	public static void main(String[] args) {
		int contPar = 0, contImpar = 0, entradaScanner;
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<10;i++) {
			System.out.println("Entre com "+(i+1)+"º numero :");
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
