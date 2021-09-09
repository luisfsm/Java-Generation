package AulasJava.Poo_Heranca;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade ){
		super(nome,idade);
	}
	
/*
	public void EmitirSom() throws Exception {
		
		System.out.println("Escuta o barulho do cachorro");

		File file = new File(urlAudio);
		try {
			Scanner sc = new Scanner(System.in);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			
			String response = sc.next();
		   }catch (Exception e) {
			
			e.printStackTrace();
		   } 
		}*/
	public void deveCorrer() {
		System.out.println("Estou correndo !!!");
	}
}
