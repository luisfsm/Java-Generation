package AulasJava.ExercicioForWhileDoWhile;

import java.util.Scanner;

/*
 Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */
public class exercicio_06 {

	public static void main(String[] args) {
		int qtdeEntrada = 0 , qtdeMultiPorTres = 0, valorEntrada =0;
		Double mediaDeMultiPorTres=0.0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Entre com os numeros : ");
			valorEntrada = sc.nextInt();
			if(valorEntrada%3==0) {
				qtdeMultiPorTres++;
			}
			
			qtdeEntrada++;
		}while(valorEntrada !=0);
		
		mediaDeMultiPorTres = (double) (qtdeMultiPorTres*100)/qtdeEntrada;
		System.out.println("Total de entradas : "+qtdeEntrada);
		System.out.println("Qtde de multiplo por 3 :"+qtdeMultiPorTres);
		System.out.printf("A media de entrada é : %.1f",mediaDeMultiPorTres);		
		sc.close();
	}

}
