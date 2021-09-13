package AulasJava.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class collecoes_list {

	public static void main(String[] args) {
		
		List<String> produtosEmEstoque = new ArrayList<String>();
		
		int op = 0;
		Scanner leia = new Scanner(System.in);
		String entradaTeclado,entradaTeclado2;
		produtosEmEstoque.add("Refrigerante");
		produtosEmEstoque.add("Chocolate");
		produtosEmEstoque.add("Red Bull");
		produtosEmEstoque.add("Vinho");
		
		
		do {
			System.out.println(" 1 - Adicionar ao estoque");
			System.out.println(" 2 - remover do estoque");
			System.out.println(" 3 - Atualizar produto do estoque");
			System.out.println(" 4 - ver o estoque");
			System.out.println(" 0- Deseja sair do sistema ?\n ");
			System.out.print("Digite a opção : ");
			op = leia.nextInt();
			
			switch(op) {
			case 1 :
				System.out.print("Digite o nome do produto : ");
				entradaTeclado = leia.next();
				System.out.println("Adicionado com sucesso!!");
				try {
				 produtosEmEstoque.add(entradaTeclado);
				}catch(Exception e) {
					System.out.println("Erro ao adicionar na lista");
				}
				break;
			case 2 :
				System.out.print("Digite o nome do produto : ");
				entradaTeclado = leia.next();
				if(produtosEmEstoque.contains(entradaTeclado)) {
					produtosEmEstoque.remove(entradaTeclado);
				}
				else {
					System.out.println("Não encontrado");
				}
				break;
			case 3 :
				System.out.print("Digite o nome do produto : ");
				entradaTeclado = leia.next();
				System.out.print("Digite o nome do novo produto : ");
				entradaTeclado2 = leia.next();
				if(produtosEmEstoque.contains(entradaTeclado)) {
					produtosEmEstoque.remove(entradaTeclado);
					produtosEmEstoque.add(entradaTeclado2);
				}else {
					System.out.println("Produto não encontrado");
				}
				break;
			case 4 :
				for(String produto : produtosEmEstoque) {
					System.out.println(produto);
				}
				break;
			case 0 :
				System.out.println("Saindo!!");
				break;
			default :
				System.out.println("opção invalida!!");
				 break;
					
			}
		
			
		}while(op!=0);
		
		
		
		/*List<Integer> minhaLista = new ArrayList<Integer>();

		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(4);
		minhaLista.add(5);
		minhaLista.add(6);
		
		for(Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}
		
		Collections.sort(minhaLista);
		
		System.out.println();
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(3);
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(0);
		meuSet.add(3);
		meuSet.add(2);
		*//*
		Iterator <Integer> imeuSet = meuSet.iterator();
		
		while(imeuSet.hasNext()) {
			System.out.println(imeuSet.next());
		}*/
		leia.close();
	}
}
