package AulasJava.Poo_Heranca;


public class programPreguica {

	public static void main(String[] args) throws Exception {
		Preguica preguica = new Preguica("Sid",120);
		
		preguica.imprimirInfo();
		preguica.SubirArvores();
		System.out.println("Essa preguiça e especial e o SID era do gelo :)");
		preguica.EmitirSom("preguica");

		
	}
	

}
