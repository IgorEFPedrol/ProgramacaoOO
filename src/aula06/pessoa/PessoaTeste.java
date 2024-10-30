package aula06.pessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Igor", 14235859, 99999999, "26/05", "solteiro");
		Pessoa pessoa2 = new Pessoa("Pedro", 9347892, 99888888,"14/01", "solteiro");
		Pessoa pessoa3 = new Pessoa("João", 638572, 99777777,"30/11", "casado");
		
		pessoa1.andar();
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
	}

}
