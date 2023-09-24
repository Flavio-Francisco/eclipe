package Pratica;

public class Carro {

	private String cor;
	private String modelo;
	private String Marca;
	private int ano;
	private int velocidade;
	
	//construtor
	
	public Carro(){
		cor = null;
		modelo = null;
		Marca = null;
		ano = 120;
		velocidade = 0;
	}
	public Carro( String cor, String modelo, String Marca, int ano, int velocidade){
		this.cor = cor;
		this.modelo = modelo;
		this.Marca = Marca;
		this.ano = ano;
		this.velocidade = velocidade;
	}
	
	public String getCar(){
		return cor;
	}
	public void setCar(String cor){
		this.cor = cor;
	}
	
	void acaelerar(){
		System.out.println("carro acelerou" );
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	void freiar(){
		System.out.println("carro parou");
	}
	
}
