package AulasJava;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0 ;
		
		System.out.println("\tMenu de Elogios");
		System.out.println("1 - Você é muito linda ");
		System.out.println("2 - Você esta cheiroso ");
		System.out.println("3 - Você é inteligente ");
		System.out.println("4 - Você é exuberante ");
		System.out.println("Digite o numero do seu elogio : ");
		op = sc.nextInt();
		
		sc.close();
		switch(op) {
		case 1 :
			System.out.println("Olha que coisa mais linda, mais cheia de graça");
			break;
		case 2 :
			System.out.println("Uauuuuu que cheiro sensacional , passou old spice ?");
			break;
			
		case 3 : 
			System.out.println("Pessoa o bill gates teria inveja da sua inteligencia");
			break;
			
		case 4 :
			System.out.println("Você mistura todos os elogios vc é incrivel !!!");
			break;
		
		default :
			System.out.println("Perdão... você é um filhote de cruzcredo");
			break;
		}
		
		
		sc.close();
		

	}

}
