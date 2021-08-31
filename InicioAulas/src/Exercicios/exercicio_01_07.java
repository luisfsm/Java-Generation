package Exercicios;

import java.util.Scanner;

public class exercicio_01_07 {

	public static void main(String[] args) {
		double a,b,c,d,e_,f,x,y;
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor de a : ");
		 a = sc.nextDouble();
		System.out.println("Entre com o valor de b : ");
		 b = sc.nextDouble();
		System.out.println("Entre com o valor de c : ");
		 c = sc.nextDouble();
		System.out.println("Entre com o valor de d : ");
		 d = sc.nextDouble();
		System.out.println("Entre com o valor de e : ");
		 e_ = sc.nextDouble();
		System.out.println("Entre com o valor de f :");
		 f = sc.nextDouble();
		
		x = ((c*e_)-(b*f)/(a*e_)-(b*d));
		y = ((a*f)-(c*d)/(a*e_)-(b*d));
		System.out.printf("O valor de X : %.2f",x);
		System.out.printf("\nO valor de Y : %.2f",y);

	}

}
