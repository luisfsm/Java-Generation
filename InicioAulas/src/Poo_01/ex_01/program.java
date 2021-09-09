package Poo_01.ex_01;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		int idCliente;
		String nomeCliente;
		String dataNascimento;
		String Endereco;
		String Telefone;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu id ? ");
		idCliente = sc.nextInt();
		
		System.out.println("Qual seu nome :");
		nomeCliente = sc.next();
		System.out.println("Data de nascimento :");
		dataNascimento = sc.next();
		
		System.out.println("Qual seu Endereco :");
		Endereco = sc.next();
		
		System.out.println("Qual seu Telefone :");
		Telefone = sc.next();
		
		Cliente cliente = new Cliente(idCliente,nomeCliente,dataNascimento,Endereco,Telefone);
		
		cliente.imprimirDados();
		
		sc.close();
	}

}
