package executavel;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		int qtdeFunc = 0, qtdeHorasTrabalhadas = 0, salarioHora = 20;
		int totalSalario;
		int qtdeCalculo;
		int n200 = 0,n100 = 0,n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0;
		
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Quantos funcionarios vão participar ? ");
	      qtdeFunc = sc.nextInt();      
	      
	     for(int i =0; i<qtdeFunc;i++) {
	    	 System.out.println("Quantas Horas você trabalhou ? ");
	    	 qtdeHorasTrabalhadas += sc.nextDouble();
	     }
	     
	     totalSalario = salarioHora * qtdeHorasTrabalhadas;
	     
	     System.out.println("Valor pago ao total "+totalSalario);
	     
	     
	     
	     while (totalSalario != 0) {
	    	 if (totalSalario >= 200) {
	             n200 = totalSalario / 200;
	             totalSalario = totalSalario % 200;
	         }    	 
	    	 if (totalSalario >= 100) {
	             n100 = totalSalario / 100;
	             totalSalario = totalSalario % 100;
	         } 	else if (totalSalario >= 50) {
	             n50 = totalSalario / 50;
	             totalSalario = totalSalario % 50;
	         } else if (totalSalario >= 20) {
	             n20 = totalSalario / 20;
	             totalSalario = totalSalario % 20;
	         } else if (totalSalario >= 10) {
	             n10 = totalSalario / 10;
	             totalSalario = totalSalario % 10;
	         } else if (totalSalario >= 5) {
	             n5 = totalSalario / 5;
	             totalSalario = totalSalario % 5;
	         } else if (totalSalario >= 2) {
	             n2 = totalSalario / 2;
	             totalSalario = totalSalario % 2;
	         }
	     }
	     
	     System.out.println(n200 + " notas de R$200");
	     System.out.println(n100 + " notas de R$100");
	     System.out.println(n50 + " notas de R$50");
	     System.out.println(n20 + " notas de R$20");
	     System.out.println(n10 + " notas de R$10");
	     System.out.println(n5 + " notas de R$5");
	     System.out.println(n2 + " notas de R$2");
	}

}
