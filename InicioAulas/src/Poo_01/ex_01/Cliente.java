package Poo_01.ex_01;


//import java.util.List;



//import java.util.ArrayList;

public class Cliente {

	private int idCliente;
	private String nomeCLiente;
	private String dataNascimento;
	private String Endereco;
	private String Telefone;
	//private List<Cliente> Lista;
	
	Cliente(int idCliente,String nomeCLiente,String dataNascimento,String endereco, String Telefone){
		
		setIdCliente(idCliente);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setNomeCLiente(nomeCLiente);
		setTelefone(Telefone);
		
	}

	/*
	public void AdicionarClienteList(Cliente cliente) {
		getLista().add(null);
	}
	
	
	
	public List<Cliente> getLista(){
		if(Lista ==null) {
			Lista = new ArrayList<Cliente>();
		}
		return Lista;
	}
	
	*/
	
	public void imprimirDados() {
		
		System.out.println("Id do client : "+idCliente+
							"\nNomeCLiente :"+nomeCLiente+
							"\nDataNascimento :"+dataNascimento+
							"\nEndereco :"+Endereco+
							"\nTelefone :"+Telefone);
	}


	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCLiente() {
		return nomeCLiente;
	}
	public void setNomeCLiente(String nomeCLiente) {
		this.nomeCLiente = nomeCLiente;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	
	

}
