package AulasJava.ExercicioForWhileDoWhile;

import java.util.Scanner;

/*
 Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
 */


public class exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0, finalIncremento =10;
		int pessoasCalmas =0,mulheresNevorsas =0, homensAgressivos = 0, outrosCalmos = 0,idade =0;
		int pesssosNervosaPos40=0, pessoasCalmasMenos18=0;
		int opSexo =0 , opStatus = 0;
		System.out.println("\tBem vindo ao sistema \t");
		
		while(contador<finalIncremento) {
			System.out.println("Qual a sua idade : ");
			idade = sc.nextInt();
			
			
			System.out.print("Qual o seu sexo ? Digite: 1-Feminino  2-Masculino  3-Outros : ");
			opSexo = sc.nextInt();
			
			while(opSexo!=1 || opSexo!=2 || opSexo!=3) {
				System.out.println("Opção invalida ... ");
				System.out.println("Digite: \n1-Feminino\n2-Masculino\n3-Outros");
				opSexo = sc.nextInt();
				
			}
			
			
			System.out.println("Voce se considera uma pessoa :");
			System.out.println("Digite: \n1-Calma(o)\n2-Nervosa(o)\n3-Agressiva(o)");
			opStatus = sc.nextInt();
			
			if(opStatus==1) {
				pessoasCalmas++;
			}
			if(opSexo==1 && opStatus==2) {
				mulheresNevorsas++;
			}
			if(opSexo==2 && opStatus==3) {
				homensAgressivos++;
			}
			if(opSexo==3 && opStatus ==1) {
				outrosCalmos++;
			}
			if(idade >=40 && opStatus==2) {
				pesssosNervosaPos40++;
			}
			if(idade <=18 && opStatus==1) {
				pessoasCalmasMenos18++;
			}
			contador++;
		}
		sc.close();
		
		System.out.println("Total de pessoas calmas : "+pessoasCalmas);
		System.out.println("Total de mulheres Nervosas : "+mulheresNevorsas);
		System.out.println("Homens Agressivos : "+homensAgressivos);
		System.out.println("Outros calmos : "+outrosCalmos);
		System.out.println("Pessoas mais 40 nervosas : "+pesssosNervosaPos40);
		System.out.println("Pessoas calma com menos de 18 : "+pessoasCalmasMenos18);
	}

}
