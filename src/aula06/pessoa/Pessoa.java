package aula06.pessoa;

public class Pessoa {
	
	String nome;
	int cpf;
	int telefone;
	String dataNasc;
	String estadoCivil;
	
	public Pessoa(String nome, int cpf, int telefone, String dataNasc, String estadoCivil) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.estadoCivil = estadoCivil;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", dataNasc=" + dataNasc
				+ ", estadoCivil=" + estadoCivil + "]";
	}

	public void andar() {
		System.out.println(nome + " está andando...");
	}
	
	
	
}
