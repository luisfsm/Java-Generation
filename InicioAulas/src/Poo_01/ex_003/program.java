package Poo_01.ex_003;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		boolean ligado;
		String qualAparelho ;
		String modeloAparelho;
		String corProduto;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("O aparelho esta ligado ? 0 - desligado  1-Ligaddo : ");
		ligado = sc.hasNext();
		
		System.out.print("Qual aparelho é ? ");
		qualAparelho = sc.nextLine();
		System.out.printf("");
		
		System.out.print("Qual o modelo ? ");
		modeloAparelho = sc.nextLine();
		System.out.printf("");
		
		System.out.print("Qual a cor ? ");
		corProduto = sc.nextLine();
		System.out.println("\n");
		Eletronico eletronico = new Eletronico(ligado,qualAparelho,modeloAparelho,corProduto);
		
		eletronico.imprimir();
		sc.close();
		
		

	}

}
