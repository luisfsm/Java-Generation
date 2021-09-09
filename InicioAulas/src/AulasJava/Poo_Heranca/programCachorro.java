package AulasJava.Poo_Heranca;


public class programCachorro {

	public static void main(String[] args) throws Exception {
		Cachorro cachorro = new Cachorro("Cachorro de madame",10);
		
		cachorro.imprimirInfo();
		cachorro.EmitirSom("cachorro");
		cachorro.deveCorrer();
	}
	

}
