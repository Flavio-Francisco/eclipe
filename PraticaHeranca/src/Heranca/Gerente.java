package Heranca;

public class Gerente extends Funcionario{
	String login;
	int senha;
	
	public Gerente(String name, float salario,String login,int senha) {
		super(name = name, salario = salario );
			this.login = login;
			this.senha = senha;
		
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	


}
