package aula06.pessoa;

public class Pessoa {
	
	String nome;
	private final int cpf = 11111111;
	int telefone;
	String dataNasc;
	String estadoCivil;
	
	public void andar() {
		System.out.println(nome + " está andando...");
	}

	public int getCpf() {
		return cpf;
	}
	
	
	
}
