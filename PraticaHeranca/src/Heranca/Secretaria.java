package Heranca;

public class Secretaria extends Funcionario {
int codigo;
	public Secretaria(String name, float salario,int codigo) {
		super(name = name, salario = salario);
		this.codigo = codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
}
