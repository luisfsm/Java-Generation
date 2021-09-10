package AulasJava.Poo_Heranca;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Animal {
	
	private String nome;
	private int idade;
	
		
	private String urlAudio="E:\\\\WORKSPACE\\\\Generation\\\\Java_primeiro_modulo\\\\InicioAulas\\\\src\\\\AulasJava\\\\Poo_Heranca\\\\";
	
	public void EmitirSom(String animal) throws Exception {
		
		String urlFinal =urlAudio; 
		urlFinal = urlFinal+ animal+".wav";
		System.out.println("Escuta o barulho do "+animal);

		File file = new File(urlFinal);
		try {
			Scanner sc = new Scanner(System.in);
			
			
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			
			String response = sc.nextLine();
		   }catch (Exception e) {
			
			e.printStackTrace();
		   } 
		}
	public void deveCorrer() {
		System.out.println("Estou correndo !!!");
	}
	

	
	public void imprimirInfo() {
		System.out.println("O nome do Animal é : "+getNome()+"\nidade do animal : "+getIdade());
	}
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
