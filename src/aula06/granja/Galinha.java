package aula06.granja;

public class Galinha {

	// variáveis de instância 
	String nome;
	int quantidadeOvos;
	
	// variável de classe
	static int quantidadeOvosGranja;
	
	public void botar() {
		quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
