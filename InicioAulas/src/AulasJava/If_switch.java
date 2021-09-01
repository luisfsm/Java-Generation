package AulasJava;

import java.util.Scanner;

public class If_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double notas1,notas2,notas3 , media ;
		
		System.out.println("Entre com a primeira nota : ");
		notas1 = sc.nextDouble();
		
		System.out.println("Entre com a segunda nota : ");
		notas2 = sc.nextDouble();
		
		System.out.println("Entre com a terceira nota  : ");
		notas3 = sc.nextDouble();
		
		media = (notas1 + notas2+notas3) / 3;
		
		sc.close();
		if(media >= 7.0 && media <= 10) {
			System.out.printf("Aluno aprovado com a média : %.1f",media);
		} else if(media>=5 && media<=10) {
			System.out.println("Estas de recuperacao");
		}
		
		else {
			System.out.printf("Aluno reprovado com a média : %.1f",media);
		}
				

	}

}
