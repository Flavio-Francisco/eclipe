package Pratica;

public class TesteCarro {

	public static void main(String[] args) {
		
	Carro  carro1 = new Carro();
	Carro  carro2 = new Carro("branco","fusca","velho",1970,180);
	
	carro1.setCar("preto");
	carro1.setModelo( "onix");
	carro1.setModelo("crevolet");
	carro1.setVelocidade(120); 
	carro1.setAno(2023);
	
	
	
	carro1.acaelerar();
	carro1.freiar();

	System.out.println("velocidade do carro é: "+ carro1.getVelocidade());
	System.out.println("velocidade do carro é: "+ carro2.getVelocidade());
	}

}
