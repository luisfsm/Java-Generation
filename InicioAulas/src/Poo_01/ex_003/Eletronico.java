package Poo_01.ex_003;

public class Eletronico {
	
	private boolean ligado = false;
	private String qualAparelho ;
	private String modeloAparelho;
	private String corProduto;
	
	
	public Eletronico(boolean ligado, String qualAparelho, String modeloAparelho, String corProduto) {
		this.ligado = ligado;
		this.qualAparelho = qualAparelho;
		this.modeloAparelho = modeloAparelho;
		this.corProduto = corProduto;
	
	}

	public void imprimir() {
		System.out.println("O aparelho é : "+qualAparelho
				 			+"\nO modelo é: "+modeloAparelho
				 			+"\nA Cor dele é :"+corProduto
				 			+"\nO aparelho esta ligado ? "+ligado);
	}

	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public String getQualAparelho() {
		return qualAparelho;
	}
	public void setQualAparelho(String qualAparelho) {
		this.qualAparelho = qualAparelho;
	}
	public String getModeloAparelho() {
		return modeloAparelho;
	}
	public void setModeloAparelho(String modeloAparelho) {
		this.modeloAparelho = modeloAparelho;
	}
	public String getCorProduto() {
		return corProduto;
	}
	public void setCorProduto(String corProduto) {
		this.corProduto = corProduto;
	}
	
	
	
	

}
