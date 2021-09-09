package Poo_01.ex_002;

public class Aviao {

	private String modeloAviao;
	private int capacidadeAviao;
	private String linhaArea;
	private double pesoBagagem;
	
	
	
	
	
	public Aviao(String modeloAviao, int capacidadeAviao, String linhaArea, double pesoBagagem) {
		this.modeloAviao = modeloAviao;
		this.capacidadeAviao = capacidadeAviao;
		this.linhaArea = linhaArea;
		this.pesoBagagem = pesoBagagem;
	}
	
	
	
	public void imprimir() {
		System.out.println("Aviao [modeloAviao=" + modeloAviao + ", capacidadeAviao=" + capacidadeAviao + ", linhaArea=" + linhaArea
				+ ", pesoBagagem=" + pesoBagagem + "]");
	}


	public String getModeloAviao() {
		return modeloAviao;
	}
	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}
	public int getCapacidadeAviao() {
		return capacidadeAviao;
	}
	public void setCapacidadeAviao(int capacidadeAviao) {
		this.capacidadeAviao = capacidadeAviao;
	}
	public String getLinhaArea() {
		return linhaArea;
	}
	public void setLinhaArea(String linhaArea) {
		this.linhaArea = linhaArea;
	}
	public double getPesoBagagem() {
		return pesoBagagem;
	}
	public void setPesoBagagem(double pesoBagagem) {
		this.pesoBagagem = pesoBagagem;
	}
	
	
	
}
