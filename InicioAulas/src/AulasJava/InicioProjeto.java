package AulasJava;

import java.util.Scanner;

class InicioProjeto {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float nota1,nota2,nota3 , media;
		
		System.out.println("Entre com o valor da nota 01 : ");
		nota1 =  sc.nextFloat();
		
		System.out.println("Entre com o valor da nota 02 : ");
		nota2 = sc.nextFloat();
		
		System.out.println("Entre com o valor da nota 03 : ");
		nota3 = sc.nextFloat();
		
		sc.close();
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("O valor da sua média é : %.1f", media);
		
		
	}

}
