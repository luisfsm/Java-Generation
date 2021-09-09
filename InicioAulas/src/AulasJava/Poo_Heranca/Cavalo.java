package AulasJava.Poo_Heranca;


public class Cavalo extends Animal {

	
	Cavalo(String nome, int idade){
		super(nome,idade);
		
	}
	public void deveCorrer() {
		System.out.println("Estou correndo !!!");
	}
}
