package aula07.carro;

public class Carro {

	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	int velocidade;
	boolean ligado;
	
	public Carro(String modelo, String marca, int ano, String placa, String cor) {
		
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
	    this.velocidade = 0;
		this.ligado = false;
	}
	
	public void imprimirAtributos() {
		System.out.printf("%s %s %d %s %s", modelo, marca, ano, placa, cor);
	}


}
