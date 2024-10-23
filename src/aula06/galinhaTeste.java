package aula06;

public class galinhaTeste {

	public static void main(String[] args) {
		
		Galinha galinha1 = new Galinha();
		Galinha galinha2 = new Galinha();
		Galinha galinha3 = new Galinha();
		
		galinha1.nome = "Giselda";
		galinha2.nome = "Matilde";
		galinha3.nome = "Clotilde";
		
		galinha1.botar();
		galinha2.botar();
		galinha2.botar();
		galinha3.botar();
		galinha3.botar();
		galinha3.botar();
		
		System.out.println("Quantidade de ovos da granja: " + Galinha.quantidadeOvosGranja);
	
	}

}
