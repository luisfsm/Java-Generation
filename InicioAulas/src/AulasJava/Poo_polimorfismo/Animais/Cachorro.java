package AulasJava.Poo_polimorfismo.Animais;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Cachorro  extends Animal {
	
	private String tipo_animal;

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		setTipo_animal("cachorro");
	}

	
	public String getTipo_animal() {
		return tipo_animal;
	}


	public void setTipo_animal(String tipo_animal) {
		this.tipo_animal = tipo_animal;
	}


	public File getResourcesMusic() {

		URL url = getClass().getResource("../musicas/"+getTipo_animal()+".wav");
		String ulrFinal = url.toString().replace("file:/", "").replace("/", "\\");
		File file = new File(ulrFinal);
		return file;
	}
	

	@Override
	public void emitirSom() {
		File som = getResourcesMusic();
		System.out.println("Som emitido pelo "+getTipo_animal()+" : ");
		try {
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(som);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			TimeUnit.SECONDS.sleep(5); //vai executar o audio por 5 segundos
		   }
		catch (Exception e) {
			   e.printStackTrace();
		   } 
	}
	
}
