package AulasJava.ExercicioForWhileDoWhile;

import java.util.Scanner;

/*
 Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */

public class exercicio_03 {

	public static void main(String[] args) {
		int idade = 0, idadeMenor21 = 0, idadeMaior50 = 0, idadeMediana =0, qtdePessoasPesquisa =0;
		Scanner sc = new Scanner(System.in);
		while(idade !=-99) {
			System.out.println("Entre com a idade : ");
			idade = sc.nextInt();
			
			if(idade<=21) {
				idadeMenor21++;
			}else if(idade>=50) {
				idadeMaior50++;
			}else if(idade>21 && idade <50) {
				idadeMediana++;
			}
			
			qtdePessoasPesquisa++;
			
			System.out.println("Caso desejar sair digite : -99, caso deseje continuar digite: 0 ");
			idade = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Pessoas com menos de 21 anos :"+idadeMenor21+"\nPessoas maior de 50 anos :"+idadeMaior50);
		System.out.println("Total de pessoas na pesquisa : "+qtdePessoasPesquisa+"\nPessoas foras da metrica :"+idadeMediana);

	}

}
