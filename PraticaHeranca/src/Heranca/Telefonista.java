package Heranca;

public class Telefonista extends Funcionario {
int ramal;
	public Telefonista(String name, float salario,int ramal) {
		super(name, salario);
		this.ramal = ramal;
	}
	public int getRamal() {
		return ramal;
	}
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	
}
