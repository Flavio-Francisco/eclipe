package Pratica;

public class Pessoa {

	private String name;
	private String cpf;
	private int idade;
	
	public Pessoa(String name,String cpf,int idade){
		this.name = name;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
		
	
	
}
