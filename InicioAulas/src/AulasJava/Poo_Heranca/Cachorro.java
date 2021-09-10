package AulasJava.Poo_Heranca;


public class Cachorro extends Animal {

	public Cachorro(String nome, int idade ){
		super(nome,idade);
	}
	
	public void deveCorrer() {
		System.out.println("Estou correndo !!!");
	}
}
